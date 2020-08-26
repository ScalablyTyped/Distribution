package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceControlInputBox extends js.Object {
  /**
    * A string to show as placeholder in the input box to guide the user.
    */
  var placeholder: String = js.native
  /**
    * Setter and getter for the contents of the input box.
    */
  var value: String = js.native
  /**
    * Controls whether the input box is visible (default is `true`).
    */
  var visible: Boolean = js.native
}

object SourceControlInputBox {
  @scala.inline
  def apply(placeholder: String, value: String, visible: Boolean): SourceControlInputBox = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlInputBox]
  }
  @scala.inline
  implicit class SourceControlInputBoxOps[Self <: SourceControlInputBox] (val x: Self) extends AnyVal {
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
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

