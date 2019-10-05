package typings.stripe.stripeMod.sources

import typings.stripe.Anon_AccountnumberBankname
import typings.stripe.Anon_AddressAmountcharged
import typings.stripe.Anon_AddressEmailName
import typings.stripe.Anon_Attemptsremaining
import typings.stripe.Anon_Declined
import typings.stripe.stripeMod.ICardHashInfo
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.IStripeSource
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
  var ach_credit_transfer: js.UndefOr[Anon_AccountnumberBankname] = js.undefined
  var amount: js.UndefOr[Double | Null] = js.undefined
  var card: js.UndefOr[ICardHashInfo] = js.undefined
  var client_secret: String
  var code_verification: js.UndefOr[Anon_Attemptsremaining] = js.undefined
  var created: Double
  var currency: js.UndefOr[String] = js.undefined
  var customer: js.UndefOr[String] = js.undefined
  var flow: redirect | receiver | code_verification | none
  var livemode: Boolean
  var metadata: IMetadata
  @JSName("object")
  var object_ISource: source
  var owner: Anon_AddressEmailName
  var receiver: js.UndefOr[Anon_AddressAmountcharged] = js.undefined
  var redirect: js.UndefOr[Anon_Declined] = js.undefined
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
    owner: Anon_AddressEmailName,
    status: canceled | chargeable | consumed | failed | pending,
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat,
    usage: reusable | single_use,
    ach_credit_transfer: Anon_AccountnumberBankname = null,
    amount: Int | Double = null,
    card: ICardHashInfo = null,
    code_verification: Anon_Attemptsremaining = null,
    currency: String = null,
    customer: String = null,
    receiver: Anon_AddressAmountcharged = null,
    redirect: Anon_Declined = null,
    statement_descriptor: String = null
  ): ISource = {
    val __obj = js.Dynamic.literal(client_secret = client_secret, created = created, flow = flow.asInstanceOf[js.Any], id = id, livemode = livemode, metadata = metadata, owner = owner, status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ach_credit_transfer != null) __obj.updateDynamic("ach_credit_transfer")(ach_credit_transfer)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card)
    if (code_verification != null) __obj.updateDynamic("code_verification")(code_verification)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (receiver != null) __obj.updateDynamic("receiver")(receiver)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    __obj.asInstanceOf[ISource]
  }
}

