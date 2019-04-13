package typings
package stripeLib.stripeMod.tokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardToken extends ITokenBase {
  /**
    * Hash describing the card used to make the charge
    */
  var card: js.UndefOr[stripeLib.stripeMod.cardsNs.ICardHash] = js.undefined
}

object ICardToken {
  @scala.inline
  def apply(
    client_ip: java.lang.String,
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: stripeLib.stripeLibStrings.token,
    `type`: stripeLib.stripeLibStrings.card | stripeLib.stripeLibStrings.bank_account,
    used: scala.Boolean,
    card: stripeLib.stripeMod.cardsNs.ICardHash = null
  ): ICardToken = {
    val __obj = js.Dynamic.literal(client_ip = client_ip, created = created, id = id, livemode = livemode, used = used)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card)
    __obj.asInstanceOf[ICardToken]
  }
}

