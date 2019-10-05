package typings.yandexDashMaps.yandexDashMapsMod.control

import typings.yandexDashMaps.Anon_AdjustMapMargin
import typings.yandexDashMaps.Anon_Expanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouteButtonParameters extends js.Object {
  var options: js.UndefOr[Anon_AdjustMapMargin] = js.undefined
  var state: js.UndefOr[Anon_Expanded] = js.undefined
}

object IRouteButtonParameters {
  @scala.inline
  def apply(options: Anon_AdjustMapMargin = null, state: Anon_Expanded = null): IRouteButtonParameters = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IRouteButtonParameters]
  }
}

