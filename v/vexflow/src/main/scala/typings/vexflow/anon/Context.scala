package typings.vexflow.anon

import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var align_rests: js.UndefOr[Boolean] = js.native
  var context: IRenderContext = js.native
}

object Context {
  @scala.inline
  def apply(context: IRenderContext): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
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
    def setContext(value: IRenderContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign_rests(value: Boolean): Self = this.set("align_rests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign_rests: Self = this.set("align_rests", js.undefined)
  }
  
}

