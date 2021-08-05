package typings.vueChartkick

import org.scalablytyped.runtime.Shortcut
import typings.vue.pluginMod.PluginObject
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueChartkick.anon.Adapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-chartkick", JSImport.Default)
  @js.native
  val default: VueChartkickPlugin = js.native
  
  trait VueChartkickPlugin
    extends StObject
       with PluginObject[Adapter] {
    
    def addAdapter(library: js.Any): Unit
    
    var version: String
  }
  object VueChartkickPlugin {
    
    inline def apply(
      addAdapter: js.Any => Unit,
      install: (/* Vue */ VueConstructor[Vue], /* options */ js.UndefOr[Adapter]) => Unit,
      version: String
    ): VueChartkickPlugin = {
      val __obj = js.Dynamic.literal(addAdapter = js.Any.fromFunction1(addAdapter), install = js.Any.fromFunction2(install), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueChartkickPlugin]
    }
    
    extension [Self <: VueChartkickPlugin](x: Self) {
      
      inline def setAddAdapter(value: js.Any => Unit): Self = StObject.set(x, "addAdapter", js.Any.fromFunction1(value))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = VueChartkickPlugin
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueChartkickPlugin = default
}
