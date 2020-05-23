package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Expanded
import typings.yandexMaps.anon.IBaseButtonParametersOptiAdjustMapMargin
import typings.yandexMaps.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFullscreenControlParameters extends js.Object {
  var data: js.UndefOr[Title] = js.undefined
  var options: js.UndefOr[IBaseButtonParametersOptiAdjustMapMargin] = js.undefined
  var state: js.UndefOr[Expanded] = js.undefined
}

object IFullscreenControlParameters {
  @scala.inline
  def apply(
    data: Title = null,
    options: IBaseButtonParametersOptiAdjustMapMargin = null,
    state: Expanded = null
  ): IFullscreenControlParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFullscreenControlParameters]
  }
}

