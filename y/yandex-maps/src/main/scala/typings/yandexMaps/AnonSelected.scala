package typings.yandexMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelected extends js.Object {
  var selected: js.UndefOr[Boolean] = js.undefined
}

object AnonSelected {
  @scala.inline
  def apply(selected: js.UndefOr[Boolean] = js.undefined): AnonSelected = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelected]
  }
}

