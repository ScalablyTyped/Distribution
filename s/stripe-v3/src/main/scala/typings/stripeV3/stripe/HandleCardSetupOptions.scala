package typings.stripeV3.stripe

import typings.stripeV3.anon.Billingdetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleCardSetupOptions extends js.Object {
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details.
    */
  var payment_method_data: js.UndefOr[Billingdetails] = js.native
}

object HandleCardSetupOptions {
  @scala.inline
  def apply(): HandleCardSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleCardSetupOptions]
  }
  @scala.inline
  implicit class HandleCardSetupOptionsOps[Self <: HandleCardSetupOptions] (val x: Self) extends AnyVal {
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
    def setPayment_method_data(value: Billingdetails): Self = this.set("payment_method_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method_data: Self = this.set("payment_method_data", js.undefined)
  }
  
}

