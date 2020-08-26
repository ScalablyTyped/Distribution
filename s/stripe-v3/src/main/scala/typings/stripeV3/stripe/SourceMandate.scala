package typings.stripeV3.stripe

import typings.stripeV3.stripeV3Strings.email
import typings.stripeV3.stripeV3Strings.manual
import typings.stripeV3.stripeV3Strings.none
import typings.stripeV3.stripeV3Strings.one_time
import typings.stripeV3.stripeV3Strings.scheduled
import typings.stripeV3.stripeV3Strings.variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMandate extends js.Object {
  var acceptance: js.UndefOr[SourceMandateAcceptance] = js.native
  var amount: js.UndefOr[Double] = js.native
  var currency: js.UndefOr[String] = js.native
  var interval: js.UndefOr[one_time | scheduled | variable] = js.native
  var notification_method: js.UndefOr[email | manual | none] = js.native
}

object SourceMandate {
  @scala.inline
  def apply(): SourceMandate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMandate]
  }
  @scala.inline
  implicit class SourceMandateOps[Self <: SourceMandate] (val x: Self) extends AnyVal {
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
    def setAcceptance(value: SourceMandateAcceptance): Self = this.set("acceptance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptance: Self = this.set("acceptance", js.undefined)
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setInterval(value: one_time | scheduled | variable): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setNotification_method(value: email | manual | none): Self = this.set("notification_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification_method: Self = this.set("notification_method", js.undefined)
  }
  
}

