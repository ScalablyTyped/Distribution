package typings.stripeV3.anon

import typings.stripeV3.stripeV3Strings.fraudulent
import typings.stripeV3.stripeV3Strings.safe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stripereport extends js.Object {
  /**
    * Assessments from Stripe have the key stripe_report and, if set, the value "fraudulent".
    */
  var stripe_report: js.UndefOr[fraudulent] = js.native
  /**
    * Assessments reported by you have the key user_report and, if set, possible values of "safe" and "fraudulent".
    */
  var user_report: js.UndefOr[fraudulent | safe] = js.native
}

object Stripereport {
  @scala.inline
  def apply(): Stripereport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stripereport]
  }
  @scala.inline
  implicit class StripereportOps[Self <: Stripereport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStripe_report(value: fraudulent): Self = this.set("stripe_report", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripe_report: Self = this.set("stripe_report", js.undefined)
    @scala.inline
    def setUser_report(value: fraudulent | safe): Self = this.set("user_report", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_report: Self = this.set("user_report", js.undefined)
  }
  
}

