package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alipayaccount extends js.Object {
  var alipay_account: js.UndefOr[Double] = js.native
  var bitcoin_receiver: js.UndefOr[Double] = js.native
  var card: Double = js.native
  var customer_bank_account: js.UndefOr[Double] = js.native
}

object Alipayaccount {
  @scala.inline
  def apply(card: Double): Alipayaccount = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alipayaccount]
  }
  @scala.inline
  implicit class AlipayaccountOps[Self <: Alipayaccount] (val x: Self) extends AnyVal {
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
    def setCard(value: Double): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlipay_account(value: Double): Self = this.set("alipay_account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlipay_account: Self = this.set("alipay_account", js.undefined)
    @scala.inline
    def setBitcoin_receiver(value: Double): Self = this.set("bitcoin_receiver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitcoin_receiver: Self = this.set("bitcoin_receiver", js.undefined)
    @scala.inline
    def setCustomer_bank_account(value: Double): Self = this.set("customer_bank_account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer_bank_account: Self = this.set("customer_bank_account", js.undefined)
  }
  
}

