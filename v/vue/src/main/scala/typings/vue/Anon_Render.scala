package typings.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Render extends js.Object {
  var render: js.Function
  var staticRenderFns: js.Array[js.Function]
}

object Anon_Render {
  @scala.inline
  def apply(render: js.Function, staticRenderFns: js.Array[js.Function]): Anon_Render = {
    val __obj = js.Dynamic.literal(render = render, staticRenderFns = staticRenderFns)
  
    __obj.asInstanceOf[Anon_Render]
  }
}

