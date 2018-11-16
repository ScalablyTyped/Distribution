package typings
package stripeLib.stripeMod.StripeNs.cardsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICardUpdateOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  var address_city: js.UndefOr[java.lang.String] = js.undefined
  var address_country: js.UndefOr[java.lang.String] = js.undefined
  var address_line1: js.UndefOr[java.lang.String] = js.undefined
  var address_line2: js.UndefOr[java.lang.String] = js.undefined
  var address_state: js.UndefOr[java.lang.String] = js.undefined
  var address_zip: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Only applicable on accounts (not customers or recipients).
               * If set to true, this card will become the default external
               * account for its currency.
               *
               * Managed accounts only
               */
  var default_for_currency: js.UndefOr[scala.Boolean] = js.undefined
  var exp_month: js.UndefOr[scala.Double] = js.undefined
  var exp_year: js.UndefOr[scala.Double] = js.undefined
  /**
               * Cardholder name
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

