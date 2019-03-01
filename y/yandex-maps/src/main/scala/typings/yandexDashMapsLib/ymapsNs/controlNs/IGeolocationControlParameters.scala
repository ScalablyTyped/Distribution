package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeolocationControlParameters extends IButtonParameters {
  @JSName("data")
  var data_IGeolocationControlParameters: js.UndefOr[yandexDashMapsLib.Anon_Image] = js.undefined
  @JSName("options")
  var options_IGeolocationControlParameters: js.UndefOr[IBaseButtonParametersOptions] = js.undefined
}

object IGeolocationControlParameters {
  @scala.inline
  def apply(
    data: yandexDashMapsLib.Anon_Image = null,
    options: IBaseButtonParametersOptions = null,
    state: yandexDashMapsLib.Anon_Enabled = null
  ): IGeolocationControlParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (options != null) __obj.updateDynamic("options")(options)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IGeolocationControlParameters]
  }
}

