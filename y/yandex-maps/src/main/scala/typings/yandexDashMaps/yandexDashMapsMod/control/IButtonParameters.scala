package typings.yandexDashMaps.yandexDashMapsMod.control

import typings.yandexDashMaps.Anon_Auto
import typings.yandexDashMaps.Anon_Content
import typings.yandexDashMaps.Anon_Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonParameters extends js.Object {
  var data: js.UndefOr[Anon_Content] = js.undefined
  var options: js.UndefOr[IBaseButtonParametersOptions with Anon_Auto] = js.undefined
  var state: js.UndefOr[Anon_Enabled] = js.undefined
}

object IButtonParameters {
  @scala.inline
  def apply(
    data: Anon_Content = null,
    options: IBaseButtonParametersOptions with Anon_Auto = null,
    state: Anon_Enabled = null
  ): IButtonParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButtonParameters]
  }
}

