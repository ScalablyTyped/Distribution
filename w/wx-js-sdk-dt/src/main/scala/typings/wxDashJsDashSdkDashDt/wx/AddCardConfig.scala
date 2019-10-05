package typings.wxDashJsDashSdkDashDt.wx

import typings.wxDashJsDashSdkDashDt.Anon_CardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCardConfig extends js.Object {
  var cardList: js.Array[Card]
  var success: js.UndefOr[js.Function1[/* res */ Anon_CardList, Unit]] = js.undefined
}

object AddCardConfig {
  @scala.inline
  def apply(cardList: js.Array[Card], success: /* res */ Anon_CardList => Unit = null): AddCardConfig = {
    val __obj = js.Dynamic.literal(cardList = cardList)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AddCardConfig]
  }
}

