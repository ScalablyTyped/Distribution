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

