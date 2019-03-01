package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCardConfig extends js.Object {
  var cardList: js.Array[Card]
  var success: js.UndefOr[js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_CardList, scala.Unit]] = js.undefined
}

object AddCardConfig {
  @scala.inline
  def apply(
    cardList: js.Array[Card],
    success: js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_CardList, scala.Unit] = null
  ): AddCardConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cardList")(cardList)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[AddCardConfig]
  }
}

