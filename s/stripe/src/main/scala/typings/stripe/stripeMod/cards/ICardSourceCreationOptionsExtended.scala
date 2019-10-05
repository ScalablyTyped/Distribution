package typings.stripe.stripeMod.cards

import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardSourceCreationOptionsExtended extends ICardSourceCreationOptions {
  /**
    * Required when adding a card to an account (not applicable to a
    * customers or recipients). The card (which must be a debit card) can be
    * used as a transfer destination for funds in this currency. Currently, the
    * only supported currency for debit card transfers is usd.
    *
    * Managed accounts only.
    */
  var currency: js.UndefOr[String] = js.undefined
  /**
    * Only applicable on accounts (not customers or recipients). If you set
    * this to true (or if this is the first external account being added in this
    * currency) this card will become the default external account for its
    * currency.
    *
    * Managed accounts only.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.undefined
}

object ICardSourceCreationOptionsExtended {
  @scala.inline
  def apply(
    exp_month: Double,
    exp_year: Double,
    number: String,
    `object`: card,
    address_city: String = null,
    address_country: String = null,
    address_line1: String = null,
    address_line2: String = null,
    address_state: String = null,
    address_zip: String = null,
    currency: String = null,
    cvc: String = null,
    default_for_currency: js.UndefOr[Boolean] = js.undefined,
    metadata: IOptionsMetadata = null,
    name: String = null
  ): ICardSourceCreationOptionsExtended = {
    val __obj = js.Dynamic.literal(exp_month = exp_month, exp_year = exp_year, number = number)
    __obj.updateDynamic("object")(`object`)
    if (address_city != null) __obj.updateDynamic("address_city")(address_city)
    if (address_country != null) __obj.updateDynamic("address_country")(address_country)
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1)
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2)
    if (address_state != null) __obj.updateDynamic("address_state")(address_state)
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (cvc != null) __obj.updateDynamic("cvc")(cvc)
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ICardSourceCreationOptionsExtended]
  }
}

