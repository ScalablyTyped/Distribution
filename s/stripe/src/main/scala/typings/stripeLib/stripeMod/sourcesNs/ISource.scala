package typings
package stripeLib.stripeMod.sourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Source object: https://stripe.com/docs/api/sources/object */
trait ISource
  extends stripeLib.stripeMod.IResourceObject
     with stripeLib.stripeMod.IStripeSource {
  var ach_credit_transfer: js.UndefOr[stripeLib.Anon_AccountnumberBankname] = js.undefined
  var amount: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var card: js.UndefOr[stripeLib.stripeMod.ICardHashInfo] = js.undefined
  var client_secret: java.lang.String
  var code_verification: js.UndefOr[stripeLib.Anon_Attemptsremaining] = js.undefined
  var created: scala.Double
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var customer: js.UndefOr[java.lang.String] = js.undefined
  var flow: stripeLib.stripeLibStrings.redirect | stripeLib.stripeLibStrings.receiver | stripeLib.stripeLibStrings.code_verification | stripeLib.stripeLibStrings.none
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.IMetadata
  @JSName("object")
  var object_ISource: stripeLib.stripeLibStrings.source
  var owner: stripeLib.Anon_Address
  var receiver: js.UndefOr[stripeLib.Anon_AddressAmountcharged] = js.undefined
  var redirect: js.UndefOr[stripeLib.Anon_Declined] = js.undefined
  var statement_descriptor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var status: stripeLib.stripeLibStrings.canceled | stripeLib.stripeLibStrings.chargeable | stripeLib.stripeLibStrings.consumed | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.pending
  var `type`: stripeLib.stripeLibStrings.ach_credit_transfer | stripeLib.stripeLibStrings.ach_debit | stripeLib.stripeLibStrings.alipay | stripeLib.stripeLibStrings.bancontact | stripeLib.stripeLibStrings.card | stripeLib.stripeLibStrings.card_present | stripeLib.stripeLibStrings.eps | stripeLib.stripeLibStrings.giropay | stripeLib.stripeLibStrings.ideal | stripeLib.stripeLibStrings.multibanco | stripeLib.stripeLibStrings.p24 | stripeLib.stripeLibStrings.sepa_debit | stripeLib.stripeLibStrings.sofort | stripeLib.stripeLibStrings.three_d_secure | stripeLib.stripeLibStrings.wechat
  var usage: stripeLib.stripeLibStrings.reusable | stripeLib.stripeLibStrings.single_use
}

object ISource {
  @scala.inline
  def apply(
    client_secret: java.lang.String,
    created: scala.Double,
    flow: stripeLib.stripeLibStrings.redirect | stripeLib.stripeLibStrings.receiver | stripeLib.stripeLibStrings.code_verification | stripeLib.stripeLibStrings.none,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.IMetadata,
    `object`: stripeLib.stripeLibStrings.source,
    owner: stripeLib.Anon_Address,
    status: stripeLib.stripeLibStrings.canceled | stripeLib.stripeLibStrings.chargeable | stripeLib.stripeLibStrings.consumed | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.pending,
    `type`: stripeLib.stripeLibStrings.ach_credit_transfer | stripeLib.stripeLibStrings.ach_debit | stripeLib.stripeLibStrings.alipay | stripeLib.stripeLibStrings.bancontact | stripeLib.stripeLibStrings.card | stripeLib.stripeLibStrings.card_present | stripeLib.stripeLibStrings.eps | stripeLib.stripeLibStrings.giropay | stripeLib.stripeLibStrings.ideal | stripeLib.stripeLibStrings.multibanco | stripeLib.stripeLibStrings.p24 | stripeLib.stripeLibStrings.sepa_debit | stripeLib.stripeLibStrings.sofort | stripeLib.stripeLibStrings.three_d_secure | stripeLib.stripeLibStrings.wechat,
    usage: stripeLib.stripeLibStrings.reusable | stripeLib.stripeLibStrings.single_use,
    ach_credit_transfer: stripeLib.Anon_AccountnumberBankname = null,
    amount: scala.Int | scala.Double = null,
    card: stripeLib.stripeMod.ICardHashInfo = null,
    code_verification: stripeLib.Anon_Attemptsremaining = null,
    currency: java.lang.String = null,
    customer: java.lang.String = null,
    receiver: stripeLib.Anon_AddressAmountcharged = null,
    redirect: stripeLib.Anon_Declined = null,
    statement_descriptor: java.lang.String = null
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

