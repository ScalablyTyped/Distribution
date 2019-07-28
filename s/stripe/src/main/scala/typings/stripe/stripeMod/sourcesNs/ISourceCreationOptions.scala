package typings.stripe.stripeMod.sourcesNs

import typings.stripe.Anon_Acceptance
import typings.stripe.Anon_AddressEmailNamePhone
import typings.stripe.Anon_Bank
import typings.stripe.Anon_Email
import typings.stripe.Anon_Iban
import typings.stripe.Anon_ReturnurlString
import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeStrings.ach_credit_transfer
import typings.stripe.stripeStrings.ach_debit
import typings.stripe.stripeStrings.alipay
import typings.stripe.stripeStrings.bancontact
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.card_present
import typings.stripe.stripeStrings.code_verification
import typings.stripe.stripeStrings.eps
import typings.stripe.stripeStrings.giropay
import typings.stripe.stripeStrings.ideal
import typings.stripe.stripeStrings.multibanco
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.p24
import typings.stripe.stripeStrings.receiver
import typings.stripe.stripeStrings.redirect
import typings.stripe.stripeStrings.reusable
import typings.stripe.stripeStrings.sepa_debit
import typings.stripe.stripeStrings.single_use
import typings.stripe.stripeStrings.sofort
import typings.stripe.stripeStrings.three_d_secure
import typings.stripe.stripeStrings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceCreationOptions extends IDataOptionsWithMetadata {
  var amount: js.UndefOr[Double] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var flow: js.UndefOr[redirect | receiver | code_verification | none] = js.undefined
  var ideal: js.UndefOr[Anon_Bank] = js.undefined
  var mandate: js.UndefOr[Anon_Acceptance] = js.undefined
  @JSName("metadata")
  var metadata_ISourceCreationOptions: js.UndefOr[IMetadata] = js.undefined
  var owner: js.UndefOr[Anon_AddressEmailNamePhone] = js.undefined
  var receiver: js.UndefOr[Anon_Email] = js.undefined
  var redirect: js.UndefOr[Anon_ReturnurlString] = js.undefined
  var sepa_debit: js.UndefOr[Anon_Iban] = js.undefined
  var statement_descriptor: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat
  var usage: js.UndefOr[reusable | single_use] = js.undefined
}

object ISourceCreationOptions {
  @scala.inline
  def apply(
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat,
    amount: Int | Double = null,
    currency: String = null,
    expand: js.Array[String] = null,
    flow: redirect | receiver | code_verification | none = null,
    ideal: Anon_Bank = null,
    include: js.Array[String] = null,
    mandate: Anon_Acceptance = null,
    metadata: IMetadata = null,
    owner: Anon_AddressEmailNamePhone = null,
    receiver: Anon_Email = null,
    redirect: Anon_ReturnurlString = null,
    sepa_debit: Anon_Iban = null,
    statement_descriptor: String = null,
    token: String = null,
    usage: reusable | single_use = null
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

