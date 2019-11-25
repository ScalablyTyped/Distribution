package typings.yandexDashMaps.yandexDashMapsMod.control

import typings.yandexDashMaps.Anon_Enabled
import typings.yandexDashMaps.Anon_Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeolocationControlParameters extends IButtonParameters {
  @JSName("data")
  var data_IGeolocationControlParameters: js.UndefOr[Anon_Image] = js.undefined
  @JSName("options")
  var options_IGeolocationControlParameters: js.UndefOr[IBaseButtonParametersOptions] = js.undefined
}

object IGeolocationControlParameters {
  @scala.inline
  def apply(data: Anon_Image = null, options: IBaseButtonParametersOptions = null, state: Anon_Enabled = null): IGeolocationControlParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeolocationControlParameters]
  }
}

