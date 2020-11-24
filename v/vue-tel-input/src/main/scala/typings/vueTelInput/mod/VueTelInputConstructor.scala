package typings.vueTelInput.mod

import typings.vue.pluginMod.PluginFunction
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueTelInputConstructor extends VueConstructor[Vue] {
  
  var computed: VueTelInputComputed = js.native
  
  def data(): VueTelInputData = js.native
  
  var directives: VueTelInputDirective = js.native
  
  def install(Vue: VueConstructor[Vue]): Unit = js.native
  def install(Vue: VueConstructor[Vue], options: scala.Nothing): Unit = js.native
  @JSName("install")
  var install_Original: PluginFunction[scala.Nothing] = js.native
  
  var methods: VueTelInputMethods = js.native
  
  var props: VueTelInputProps = js.native
  
  var watch: VueTelInputWatch = js.native
}
