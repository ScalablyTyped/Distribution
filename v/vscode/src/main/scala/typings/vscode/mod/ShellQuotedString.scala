package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellQuotedString extends js.Object {
  /**
  		 * The quoting style to use.
  		 */
  var quoting: ShellQuoting
  /**
  		 * The actual string value.
  		 */
  var value: String
}

object ShellQuotedString {
  @scala.inline
  def apply(quoting: ShellQuoting, value: String): ShellQuotedString = {
    val __obj = js.Dynamic.literal(quoting = quoting.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellQuotedString]
  }
}

