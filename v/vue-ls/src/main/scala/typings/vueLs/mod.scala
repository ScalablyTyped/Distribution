package typings.vueLs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-ls", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginObject<Options> */ Any = js.native
  
  @js.native
  sealed trait Types extends StObject
  @JSImport("vue-ls", "Types")
  @js.native
  object Types extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Types & String] = js.native
    
    @js.native
    sealed trait Local
      extends StObject
         with Types
    /* "local" */ val Local: typings.vueLs.mod.Types.Local & String = js.native
    
    @js.native
    sealed trait Memory
      extends StObject
         with Types
    /* "memory" */ val Memory: typings.vueLs.mod.Types.Memory & String = js.native
    
    @js.native
    sealed trait Session
      extends StObject
         with Types
    /* "session" */ val Session: typings.vueLs.mod.Types.Session & String = js.native
  }
  
  @JSImport("vue-ls", "WebStorage")
  @js.native
  open class WebStorage protected () extends StObject {
    def this(storage: Types) = this()
    
    def clear(): Unit = js.native
    
    def get(name: String): Any = js.native
    def get(name: String, `def`: Any): Any = js.native
    
    def key(index: Double): String | Null = js.native
    
    var length: Double = js.native
    
    def off(name: String, callback: js.Function0[Unit]): Unit = js.native
    
    def on(name: String, callback: js.Function0[Unit]): Unit = js.native
    
    def remove(name: String): Unit = js.native
    
    def set(name: String, value: Any): Unit = js.native
    def set(name: String, value: Any, expire: Double): Unit = js.native
    
    def setOptions(): Unit = js.native
    def setOptions(options: Options): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var storage: js.UndefOr[Types] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setStorage(value: Types): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginObject<Options> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginObject<Options> */ Any = default
  
  /* augmented module */
  object vueTypesVueAugmentingMod {
    
    trait Vue extends StObject {
      
      @JSName("$ls")
      var $ls: WebStorage
    }
    object Vue {
      
      inline def apply($ls: WebStorage): Vue = {
        val __obj = js.Dynamic.literal($ls = $ls.asInstanceOf[js.Any])
        __obj.asInstanceOf[Vue]
      }
      
      extension [Self <: Vue](x: Self) {
        
        inline def set$ls(value: WebStorage): Self = StObject.set(x, "$ls", value.asInstanceOf[js.Any])
      }
    }
    
    trait VueConstructor extends StObject {
      
      var ls: WebStorage
    }
    object VueConstructor {
      
      inline def apply(ls: WebStorage): VueConstructor = {
        val __obj = js.Dynamic.literal(ls = ls.asInstanceOf[js.Any])
        __obj.asInstanceOf[VueConstructor]
      }
      
      extension [Self <: VueConstructor](x: Self) {
        
        inline def setLs(value: WebStorage): Self = StObject.set(x, "ls", value.asInstanceOf[js.Any])
      }
    }
  }
}
