package typings.stripe.stripeMod.cards

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IStripeSource
import typings.stripe.stripeMod.accounts.IAccount
import typings.stripe.stripeMod.accounts.IExternalAccount
import typings.stripe.stripeMod.customers.ICustomer
import typings.stripe.stripeMod.recipients.IRecipient
import typings.stripe.stripeStrings.Discover
import typings.stripe.stripeStrings.JCB
import typings.stripe.stripeStrings.MasterCard
import typings.stripe.stripeStrings.Unknown
import typings.stripe.stripeStrings.Visa
import typings.stripe.stripeStrings.`American Express`
import typings.stripe.stripeStrings.`Diners Club`
import typings.stripe.stripeStrings.android_pay
import typings.stripe.stripeStrings.apple_pay
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.credit
import typings.stripe.stripeStrings.debit
import typings.stripe.stripeStrings.fail
import typings.stripe.stripeStrings.pass
import typings.stripe.stripeStrings.prepaid
import typings.stripe.stripeStrings.unavailable
import typings.stripe.stripeStrings.unchecked
import typings.stripe.stripeStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * You can store multiple cards on a customer in order to charge the customer later. You
  * can also store multiple debit cards on a recipient in order to transfer to those cards later.
  */
trait ICard
  extends ICardHash
     with IExternalAccount
     with IStripeSource {
  /**
    * The account this card belongs to. This attribute will not be in the
    * card object if the card belongs to a customer or recipient instead.
    * [Expandable]
    */
  var account: js.UndefOr[String | IAccount] = js.undefined
  /**
    * Only applicable on accounts (not customers or recipients). The
    * card can be used as a transfer destination for funds in this
    * currency.
    */
  var currency: js.UndefOr[String] = js.undefined
  /**
    * The customer that this card belongs to. This attribute will not be
    * in the card object if the card belongs to an account or recipient
    * instead.
    */
  var customer: js.UndefOr[String | ICustomer | Null] = js.undefined
  /**
    * Only applicable on accounts (not customers or recipients). This
    * indicates whether or not this card is the default external account
    * for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.undefined
  /**
    * The recipient that this card belongs to. This attribute will not be
    * in the card object if the card belongs to a customer or account
    * instead. [Expandable]
    */
  var recipient: js.UndefOr[String | IRecipient] = js.undefined
}

object ICard {
  @scala.inline
  def apply(
    brand: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown,
    country: String,
    cvc_check: pass | fail | unavailable | unchecked,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: credit | debit | prepaid | unknown_,
    id: String,
    last4: String,
    `object`: card,
    account: String | IAccount = null,
    address_city: String = null,
    address_country: String = null,
    address_line1: String = null,
    address_line1_check: pass | fail | unavailable | unchecked = null,
    address_line2: String = null,
    address_state: String = null,
    address_zip: String = null,
    address_zip_check: pass | fail | unavailable | unchecked = null,
    currency: String = null,
    customer: String | ICustomer = null,
    default_for_currency: js.UndefOr[Boolean] = js.undefined,
    dynamic_last4: String = null,
    metadata: IMetadata = null,
    name: String = null,
    number: String = null,
    recipient: String | IRecipient = null,
    tokenization_method: apple_pay | android_pay = null
  ): ICard = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (address_city != null) __obj.updateDynamic("address_city")(address_city.asInstanceOf[js.Any])
    if (address_country != null) __obj.updateDynamic("address_country")(address_country.asInstanceOf[js.Any])
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1.asInstanceOf[js.Any])
    if (address_line1_check != null) __obj.updateDynamic("address_line1_check")(address_line1_check.asInstanceOf[js.Any])
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2.asInstanceOf[js.Any])
    if (address_state != null) __obj.updateDynamic("address_state")(address_state.asInstanceOf[js.Any])
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip.asInstanceOf[js.Any])
    if (address_zip_check != null) __obj.updateDynamic("address_zip_check")(address_zip_check.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency.asInstanceOf[js.Any])
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (tokenization_method != null) __obj.updateDynamic("tokenization_method")(tokenization_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICard]
  }
}

