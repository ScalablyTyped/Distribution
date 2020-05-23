package typings.vue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Render extends js.Object {
  var render: js.Function
  var staticRenderFns: js.Array[js.Function]
}

object Render {
  @scala.inline
  def apply(render: js.Function, staticRenderFns: js.Array[js.Function]): Render = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render]
  }
}

