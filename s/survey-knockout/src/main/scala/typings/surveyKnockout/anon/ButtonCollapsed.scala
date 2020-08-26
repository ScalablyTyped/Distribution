package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonCollapsed extends js.Object {
  var button: String = js.native
  var buttonCollapsed: String = js.native
  var buttonExpanded: String = js.native
  var root: String = js.native
  var title: String = js.native
}

object ButtonCollapsed {
  @scala.inline
  def apply(button: String, buttonCollapsed: String, buttonExpanded: String, root: String, title: String): ButtonCollapsed = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonCollapsed = buttonCollapsed.asInstanceOf[js.Any], buttonExpanded = buttonExpanded.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonCollapsed]
  }
  @scala.inline
  implicit class ButtonCollapsedOps[Self <: ButtonCollapsed] (val x: Self) extends AnyVal {
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
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonCollapsed(value: String): Self = this.set("buttonCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonExpanded(value: String): Self = this.set("buttonExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

