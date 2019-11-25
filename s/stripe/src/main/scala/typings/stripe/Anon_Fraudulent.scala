package typings.stripe

import typings.stripe.stripeStrings.fraudulent
import typings.stripe.stripeStrings.safe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fraudulent extends js.Object {
  /**
    * Assessments from Stripe have the key stripe_report and, if set, the value "fraudulent".
    */
  var stripe_report: js.UndefOr[fraudulent] = js.undefined
  /**
    * Assessments reported by you have the key user_report and, if set, possible values of "safe" and "fraudulent".
    */
  var user_report: js.UndefOr[fraudulent | safe] = js.undefined
}

object Anon_Fraudulent {
  @scala.inline
  def apply(stripe_report: fraudulent = null, user_report: fraudulent | safe = null): Anon_Fraudulent = {
    val __obj = js.Dynamic.literal()
    if (stripe_report != null) __obj.updateDynamic("stripe_report")(stripe_report.asInstanceOf[js.Any])
    if (user_report != null) __obj.updateDynamic("user_report")(user_report.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fraudulent]
  }
}

