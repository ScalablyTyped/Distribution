package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.AdjustMapMargin
import typings.yandexMaps.anon.Expanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouteButtonParameters extends js.Object {
  var options: js.UndefOr[AdjustMapMargin] = js.undefined
  var state: js.UndefOr[Expanded] = js.undefined
}

object IRouteButtonParameters {
  @scala.inline
  def apply(options: AdjustMapMargin = null, state: Expanded = null): IRouteButtonParameters = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteButtonParameters]
  }
}

