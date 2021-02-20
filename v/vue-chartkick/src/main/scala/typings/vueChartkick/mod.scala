package typings.vueChartkick

import org.scalablytyped.runtime.Shortcut
import typings.vue.pluginMod.PluginObject
import typings.vueChartkick.anon.Adapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-chartkick", JSImport.Default)
  @js.native
  val default: VueChartkickPlugin = js.native
  
  @js.native
  trait VueChartkickPlugin extends PluginObject[Adapter] {
    
    def addAdapter(library: js.Any): Unit = js.native
    
    var version: String = js.native
  }
  
  type _To = VueChartkickPlugin
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueChartkickPlugin = default
}
