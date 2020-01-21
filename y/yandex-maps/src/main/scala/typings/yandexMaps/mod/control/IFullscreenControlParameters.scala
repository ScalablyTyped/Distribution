package typings.yandexMaps.mod.control

import typings.yandexMaps.AnonCollapseOnBlur
import typings.yandexMaps.AnonExpanded
import typings.yandexMaps.AnonTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFullscreenControlParameters extends js.Object {
  var data: js.UndefOr[AnonTitle] = js.undefined
  var options: js.UndefOr[IBaseButtonParametersOptions with AnonCollapseOnBlur] = js.undefined
  var state: js.UndefOr[AnonExpanded] = js.undefined
}

object IFullscreenControlParameters {
  @scala.inline
  def apply(
    data: AnonTitle = null,
    options: IBaseButtonParametersOptions with AnonCollapseOnBlur = null,
    state: AnonExpanded = null
  ): IFullscreenControlParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFullscreenControlParameters]
  }
}

