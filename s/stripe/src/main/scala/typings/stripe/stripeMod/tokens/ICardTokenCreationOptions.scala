package typings.stripe.stripeMod.tokens

import typings.stripe.stripeMod.cards.ICardSourceCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardTokenCreationOptions extends ITokenCreationOptionsBase {
  /**
    * The card this token will represent. If you also pass in a customer,
    * the card must be the ID of a card belonging to the customer.
    * Otherwise, if you do not pass a customer, a object containing a
    * user's credit card details, with the options described below.
    */
  var card: js.UndefOr[String | ICardSourceCreationOptions] = js.undefined
}

object ICardTokenCreationOptions {
  @scala.inline
  def apply(
    card: String | ICardSourceCreationOptions = null,
    customer: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null
  ): ICardTokenCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardTokenCreationOptions]
  }
}

