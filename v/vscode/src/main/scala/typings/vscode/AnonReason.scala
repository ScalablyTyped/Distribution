package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReason extends js.Object {
  /**
  			 * Human readable description of why the code action is currently disabled.
  			 *
  			 * This is displayed in the code actions UI.
  			 */
  val reason: String
}

object AnonReason {
  @scala.inline
  def apply(reason: String): AnonReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReason]
  }
}

