package typings.stripeV3.stripe

import typings.stripeV3.anon.Country
import typings.stripeV3.anon.Iban
import typings.stripeV3.anon.Returnurl
import typings.stripeV3.stripeV3Strings.code_verification
import typings.stripeV3.stripeV3Strings.none
import typings.stripeV3.stripeV3Strings.receiver
import typings.stripeV3.stripeV3Strings.redirect
import typings.stripeV3.stripeV3Strings.reusable
import typings.stripeV3.stripeV3Strings.single_use
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceOptions extends js.Object {
  var amount: js.UndefOr[Double] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var flow: js.UndefOr[redirect | receiver | code_verification | none] = js.undefined
  var mandate: js.UndefOr[SourceMandate] = js.undefined
  var metadata: js.UndefOr[js.Object] = js.undefined
  var owner: js.UndefOr[OwnerInfo] = js.undefined
  var redirect: js.UndefOr[Returnurl] = js.undefined
  var sepa_debit: js.UndefOr[Iban] = js.undefined
  var sofort: js.UndefOr[Country] = js.undefined
  var statement_descriptor: js.UndefOr[String] = js.undefined
  var three_d_secure: js.UndefOr[typings.stripeV3.anon.Card] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var `type`: String
  var usage: js.UndefOr[reusable | single_use] = js.undefined
}

object SourceOptions {
  @scala.inline
  def apply(
    `type`: String,
    amount: js.UndefOr[Double] = js.undefined,
    currency: String = null,
    flow: redirect | receiver | code_verification | none = null,
    mandate: SourceMandate = null,
    metadata: js.Object = null,
    owner: OwnerInfo = null,
    redirect: Returnurl = null,
    sepa_debit: Iban = null,
    sofort: Country = null,
    statement_descriptor: String = null,
    three_d_secure: typings.stripeV3.anon.Card = null,
    token: String = null,
    usage: reusable | single_use = null
  ): SourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (flow != null) __obj.updateDynamic("flow")(flow.asInstanceOf[js.Any])
    if (mandate != null) __obj.updateDynamic("mandate")(mandate.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (sepa_debit != null) __obj.updateDynamic("sepa_debit")(sepa_debit.asInstanceOf[js.Any])
    if (sofort != null) __obj.updateDynamic("sofort")(sofort.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor.asInstanceOf[js.Any])
    if (three_d_secure != null) __obj.updateDynamic("three_d_secure")(three_d_secure.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptions]
  }
}

