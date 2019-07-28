package typings.yandexDashMoneyDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cards extends js.Object {
  var cards: js.UndefOr[Anon_AllowedCscrequired] = js.undefined
  var wallet: js.UndefOr[Anon_Allowed] = js.undefined
}

object Anon_Cards {
  @scala.inline
  def apply(cards: Anon_AllowedCscrequired = null, wallet: Anon_Allowed = null): Anon_Cards = {
    val __obj = js.Dynamic.literal()
    if (cards != null) __obj.updateDynamic("cards")(cards)
    if (wallet != null) __obj.updateDynamic("wallet")(wallet)
    __obj.asInstanceOf[Anon_Cards]
  }
}

