package typings.stripe

import typings.stripe.mod.cards.ICardSourceCreationOptionsExtended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCard extends js.Object {
  var card: js.UndefOr[String | ICardSourceCreationOptionsExtended] = js.undefined
}

object AnonCard {
  @scala.inline
  def apply(card: String | ICardSourceCreationOptionsExtended = null): AnonCard = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCard]
  }
}

