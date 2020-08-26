package typings.wordpressEditor.postVisibilityCheckMod.PostVisibilityCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderProps extends js.Object {
  var canEdit: Boolean = js.native
}

object RenderProps {
  @scala.inline
  def apply(canEdit: Boolean): RenderProps = {
    val __obj = js.Dynamic.literal(canEdit = canEdit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
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
    def setCanEdit(value: Boolean): Self = this.set("canEdit", value.asInstanceOf[js.Any])
  }
  
}

