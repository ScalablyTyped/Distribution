package typings.wordpressData

import typings.wordpressData.buildTypesPluginsPersistenceMod.WPDataPersistencePluginOptions
import typings.wordpressData.buildTypesPluginsPersistenceMod.WPDataPlugin
import typings.wordpressData.buildTypesPluginsPersistenceMod.WPDataRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesPluginsMod {
  
  object persistence {
    
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
    
    @JSImport("@wordpress/data/build-types/plugins", "persistence")
    @js.native
    val ^ : js.Any = js.native
    
    inline def unstableMigrate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__unstableMigrate")().asInstanceOf[Unit]
  }
}
