package typings.stripeV3.stripe

import typings.stripeV3.anon.Sepadebit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmSepaDebitPaymentData extends js.Object {
  /**
    * Pass an object to confirm using data collected by an iban Element or
    * by passing data directly and to supply additional required billing
    * details:
    */
  var payment_method: js.UndefOr[String | Sepadebit] = js.native
}

object ConfirmSepaDebitPaymentData {
  @scala.inline
  def apply(): ConfirmSepaDebitPaymentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSepaDebitPaymentData]
  }
  @scala.inline
  implicit class ConfirmSepaDebitPaymentDataOps[Self <: ConfirmSepaDebitPaymentData] (val x: Self) extends AnyVal {
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
    def setPayment_method(value: String | Sepadebit): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method: Self = this.set("payment_method", js.undefined)
  }
  
}

