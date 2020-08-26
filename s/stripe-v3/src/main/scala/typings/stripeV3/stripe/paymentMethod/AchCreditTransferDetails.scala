package typings.stripeV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchCreditTransferDetails extends js.Object {
  var account_number: String = js.native
  var bank_name: String = js.native
  var routing_number: String = js.native
  var swift_coode: String = js.native
}

object AchCreditTransferDetails {
  @scala.inline
  def apply(account_number: String, bank_name: String, routing_number: String, swift_coode: String): AchCreditTransferDetails = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], swift_coode = swift_coode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchCreditTransferDetails]
  }
  @scala.inline
  implicit class AchCreditTransferDetailsOps[Self <: AchCreditTransferDetails] (val x: Self) extends AnyVal {
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
    def setAccount_number(value: String): Self = this.set("account_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setBank_name(value: String): Self = this.set("bank_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouting_number(value: String): Self = this.set("routing_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwift_coode(value: String): Self = this.set("swift_coode", value.asInstanceOf[js.Any])
  }
  
}

