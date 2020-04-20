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
}

object SourceControlInputBox {
  @scala.inline
  def apply(placeholder: String, value: String): SourceControlInputBox = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlInputBox]
  }
}

