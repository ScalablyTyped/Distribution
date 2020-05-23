package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cards extends js.Object {
  var cards: js.UndefOr[Cscrequired] = js.undefined
  var wallet: js.UndefOr[Allowed] = js.undefined
}

object Cards {
  @scala.inline
  def apply(cards: Cscrequired = null, wallet: Allowed = null): Cards = {
    val __obj = js.Dynamic.literal()
    if (cards != null) __obj.updateDynamic("cards")(cards.asInstanceOf[js.Any])
    if (wallet != null) __obj.updateDynamic("wallet")(wallet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cards]
  }
}

