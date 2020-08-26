package typings.vue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Render extends js.Object {
  var render: js.Function = js.native
  var staticRenderFns: js.Array[js.Function] = js.native
}

object Render {
  @scala.inline
  def apply(render: js.Function, staticRenderFns: js.Array[js.Function]): Render = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render]
  }
  @scala.inline
  implicit class RenderOps[Self <: Render] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRender(value: js.Function): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticRenderFnsVarargs(value: js.Function*): Self = this.set("staticRenderFns", js.Array(value :_*))
    @scala.inline
    def setStaticRenderFns(value: js.Array[js.Function]): Self = this.set("staticRenderFns", value.asInstanceOf[js.Any])
  }
  
}

