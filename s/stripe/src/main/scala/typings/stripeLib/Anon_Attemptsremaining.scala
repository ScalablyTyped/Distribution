package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attemptsremaining extends js.Object {
  var attempts_remaining: scala.Double
  var status: stripeLib.stripeLibStrings.pending | stripeLib.stripeLibStrings.succeeded | stripeLib.stripeLibStrings.failed
}

object Anon_Attemptsremaining {
  @scala.inline
  def apply(
    attempts_remaining: scala.Double,
    status: stripeLib.stripeLibStrings.pending | stripeLib.stripeLibStrings.succeeded | stripeLib.stripeLibStrings.failed
  ): Anon_Attemptsremaining = {
    val __obj = js.Dynamic.literal(attempts_remaining = attempts_remaining, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Attemptsremaining]
  }
}

