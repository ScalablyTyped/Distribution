package typings.yandexDashMaps.yandexDashMapsMod.control

import typings.yandexDashMaps.Anon_Content
import typings.yandexDashMaps.Anon_Enabled
import typings.yandexDashMaps.Anon_NoPlacemark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListBoxParameters extends IButtonParameters {
  @JSName("options")
  var options_IListBoxParameters: js.UndefOr[IBaseButtonParametersOptions with Anon_NoPlacemark] = js.undefined
}

object IListBoxParameters {
  @scala.inline
  def apply(
    data: Anon_Content = null,
    options: IBaseButtonParametersOptions with Anon_NoPlacemark = null,
    state: Anon_Enabled = null
  ): IListBoxParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListBoxParameters]
  }
}

