package typings.vueDashTheDashMask.vueDashTheDashMaskMod

import typings.std.HTMLElement
import typings.vue.typesOptionsMod.Component
import typings.vue.typesOptionsMod.DefaultComputed
import typings.vue.typesOptionsMod.DefaultData
import typings.vue.typesOptionsMod.DefaultMethods
import typings.vue.typesOptionsMod.DefaultProps
import typings.vue.typesOptionsMod.DirectiveBinding
import typings.vue.typesOptionsMod.DirectiveFunction
import typings.vue.typesPluginMod.PluginObject
import typings.vue.typesVnodeMod.VNode
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

