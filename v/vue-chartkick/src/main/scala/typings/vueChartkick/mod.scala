package typings.vueChartkick

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-chartkick", JSImport.Default)
  @js.native
  val default: VueChartkickPlugin = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginObject<{  adapter :any}> * / any */ trait VueChartkickPlugin extends StObject {
    
    def addAdapter(library: Any): Unit
    
    var version: String
  }
  object VueChartkickPlugin {
    
    inline def apply(addAdapter: Any => Unit, version: String): VueChartkickPlugin = {
      val __obj = js.Dynamic.literal(addAdapter = js.Any.fromFunction1(addAdapter), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueChartkickPlugin]
    }
    
    extension [Self <: VueChartkickPlugin](x: Self) {
      
      inline def setAddAdapter(value: Any => Unit): Self = StObject.set(x, "addAdapter", js.Any.fromFunction1(value))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = VueChartkickPlugin
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueChartkickPlugin = default
}
