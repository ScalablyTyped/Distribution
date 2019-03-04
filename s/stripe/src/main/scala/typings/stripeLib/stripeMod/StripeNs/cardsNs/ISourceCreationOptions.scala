package typings
package stripeLib.stripeMod.StripeNs.cardsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceCreationOptions extends js.Object {
  var address_city: js.UndefOr[java.lang.String] = js.undefined
  var address_country: js.UndefOr[java.lang.String] = js.undefined
  var address_line1: js.UndefOr[java.lang.String] = js.undefined
  var address_line2: js.UndefOr[java.lang.String] = js.undefined
  var address_state: js.UndefOr[java.lang.String] = js.undefined
  var address_zip: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Card security code. Required unless your account is registered in
    * Australia, Canada, or the United States. Highly recommended to always
    * include this value.
    */
  var cvc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Two digit number representing the card's expiration month.
    */
  var exp_month: scala.Double
  /**
    * Two or four digit number representing the card's expiration year.
    */
  var exp_year: scala.Double
  var metadata: js.UndefOr[stripeLib.stripeMod.StripeNs.IOptionsMetadata] = js.undefined
  /**
    * Cardholder's full name.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The card number, as a string without any separators.
    */
  var number: java.lang.String
  /**
    * The type of payment source. Should be "card".
    */
  var `object`: stripeLib.stripeLibStrings.card
}

object ISourceCreationOptions {
  @scala.inline
  def apply(
    exp_month: scala.Double,
    exp_year: scala.Double,
    number: java.lang.String,
    `object`: stripeLib.stripeLibStrings.card,
    address_city: java.lang.String = null,
    address_country: java.lang.String = null,
    address_line1: java.lang.String = null,
    address_line2: java.lang.String = null,
    address_state: java.lang.String = null,
    address_zip: java.lang.String = null,
    cvc: java.lang.String = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null,
    name: java.lang.String = null
  ): ISourceCreationOptions = {
    val __obj = js.Dynamic.literal(exp_month = exp_month, exp_year = exp_year, number = number)
    __obj.updateDynamic("object")(`object`)
    if (address_city != null) __obj.updateDynamic("address_city")(address_city)
    if (address_country != null) __obj.updateDynamic("address_country")(address_country)
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1)
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2)
    if (address_state != null) __obj.updateDynamic("address_state")(address_state)
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip)
    if (cvc != null) __obj.updateDynamic("cvc")(cvc)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ISourceCreationOptions]
  }
}

