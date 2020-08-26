package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityInformation extends js.Object {
  /**
    * Label to be read out by a screen reader once the item has focus.
    */
  var label: String = js.native
  /**
    * Role of the widget which defines how a screen reader interacts with it.
    * The role should be set in special cases when for example a tree-like element behaves like a checkbox.
    * If role is not specified VS Code will pick the appropriate role automatically.
    * More about aria roles can be found here https://w3c.github.io/aria/#widget_roles
    */
  var role: js.UndefOr[String] = js.native
}

object AccessibilityInformation {
  @scala.inline
  def apply(label: String): AccessibilityInformation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityInformation]
  }
  @scala.inline
  implicit class AccessibilityInformationOps[Self <: AccessibilityInformation] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

