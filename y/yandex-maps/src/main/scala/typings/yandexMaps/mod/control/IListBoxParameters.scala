package typings.yandexMaps.mod.control

import typings.yandexMaps.AnonContent
import typings.yandexMaps.AnonEnabled
import typings.yandexMaps.AnonNoPlacemark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListBoxParameters extends IButtonParameters {
  @JSName("options")
  var options_IListBoxParameters: js.UndefOr[IBaseButtonParametersOptions with AnonNoPlacemark] = js.undefined
}

object IListBoxParameters {
  @scala.inline
  def apply(
    data: AnonContent = null,
    options: IBaseButtonParametersOptions with AnonNoPlacemark = null,
    state: AnonEnabled = null
  ): IListBoxParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListBoxParameters]
  }
}

