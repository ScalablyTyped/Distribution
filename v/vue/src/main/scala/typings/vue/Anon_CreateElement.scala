package typings.vue

import typings.vue.typesVnodeMod.VNode
import typings.vue.typesVueMod.CreateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateElement extends js.Object {
  var staticRenderFns: js.Array[js.Function0[VNode]]
  def render(createElement: CreateElement): VNode
}

object Anon_CreateElement {
  @scala.inline
  def apply(render: CreateElement => VNode, staticRenderFns: js.Array[js.Function0[VNode]]): Anon_CreateElement = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), staticRenderFns = staticRenderFns)
  
    __obj.asInstanceOf[Anon_CreateElement]
  }
}

