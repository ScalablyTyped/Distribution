package typings.vueChartkick

import typings.vue.pluginMod.PluginObject
import typings.vueChartkick.anon.Adapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-chartkick", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val default: VueChartkickPlugin = js.native
  
  @js.native
  trait VueChartkickPlugin extends PluginObject[Adapter] {
    
    def addAdapter(library: js.Any): Unit = js.native
    
    var version: String = js.native
  }
}
