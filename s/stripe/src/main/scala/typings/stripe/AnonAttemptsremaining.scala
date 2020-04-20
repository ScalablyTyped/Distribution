package typings.stripe

import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttemptsremaining extends js.Object {
  var attempts_remaining: Double
  var status: pending | succeeded | failed
}

object AnonAttemptsremaining {
  @scala.inline
  def apply(attempts_remaining: Double, status: pending | succeeded | failed): AnonAttemptsremaining = {
    val __obj = js.Dynamic.literal(attempts_remaining = attempts_remaining.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttemptsremaining]
  }
}

