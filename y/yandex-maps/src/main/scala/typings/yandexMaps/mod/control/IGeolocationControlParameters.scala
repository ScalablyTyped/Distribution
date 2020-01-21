package typings.yandexMaps.mod.control

import typings.yandexMaps.AnonEnabled
import typings.yandexMaps.AnonImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeolocationControlParameters extends IButtonParameters {
  @JSName("data")
  var data_IGeolocationControlParameters: js.UndefOr[AnonImage] = js.undefined
  @JSName("options")
  var options_IGeolocationControlParameters: js.UndefOr[IBaseButtonParametersOptions] = js.undefined
}

object IGeolocationControlParameters {
  @scala.inline
  def apply(data: AnonImage = null, options: IBaseButtonParametersOptions = null, state: AnonEnabled = null): IGeolocationControlParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeolocationControlParameters]
  }
}

