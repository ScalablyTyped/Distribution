package typings.vueTemplateCompiler.mod

import typings.vue.vnodeMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompiledResultFunctions extends js.Object {
  var staticRenderFns: js.Array[js.Function0[VNode]]
  def render(): VNode
}

object CompiledResultFunctions {
  @scala.inline
  def apply(render: () => VNode, staticRenderFns: js.Array[js.Function0[VNode]]): CompiledResultFunctions = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render), staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledResultFunctions]
  }
}

