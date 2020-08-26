package typings.stripeV3.stripe.paymentMethod

import typings.stripeV3.stripeV3Strings.ach_credit_transfer
import typings.stripeV3.stripeV3Strings.ach_debit
import typings.stripeV3.stripeV3Strings.alipay
import typings.stripeV3.stripeV3Strings.bancontact
import typings.stripeV3.stripeV3Strings.card
import typings.stripeV3.stripeV3Strings.eps
import typings.stripeV3.stripeV3Strings.giropay
import typings.stripeV3.stripeV3Strings.ideal
import typings.stripeV3.stripeV3Strings.multibanco
import typings.stripeV3.stripeV3Strings.p24
import typings.stripeV3.stripeV3Strings.sepa_debit
import typings.stripeV3.stripeV3Strings.sofort
import typings.stripeV3.stripeV3Strings.stripe_account
import typings.stripeV3.stripeV3Strings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the payment method at the time of the transaction.
  */
@js.native
trait PaymentMethodDetails extends js.Object {
  var ach_credit_transfer: js.UndefOr[AchCreditTransferDetails | Null] = js.native
  var ach_debit: js.UndefOr[AchDebitDetails | Null] = js.native
  var alipay: js.UndefOr[js.Any | Null] = js.native
  var bancontact: js.UndefOr[BanContactDetails | Null] = js.native
  var card: js.UndefOr[PaymentMethodCard | Null] = js.native
  var eps: js.UndefOr[EpsDetails | Null] = js.native
  var giropay: js.UndefOr[GiropayDetails | Null] = js.native
  var ideal: js.UndefOr[IdealDetails | Null] = js.native
  var multibanco: js.UndefOr[MultibancoDetails | Null] = js.native
  var p24: js.UndefOr[P24Details | Null] = js.native
  var sepa_debit: js.UndefOr[SepaDebitDetails | Null] = js.native
  var sofort: js.UndefOr[SofortDetails | Null] = js.native
  var stripe_account: js.UndefOr[js.Any | Null] = js.native
  /**
    * The type of transaction-specific details of the payment method used in the payment
    */
  var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat = js.native
  var wechat: js.UndefOr[js.Any | Null] = js.native
}

object PaymentMethodDetails {
  @scala.inline
  def apply(
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat
  ): PaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodDetails]
  }
  @scala.inline
  implicit class PaymentMethodDetailsOps[Self <: PaymentMethodDetails] (val x: Self) extends AnyVal {
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
    def setType(
      value: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAch_credit_transfer(value: AchCreditTransferDetails): Self = this.set("ach_credit_transfer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAch_credit_transfer: Self = this.set("ach_credit_transfer", js.undefined)
    @scala.inline
    def setAch_credit_transferNull: Self = this.set("ach_credit_transfer", null)
    @scala.inline
    def setAch_debit(value: AchDebitDetails): Self = this.set("ach_debit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAch_debit: Self = this.set("ach_debit", js.undefined)
    @scala.inline
    def setAch_debitNull: Self = this.set("ach_debit", null)
    @scala.inline
    def setAlipay(value: js.Any): Self = this.set("alipay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlipay: Self = this.set("alipay", js.undefined)
    @scala.inline
    def setAlipayNull: Self = this.set("alipay", null)
    @scala.inline
    def setBancontact(value: BanContactDetails): Self = this.set("bancontact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBancontact: Self = this.set("bancontact", js.undefined)
    @scala.inline
    def setBancontactNull: Self = this.set("bancontact", null)
    @scala.inline
    def setCard(value: PaymentMethodCard): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setCardNull: Self = this.set("card", null)
    @scala.inline
    def setEps(value: EpsDetails): Self = this.set("eps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEps: Self = this.set("eps", js.undefined)
    @scala.inline
    def setEpsNull: Self = this.set("eps", null)
    @scala.inline
    def setGiropay(value: GiropayDetails): Self = this.set("giropay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGiropay: Self = this.set("giropay", js.undefined)
    @scala.inline
    def setGiropayNull: Self = this.set("giropay", null)
    @scala.inline
    def setIdeal(value: IdealDetails): Self = this.set("ideal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdeal: Self = this.set("ideal", js.undefined)
    @scala.inline
    def setIdealNull: Self = this.set("ideal", null)
    @scala.inline
    def setMultibanco(value: MultibancoDetails): Self = this.set("multibanco", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultibanco: Self = this.set("multibanco", js.undefined)
    @scala.inline
    def setMultibancoNull: Self = this.set("multibanco", null)
    @scala.inline
    def setP24(value: P24Details): Self = this.set("p24", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP24: Self = this.set("p24", js.undefined)
    @scala.inline
    def setP24Null: Self = this.set("p24", null)
    @scala.inline
    def setSepa_debit(value: SepaDebitDetails): Self = this.set("sepa_debit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSepa_debit: Self = this.set("sepa_debit", js.undefined)
    @scala.inline
    def setSepa_debitNull: Self = this.set("sepa_debit", null)
    @scala.inline
    def setSofort(value: SofortDetails): Self = this.set("sofort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSofort: Self = this.set("sofort", js.undefined)
    @scala.inline
    def setSofortNull: Self = this.set("sofort", null)
    @scala.inline
    def setStripe_account(value: js.Any): Self = this.set("stripe_account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripe_account: Self = this.set("stripe_account", js.undefined)
    @scala.inline
    def setStripe_accountNull: Self = this.set("stripe_account", null)
    @scala.inline
    def setWechat(value: js.Any): Self = this.set("wechat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWechat: Self = this.set("wechat", js.undefined)
    @scala.inline
    def setWechatNull: Self = this.set("wechat", null)
  }
  
}

