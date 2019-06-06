package typings
package stripeLib.stripeMod.sourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceCreationOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  var amount: js.UndefOr[scala.Double] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var flow: js.UndefOr[
    stripeLib.stripeLibStrings.redirect | stripeLib.stripeLibStrings.receiver | stripeLib.stripeLibStrings.code_verification | stripeLib.stripeLibStrings.none
  ] = js.undefined
  var ideal: js.UndefOr[stripeLib.Anon_Bank] = js.undefined
  var mandate: js.UndefOr[stripeLib.Anon_Acceptance] = js.undefined
  @JSName("metadata")
  var metadata_ISourceCreationOptions: js.UndefOr[stripeLib.stripeMod.IMetadata] = js.undefined
  var owner: js.UndefOr[stripeLib.Anon_AddressEmail] = js.undefined
  var receiver: js.UndefOr[stripeLib.Anon_Email] = js.undefined
  var redirect: js.UndefOr[stripeLib.Anon_ReturnurlString] = js.undefined
  var sepa_debit: js.UndefOr[stripeLib.Anon_Iban] = js.undefined
  var statement_descriptor: js.UndefOr[java.lang.String] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var `type`: stripeLib.stripeLibStrings.ach_credit_transfer | stripeLib.stripeLibStrings.ach_debit | stripeLib.stripeLibStrings.alipay | stripeLib.stripeLibStrings.bancontact | stripeLib.stripeLibStrings.card | stripeLib.stripeLibStrings.card_present | stripeLib.stripeLibStrings.eps | stripeLib.stripeLibStrings.giropay | stripeLib.stripeLibStrings.ideal | stripeLib.stripeLibStrings.multibanco | stripeLib.stripeLibStrings.p24 | stripeLib.stripeLibStrings.sepa_debit | stripeLib.stripeLibStrings.sofort | stripeLib.stripeLibStrings.three_d_secure | stripeLib.stripeLibStrings.wechat
  var usage: js.UndefOr[stripeLib.stripeLibStrings.reusable | stripeLib.stripeLibStrings.single_use] = js.undefined
}

object ISourceCreationOptions {
  @scala.inline
  def apply(
    `type`: stripeLib.stripeLibStrings.ach_credit_transfer | stripeLib.stripeLibStrings.ach_debit | stripeLib.stripeLibStrings.alipay | stripeLib.stripeLibStrings.bancontact | stripeLib.stripeLibStrings.card | stripeLib.stripeLibStrings.card_present | stripeLib.stripeLibStrings.eps | stripeLib.stripeLibStrings.giropay | stripeLib.stripeLibStrings.ideal | stripeLib.stripeLibStrings.multibanco | stripeLib.stripeLibStrings.p24 | stripeLib.stripeLibStrings.sepa_debit | stripeLib.stripeLibStrings.sofort | stripeLib.stripeLibStrings.three_d_secure | stripeLib.stripeLibStrings.wechat,
    amount: scala.Int | scala.Double = null,
    currency: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    flow: stripeLib.stripeLibStrings.redirect | stripeLib.stripeLibStrings.receiver | stripeLib.stripeLibStrings.code_verification | stripeLib.stripeLibStrings.none = null,
    ideal: stripeLib.Anon_Bank = null,
    include: js.Array[java.lang.String] = null,
    mandate: stripeLib.Anon_Acceptance = null,
    metadata: stripeLib.stripeMod.IMetadata = null,
    owner: stripeLib.Anon_AddressEmail = null,
    receiver: stripeLib.Anon_Email = null,
    redirect: stripeLib.Anon_ReturnurlString = null,
    sepa_debit: stripeLib.Anon_Iban = null,
    statement_descriptor: java.lang.String = null,
    token: java.lang.String = null,
    usage: stripeLib.stripeLibStrings.reusable | stripeLib.stripeLibStrings.single_use = null
  ): ISourceCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (flow != null) __obj.updateDynamic("flow")(flow.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal)
    if (include != null) __obj.updateDynamic("include")(include)
    if (mandate != null) __obj.updateDynamic("mandate")(mandate)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (receiver != null) __obj.updateDynamic("receiver")(receiver)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (sepa_debit != null) __obj.updateDynamic("sepa_debit")(sepa_debit)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (token != null) __obj.updateDynamic("token")(token)
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceCreationOptions]
  }
}

