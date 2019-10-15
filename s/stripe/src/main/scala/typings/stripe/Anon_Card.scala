package typings.stripe

import typings.stripe.stripeMod.cards.ICardSourceCreationOptionsExtended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Card extends js.Object {
  var card: js.UndefOr[String | ICardSourceCreationOptionsExtended] = js.undefined
}

object Anon_Card {
  @scala.inline
  def apply(card: String | ICardSourceCreationOptionsExtended = null): Anon_Card = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Card]
  }
}

