package typings.yandexMoneySdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCards extends js.Object {
  var cards: js.UndefOr[AnonAllowedCscrequired] = js.undefined
  var wallet: js.UndefOr[AnonAllowed] = js.undefined
}

object AnonCards {
  @scala.inline
  def apply(cards: AnonAllowedCscrequired = null, wallet: AnonAllowed = null): AnonCards = {
    val __obj = js.Dynamic.literal()
    if (cards != null) __obj.updateDynamic("cards")(cards.asInstanceOf[js.Any])
    if (wallet != null) __obj.updateDynamic("wallet")(wallet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCards]
  }
}

