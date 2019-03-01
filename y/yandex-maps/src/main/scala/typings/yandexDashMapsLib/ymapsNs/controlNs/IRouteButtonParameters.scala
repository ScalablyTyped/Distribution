package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouteButtonParameters extends js.Object {
  var options: js.UndefOr[yandexDashMapsLib.Anon_AdjustMapMargin] = js.undefined
  var state: js.UndefOr[yandexDashMapsLib.Anon_Expanded] = js.undefined
}

object IRouteButtonParameters {
  @scala.inline
  def apply(
    options: yandexDashMapsLib.Anon_AdjustMapMargin = null,
    state: yandexDashMapsLib.Anon_Expanded = null
  ): IRouteButtonParameters = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IRouteButtonParameters]
  }
}

