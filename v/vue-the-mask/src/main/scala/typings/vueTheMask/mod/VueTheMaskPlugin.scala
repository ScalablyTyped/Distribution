package typings.vueTheMask.mod

import typings.std.HTMLElement
import typings.vue.optionsMod.Component
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.DirectiveBinding
import typings.vue.optionsMod.DirectiveFunction
import typings.vue.pluginMod.PluginObject
import typings.vue.vnodeMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTheMaskPlugin
  extends PluginObject[js.UndefOr[scala.Nothing]] {
  var TheMask: Component[
    DefaultData[scala.Nothing], 
    DefaultMethods[scala.Nothing], 
    DefaultComputed, 
    DefaultProps
  ] = js.native
  @JSName("mask")
  var mask_Original: DirectiveFunction = js.native
  def mask(el: HTMLElement, binding: DirectiveBinding, vnode: VNode, oldVnode: VNode): Unit = js.native
}

@JSImport("vue-the-mask", "VueTheMaskPlugin")
@js.native
object VueTheMaskPlugin extends js.Object {
  type VueStatic = js.Function0[Unit]
}

