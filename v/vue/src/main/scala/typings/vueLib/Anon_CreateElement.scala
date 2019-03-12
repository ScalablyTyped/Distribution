package typings
package vueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateElement extends js.Object {
  var staticRenderFns: js.Array[js.Function0[vueLib.typesVnodeMod.VNode]]
  def render(createElement: vueLib.typesVueMod.CreateElement): vueLib.typesVnodeMod.VNode
}

object Anon_CreateElement {
  @scala.inline
  def apply(
    render: vueLib.typesVueMod.CreateElement => vueLib.typesVnodeMod.VNode,
    staticRenderFns: js.Array[js.Function0[vueLib.typesVnodeMod.VNode]]
  ): Anon_CreateElement = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), staticRenderFns = staticRenderFns)
  
    __obj.asInstanceOf[Anon_CreateElement]
  }
}

