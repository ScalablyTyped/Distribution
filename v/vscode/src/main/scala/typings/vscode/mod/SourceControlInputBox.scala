package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceControlInputBox extends js.Object {
  /**
    * A string to show as placeholder in the input box to guide the user.
    */
  var placeholder: String
  /**
    * Setter and getter for the contents of the input box.
    */
  var value: String
  /**
    * Controls whether the input box is visible (default is `true`).
    */
  var visible: Boolean
}

object SourceControlInputBox {
  @scala.inline
  def apply(placeholder: String, value: String, visible: Boolean): SourceControlInputBox = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlInputBox]
  }
}

