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
trait PaymentMethodDetails extends js.Object {
  var ach_credit_transfer: js.UndefOr[AchCreditTransferDetails | Null] = js.undefined
  var ach_debit: js.UndefOr[AchDebitDetails | Null] = js.undefined
  var alipay: js.UndefOr[js.Any | Null] = js.undefined
  var bancontact: js.UndefOr[BanContactDetails | Null] = js.undefined
  var card: js.UndefOr[PaymentMethodCard | Null] = js.undefined
  var eps: js.UndefOr[EpsDetails | Null] = js.undefined
  var giropay: js.UndefOr[GiropayDetails | Null] = js.undefined
  var ideal: js.UndefOr[IdealDetails | Null] = js.undefined
  var multibanco: js.UndefOr[MultibancoDetails | Null] = js.undefined
  var p24: js.UndefOr[P24Details | Null] = js.undefined
  var sepa_debit: js.UndefOr[SepaDebitDetails | Null] = js.undefined
  var sofort: js.UndefOr[SofortDetails | Null] = js.undefined
  var stripe_account: js.UndefOr[js.Any | Null] = js.undefined
  /**
    * The type of transaction-specific details of the payment method used in the payment
    */
  var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat
  var wechat: js.UndefOr[js.Any | Null] = js.undefined
}

object PaymentMethodDetails {
  @scala.inline
  def apply(
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat,
    ach_credit_transfer: js.UndefOr[Null | AchCreditTransferDetails] = js.undefined,
    ach_debit: js.UndefOr[Null | AchDebitDetails] = js.undefined,
    alipay: js.UndefOr[Null | js.Any] = js.undefined,
    bancontact: js.UndefOr[Null | BanContactDetails] = js.undefined,
    card: js.UndefOr[Null | PaymentMethodCard] = js.undefined,
    eps: js.UndefOr[Null | EpsDetails] = js.undefined,
    giropay: js.UndefOr[Null | GiropayDetails] = js.undefined,
    ideal: js.UndefOr[Null | IdealDetails] = js.undefined,
    multibanco: js.UndefOr[Null | MultibancoDetails] = js.undefined,
    p24: js.UndefOr[Null | P24Details] = js.undefined,
    sepa_debit: js.UndefOr[Null | SepaDebitDetails] = js.undefined,
    sofort: js.UndefOr[Null | SofortDetails] = js.undefined,
    stripe_account: js.UndefOr[Null | js.Any] = js.undefined,
    wechat: js.UndefOr[Null | js.Any] = js.undefined
  ): PaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(ach_credit_transfer)) __obj.updateDynamic("ach_credit_transfer")(ach_credit_transfer.asInstanceOf[js.Any])
    if (!js.isUndefined(ach_debit)) __obj.updateDynamic("ach_debit")(ach_debit.asInstanceOf[js.Any])
    if (!js.isUndefined(alipay)) __obj.updateDynamic("alipay")(alipay.asInstanceOf[js.Any])
    if (!js.isUndefined(bancontact)) __obj.updateDynamic("bancontact")(bancontact.asInstanceOf[js.Any])
    if (!js.isUndefined(card)) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (!js.isUndefined(eps)) __obj.updateDynamic("eps")(eps.asInstanceOf[js.Any])
    if (!js.isUndefined(giropay)) __obj.updateDynamic("giropay")(giropay.asInstanceOf[js.Any])
    if (!js.isUndefined(ideal)) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    if (!js.isUndefined(multibanco)) __obj.updateDynamic("multibanco")(multibanco.asInstanceOf[js.Any])
    if (!js.isUndefined(p24)) __obj.updateDynamic("p24")(p24.asInstanceOf[js.Any])
    if (!js.isUndefined(sepa_debit)) __obj.updateDynamic("sepa_debit")(sepa_debit.asInstanceOf[js.Any])
    if (!js.isUndefined(sofort)) __obj.updateDynamic("sofort")(sofort.asInstanceOf[js.Any])
    if (!js.isUndefined(stripe_account)) __obj.updateDynamic("stripe_account")(stripe_account.asInstanceOf[js.Any])
    if (!js.isUndefined(wechat)) __obj.updateDynamic("wechat")(wechat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodDetails]
  }
}

