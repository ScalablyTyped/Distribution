package typings
package stripeLib.stripeMod.tokensNs

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
  var card: js.UndefOr[java.lang.String | stripeLib.stripeMod.cardsNs.ICardSourceCreationOptions] = js.undefined
}

object ICardTokenCreationOptions {
  @scala.inline
  def apply(
    card: java.lang.String | stripeLib.stripeMod.cardsNs.ICardSourceCreationOptions = null,
    customer: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null
  ): ICardTokenCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[ICardTokenCreationOptions]
  }
}

