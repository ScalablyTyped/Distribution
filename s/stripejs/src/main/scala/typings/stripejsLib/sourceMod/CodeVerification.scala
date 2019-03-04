package typings
package stripejsLib.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeVerification extends js.Object {
  /**
    * The number of attempts remaining to authenticate the
    * source object with a verification code
    */
  var attempts_remaining: scala.Double
  /**
    * The status of the code verification
    */
  var status: stripejsLib.stripejsLibStrings.pending | stripejsLib.stripejsLibStrings.attempts_remaining | stripejsLib.stripejsLibStrings.succeeded | stripejsLib.stripejsLibStrings.failed
}

object CodeVerification {
  @scala.inline
  def apply(
    attempts_remaining: scala.Double,
    status: stripejsLib.stripejsLibStrings.pending | stripejsLib.stripejsLibStrings.attempts_remaining | stripejsLib.stripejsLibStrings.succeeded | stripejsLib.stripejsLibStrings.failed
  ): CodeVerification = {
    val __obj = js.Dynamic.literal(attempts_remaining = attempts_remaining, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CodeVerification]
  }
}

