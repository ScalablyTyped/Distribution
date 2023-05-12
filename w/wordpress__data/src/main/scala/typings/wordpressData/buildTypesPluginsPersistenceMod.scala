package typings.wordpressData

import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesPluginsPersistenceMod {
  
  @JSImport("@wordpress/data/build-types/plugins/persistence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    /**
      * Data plugin to persist store state into a single storage key.
      *
      * @param {WPDataRegistry}                  registry      Data registry.
      * @param {?WPDataPersistencePluginOptions} pluginOptions Plugin options.
      *
      * @return {WPDataPlugin} Data plugin.
      */
    inline def apply(registry: WPDataRegistry): WPDataPlugin = ^.asInstanceOf[js.Dynamic].apply(registry.asInstanceOf[js.Any]).asInstanceOf[WPDataPlugin]
    inline def apply(registry: WPDataRegistry, pluginOptions: WPDataPersistencePluginOptions): WPDataPlugin = (^.asInstanceOf[js.Dynamic].apply(registry.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any])).asInstanceOf[WPDataPlugin]
    
    @JSImport("@wordpress/data/build-types/plugins/persistence", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def unstableMigrate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__unstableMigrate")().asInstanceOf[Unit]
  }
  
  inline def createPersistenceInterface(options: WPDataPersistencePluginOptions): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("createPersistenceInterface")(options.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def withLazySameState(reducer: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("withLazySameState")(reducer.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  trait WPDataPersistencePluginOptions extends StObject {
    
    /**
      * Persistent storage implementation. This must
      * at least implement `getItem` and `setItem` of
      * the Web Storage API.
      */
    var storage: Storage
    
    /**
      * Key on which to set in persistent storage.
      */
    var storageKey: String
  }
  object WPDataPersistencePluginOptions {
    
    inline def apply(storage: Storage, storageKey: String): WPDataPersistencePluginOptions = {
      val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any], storageKey = storageKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[WPDataPersistencePluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WPDataPersistencePluginOptions] (val x: Self) extends AnyVal {
      
      inline def setStorage(value: Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    }
  }
  
  type WPDataPlugin = typings.wordpressData.buildTypesRegistryMod.WPDataPlugin
  
  type WPDataRegistry = typings.wordpressData.buildTypesRegistryMod.WPDataRegistry
}
