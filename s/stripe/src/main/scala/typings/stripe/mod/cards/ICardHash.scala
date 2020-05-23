package typings.stripe.mod.cards

import typings.stripe.mod.ICardHashInfo
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
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
    funding: credit | debit | prepaid | unknown_,
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
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], address_city = address_city.asInstanceOf[js.Any], address_country = address_country.asInstanceOf[js.Any], address_line1 = address_line1.asInstanceOf[js.Any], address_line1_check = address_line1_check.asInstanceOf[js.Any], address_line2 = address_line2.asInstanceOf[js.Any], address_state = address_state.asInstanceOf[js.Any], address_zip = address_zip.asInstanceOf[js.Any], address_zip_check = address_zip_check.asInstanceOf[js.Any], dynamic_last4 = dynamic_last4.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tokenization_method = tokenization_method.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardHash]
  }
}

