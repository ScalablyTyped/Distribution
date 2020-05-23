package typings.vueChartkick

import typings.vue.pluginMod.PluginObject
import typings.vueChartkick.anon.Adapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-chartkick", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait VueChartkickPlugin extends PluginObject[Adapter] {
    var version: String = js.native
    def addAdapter(library: js.Any): Unit = js.native
  }
  
  val default: VueChartkickPlugin = js.native
}

