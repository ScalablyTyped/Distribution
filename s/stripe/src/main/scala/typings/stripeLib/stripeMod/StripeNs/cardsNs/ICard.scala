package typings
package stripeLib.stripeMod.StripeNs.cardsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * You can store multiple cards on a customer in order to charge the customer later. You
  * can also store multiple debit cards on a recipient in order to transfer to those cards later.
  */
trait ICard extends ICardHash {
  /**
    * The account this card belongs to. This attribute will not be in the
    * card object if the card belongs to a customer or recipient instead.
    * [Expandable]
    */
  var account: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.undefined
  /**
    * Only applicable on accounts (not customers or recipients). The
    * card can be used as a transfer destination for funds in this
    * currency.
    */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The customer that this card belongs to. This attribute will not be
    * in the card object if the card belongs to an account or recipient
    * instead.
    */
  var customer: js.UndefOr[
    java.lang.String | stripeLib.stripeMod.StripeNs.customersNs.ICustomer | scala.Null
  ] = js.undefined
  /**
    * Only applicable on accounts (not customers or recipients). This
    * indicates whether or not this card is the default external account
    * for its currency.
    */
  var default_for_currency: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The recipient that this card belongs to. This attribute will not be
    * in the card object if the card belongs to a customer or account
    * instead. [Expandable]
    */
  var recipient: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.recipientsNs.IRecipient] = js.undefined
}

object ICard {
  @scala.inline
  def apply(
    brand: stripeLib.stripeLibStrings.Visa | (stripeLib.stripeLibStrings.`American Express`) | stripeLib.stripeLibStrings.MasterCard | stripeLib.stripeLibStrings.Discover | stripeLib.stripeLibStrings.JCB | (stripeLib.stripeLibStrings.`Diners Club`) | stripeLib.stripeLibStrings.Unknown,
    country: java.lang.String,
    cvc_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.fail | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked,
    exp_month: scala.Double,
    exp_year: scala.Double,
    fingerprint: java.lang.String,
    funding: stripeLib.stripeLibStrings.credit | stripeLib.stripeLibStrings.debit | stripeLib.stripeLibStrings.prepaid | stripeLib.stripeLibStrings.unknown,
    id: java.lang.String,
    last4: java.lang.String,
    `object`: stripeLib.stripeLibStrings.card,
    account: java.lang.String | stripeLib.stripeMod.StripeNs.accountsNs.IAccount = null,
    address_city: java.lang.String = null,
    address_country: java.lang.String = null,
    address_line1: java.lang.String = null,
    address_line1_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.fail | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked = null,
    address_line2: java.lang.String = null,
    address_state: java.lang.String = null,
    address_zip: java.lang.String = null,
    address_zip_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.fail | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked = null,
    currency: java.lang.String = null,
    customer: java.lang.String | stripeLib.stripeMod.StripeNs.customersNs.ICustomer = null,
    default_for_currency: js.UndefOr[scala.Boolean] = js.undefined,
    dynamic_last4: java.lang.String = null,
    metadata: stripeLib.stripeMod.StripeNs.IMetadata = null,
    name: java.lang.String = null,
    number: java.lang.String = null,
    recipient: java.lang.String | stripeLib.stripeMod.StripeNs.recipientsNs.IRecipient = null,
    tokenization_method: stripeLib.stripeLibStrings.apple_pay | stripeLib.stripeLibStrings.android_pay = null
  ): ICard = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("cvc_check")(cvc_check.asInstanceOf[js.Any])
    __obj.updateDynamic("exp_month")(exp_month)
    __obj.updateDynamic("exp_year")(exp_year)
    __obj.updateDynamic("fingerprint")(fingerprint)
    __obj.updateDynamic("funding")(funding.asInstanceOf[js.Any])
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("last4")(last4)
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (address_city != null) __obj.updateDynamic("address_city")(address_city)
    if (address_country != null) __obj.updateDynamic("address_country")(address_country)
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1)
    if (address_line1_check != null) __obj.updateDynamic("address_line1_check")(address_line1_check.asInstanceOf[js.Any])
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2)
    if (address_state != null) __obj.updateDynamic("address_state")(address_state)
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip)
    if (address_zip_check != null) __obj.updateDynamic("address_zip_check")(address_zip_check.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency)
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number)
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (tokenization_method != null) __obj.updateDynamic("tokenization_method")(tokenization_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICard]
  }
}

