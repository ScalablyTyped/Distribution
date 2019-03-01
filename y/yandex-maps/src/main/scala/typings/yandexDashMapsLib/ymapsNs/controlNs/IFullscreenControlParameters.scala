package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFullscreenControlParameters extends js.Object {
  var data: js.UndefOr[yandexDashMapsLib.Anon_Title] = js.undefined
  var options: js.UndefOr[IBaseButtonParametersOptions with yandexDashMapsLib.Anon_CollapseOnBlur] = js.undefined
  var state: js.UndefOr[yandexDashMapsLib.Anon_Expanded] = js.undefined
}

object IFullscreenControlParameters {
  @scala.inline
  def apply(
    data: yandexDashMapsLib.Anon_Title = null,
    options: IBaseButtonParametersOptions with yandexDashMapsLib.Anon_CollapseOnBlur = null,
    state: yandexDashMapsLib.Anon_Expanded = null
  ): IFullscreenControlParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (options != null) __obj.updateDynamic("options")(options)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IFullscreenControlParameters]
  }
}

