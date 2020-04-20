package typings.stripejs.sourceMod

import typings.stripejs.stripejsStrings.attempts_remaining
import typings.stripejs.stripejsStrings.failed
import typings.stripejs.stripejsStrings.pending
import typings.stripejs.stripejsStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeVerification extends js.Object {
  /**
    * The number of attempts remaining to authenticate the
    * source object with a verification code
    */
  var attempts_remaining: Double
  /**
    * The status of the code verification
    */
  var status: pending | attempts_remaining | succeeded | failed
}

object CodeVerification {
  @scala.inline
  def apply(attempts_remaining: Double, status: pending | attempts_remaining | succeeded | failed): CodeVerification = {
    val __obj = js.Dynamic.literal(attempts_remaining = attempts_remaining.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeVerification]
  }
}

