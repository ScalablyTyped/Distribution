package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Card extends js.Object {
  var card: js.UndefOr[stripeLib.stripeMod.sourcesNs.ISourceCreationOptionsExtended] = js.undefined
}

object Anon_Card {
  @scala.inline
  def apply(card: stripeLib.stripeMod.sourcesNs.ISourceCreationOptionsExtended = null): Anon_Card = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Card]
  }
}

