package typings.stripe.stripeMod.cardsNs

import typings.stripe.stripeMod.ICardHashInfo
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
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
import typings.stripe.stripeStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hash describing the card used to make the charge
  */
trait ICardHash
  extends IResourceObject
     with ICardHashInfo {
  /**
    * Value is 'card'
    */
  @JSName("object")
  var object_ICardHash: card
}

object ICardHash {
  @scala.inline
  def apply(
    brand: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown,
    country: String,
    cvc_check: pass | fail | unavailable | unchecked,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: credit | debit | prepaid | unknown,
    id: String,
    last4: String,
    `object`: card,
    address_city: String = null,
    address_country: String = null,
    address_line1: String = null,
    address_line1_check: pass | fail | unavailable | unchecked = null,
    address_line2: String = null,
    address_state: String = null,
    address_zip: String = null,
    address_zip_check: pass | fail | unavailable | unchecked = null,
    dynamic_last4: String = null,
    metadata: IMetadata = null,
    name: String = null,
    number: String = null,
    tokenization_method: apple_pay | android_pay = null
  ): ICardHash = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country, cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month, exp_year = exp_year, fingerprint = fingerprint, funding = funding.asInstanceOf[js.Any], id = id, last4 = last4)
    __obj.updateDynamic("object")(`object`)
    if (address_city != null) __obj.updateDynamic("address_city")(address_city)
    if (address_country != null) __obj.updateDynamic("address_country")(address_country)
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1)
    if (address_line1_check != null) __obj.updateDynamic("address_line1_check")(address_line1_check.asInstanceOf[js.Any])
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2)
    if (address_state != null) __obj.updateDynamic("address_state")(address_state)
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip)
    if (address_zip_check != null) __obj.updateDynamic("address_zip_check")(address_zip_check.asInstanceOf[js.Any])
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number)
    if (tokenization_method != null) __obj.updateDynamic("tokenization_method")(tokenization_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardHash]
  }
}

