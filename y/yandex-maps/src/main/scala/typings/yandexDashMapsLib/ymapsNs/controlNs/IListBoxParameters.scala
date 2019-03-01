package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListBoxParameters extends IButtonParameters {
  @JSName("options")
  var options_IListBoxParameters: js.UndefOr[IBaseButtonParametersOptions with yandexDashMapsLib.Anon_NoPlacemark] = js.undefined
}

object IListBoxParameters {
  @scala.inline
  def apply(
    data: yandexDashMapsLib.Anon_Content = null,
    options: IBaseButtonParametersOptions with yandexDashMapsLib.Anon_NoPlacemark = null,
    state: yandexDashMapsLib.Anon_Enabled = null
  ): IListBoxParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (options != null) __obj.updateDynamic("options")(options)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IListBoxParameters]
  }
}

