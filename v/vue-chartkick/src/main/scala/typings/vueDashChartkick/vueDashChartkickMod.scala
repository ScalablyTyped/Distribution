package typings.vueDashChartkick

import typings.vue.typesPluginMod.PluginObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-chartkick", JSImport.Namespace)
@js.native
object vueDashChartkickMod extends js.Object {
  @js.native
  trait VueChartkickPlugin extends PluginObject[Anon_Adapter] {
    var version: String = js.native
    def addAdapter(library: js.Any): Unit = js.native
  }
  
  val default: VueChartkickPlugin = js.native
}

