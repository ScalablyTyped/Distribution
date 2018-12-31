package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UserreportFraudulent extends js.Object {
  /**
    * Assessments from Stripe have the key stripe_report and, if set, the value "fraudulent".
    */
  var stripe_report: js.UndefOr[stripeLib.stripeLibStrings.fraudulent] = js.undefined
  /**
    * Assessments reported by you have the key user_report and, if set, possible values of "safe" and "fraudulent".
    */
  var user_report: js.UndefOr[stripeLib.stripeLibStrings.fraudulent | stripeLib.stripeLibStrings.safe] = js.undefined
}

