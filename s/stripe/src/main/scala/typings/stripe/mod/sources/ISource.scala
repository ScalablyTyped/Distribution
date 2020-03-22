package typings.stripe.mod.sources

import typings.stripe.AnonAmountcharged
import typings.stripe.AnonAttemptsremaining
import typings.stripe.AnonBankname
import typings.stripe.AnonFailurereason
import typings.stripe.AnonPhone
import typings.stripe.mod.ICardHashInfo
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.IStripeSource
import typings.stripe.stripeStrings.ach_credit_transfer
import typings.stripe.stripeStrings.ach_debit
import typings.stripe.stripeStrings.alipay
import typings.stripe.stripeStrings.bancontact
import typings.stripe.stripeStrings.canceled
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.card_present
import typings.stripe.stripeStrings.chargeable
import typings.stripe.stripeStrings.code_verification
import typings.stripe.stripeStrings.consumed
import typings.stripe.stripeStrings.eps
import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.giropay
import typings.stripe.stripeStrings.ideal
import typings.stripe.stripeStrings.multibanco
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.p24
import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.receiver
import typings.stripe.stripeStrings.redirect
import typings.stripe.stripeStrings.reusable
import typings.stripe.stripeStrings.sepa_debit
import typings.stripe.stripeStrings.single_use
import typings.stripe.stripeStrings.sofort
import typings.stripe.stripeStrings.source
import typings.stripe.stripeStrings.three_d_secure
import typings.stripe.stripeStrings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Source object: https://stripe.com/docs/api/sources/object */
trait ISource
  extends IResourceObject
     with IStripeSource {
  var ach_credit_transfer: js.UndefOr[AnonBankname] = js.undefined
  var amount: js.UndefOr[Double | Null] = js.undefined
  var card: js.UndefOr[ICardHashInfo] = js.undefined
  var client_secret: String
  var code_verification: js.UndefOr[AnonAttemptsremaining] = js.undefined
  var created: Double
  var currency: js.UndefOr[String] = js.undefined
  var customer: js.UndefOr[String] = js.undefined
  var flow: redirect | receiver | code_verification | none
  var livemode: Boolean
  var metadata: IMetadata
  @JSName("object")
  var object_ISource: source
  var owner: AnonPhone
  var receiver: js.UndefOr[AnonAmountcharged] = js.undefined
  var redirect: js.UndefOr[AnonFailurereason] = js.undefined
  var statement_descriptor: js.UndefOr[String | Null] = js.undefined
  var status: canceled | chargeable | consumed | failed | pending
  var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat
  var usage: reusable | single_use
}

object ISource {
  @scala.inline
  def apply(
    client_secret: String,
    created: Double,
    flow: redirect | receiver | code_verification | none,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: source,
    owner: AnonPhone,
    status: canceled | chargeable | consumed | failed | pending,
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat,
    usage: reusable | single_use,
    ach_credit_transfer: AnonBankname = null,
    amount: Int | Double = null,
    card: ICardHashInfo = null,
    code_verification: AnonAttemptsremaining = null,
    currency: String = null,
    customer: String = null,
    receiver: AnonAmountcharged = null,
    redirect: AnonFailurereason = null,
    statement_descriptor: String = null
  ): ISource = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ach_credit_transfer != null) __obj.updateDynamic("ach_credit_transfer")(ach_credit_transfer.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (code_verification != null) __obj.updateDynamic("code_verification")(code_verification.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (receiver != null) __obj.updateDynamic("receiver")(receiver.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISource]
  }
}

