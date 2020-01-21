package typings.yandexMaps.mod.control

import typings.yandexMaps.AnonAuto
import typings.yandexMaps.AnonContent
import typings.yandexMaps.AnonEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonParameters extends js.Object {
  var data: js.UndefOr[AnonContent] = js.undefined
  var options: js.UndefOr[IBaseButtonParametersOptions with AnonAuto] = js.undefined
  var state: js.UndefOr[AnonEnabled] = js.undefined
}

object IButtonParameters {
  @scala.inline
  def apply(
    data: AnonContent = null,
    options: IBaseButtonParametersOptions with AnonAuto = null,
    state: AnonEnabled = null
  ): IButtonParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButtonParameters]
  }
}

