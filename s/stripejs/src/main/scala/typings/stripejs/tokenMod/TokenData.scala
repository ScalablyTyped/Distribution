package typings.stripejs.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenData extends js.Object {
  var address_city: String
  /**
    * A two character country code identifying the country
    * @example 'US'
    */
  var address_country: js.UndefOr[String] = js.undefined
  /**
    * Fields for billing address information.
    */
  var address_line1: String
  var address_line2: js.UndefOr[String] = js.undefined
  var address_state: String
  var address_zip: String
  /**
    * The amount paid, not a decimal. In USD this is in cents.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * Used to add a card to an account
    * NOTE: Currently, the only supported currency for debit card payouts is 'usd'
    */
  var currency: js.UndefOr[String] = js.undefined
  /**
    * The Cardholder name
    */
  var name: String
}

object TokenData {
  @scala.inline
  def apply(
    address_city: String,
    address_line1: String,
    address_state: String,
    address_zip: String,
    name: String,
    address_country: String = null,
    address_line2: String = null,
    amount: js.UndefOr[Double] = js.undefined,
    currency: String = null
  ): TokenData = {
    val __obj = js.Dynamic.literal(address_city = address_city.asInstanceOf[js.Any], address_line1 = address_line1.asInstanceOf[js.Any], address_state = address_state.asInstanceOf[js.Any], address_zip = address_zip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (address_country != null) __obj.updateDynamic("address_country")(address_country.asInstanceOf[js.Any])
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2.asInstanceOf[js.Any])
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenData]
  }
}

