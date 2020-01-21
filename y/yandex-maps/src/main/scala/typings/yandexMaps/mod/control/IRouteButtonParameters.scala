package typings.yandexMaps.mod.control

import typings.yandexMaps.AnonAdjustMapMargin
import typings.yandexMaps.AnonExpanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouteButtonParameters extends js.Object {
  var options: js.UndefOr[AnonAdjustMapMargin] = js.undefined
  var state: js.UndefOr[AnonExpanded] = js.undefined
}

object IRouteButtonParameters {
  @scala.inline
  def apply(options: AnonAdjustMapMargin = null, state: AnonExpanded = null): IRouteButtonParameters = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteButtonParameters]
  }
}

