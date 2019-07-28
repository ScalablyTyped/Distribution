package typings.stripe.stripeMod.cardsNs

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardUpdateOptions extends IDataOptionsWithMetadata {
  var address_city: js.UndefOr[String] = js.undefined
  var address_country: js.UndefOr[String] = js.undefined
  var address_line1: js.UndefOr[String] = js.undefined
  var address_line2: js.UndefOr[String] = js.undefined
  var address_state: js.UndefOr[String] = js.undefined
  var address_zip: js.UndefOr[String] = js.undefined
  /**
    * Only applicable on accounts (not customers or recipients).
    * If set to true, this card will become the default external
    * account for its currency.
    *
    * Managed accounts only
    */
  var default_for_currency: js.UndefOr[Boolean] = js.undefined
  var exp_month: js.UndefOr[Double] = js.undefined
  var exp_year: js.UndefOr[Double] = js.undefined
  /**
    * Cardholder name
    */
  var name: js.UndefOr[String] = js.undefined
}

object ICardUpdateOptions {
  @scala.inline
  def apply(
    address_city: String = null,
    address_country: String = null,
    address_line1: String = null,
    address_line2: String = null,
    address_state: String = null,
    address_zip: String = null,
    default_for_currency: js.UndefOr[Boolean] = js.undefined,
    exp_month: Int | Double = null,
    exp_year: Int | Double = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    name: String = null
  ): ICardUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (address_city != null) __obj.updateDynamic("address_city")(address_city)
    if (address_country != null) __obj.updateDynamic("address_country")(address_country)
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1)
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2)
    if (address_state != null) __obj.updateDynamic("address_state")(address_state)
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip)
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency)
    if (exp_month != null) __obj.updateDynamic("exp_month")(exp_month.asInstanceOf[js.Any])
    if (exp_year != null) __obj.updateDynamic("exp_year")(exp_year.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ICardUpdateOptions]
  }
}

