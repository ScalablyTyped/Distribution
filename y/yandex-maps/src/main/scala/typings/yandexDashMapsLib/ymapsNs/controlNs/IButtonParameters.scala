package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonParameters extends js.Object {
  var data: js.UndefOr[yandexDashMapsLib.Anon_Content] = js.undefined
  var options: js.UndefOr[IBaseButtonParametersOptions with yandexDashMapsLib.Anon_Auto] = js.undefined
  var state: js.UndefOr[yandexDashMapsLib.Anon_Enabled] = js.undefined
}

object IButtonParameters {
  @scala.inline
  def apply(
    data: yandexDashMapsLib.Anon_Content = null,
    options: IBaseButtonParametersOptions with yandexDashMapsLib.Anon_Auto = null,
    state: yandexDashMapsLib.Anon_Enabled = null
  ): IButtonParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (options != null) __obj.updateDynamic("options")(options)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IButtonParameters]
  }
}

