package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Content
import typings.yandexMaps.anon.Enabled
import typings.yandexMaps.anon.IBaseButtonParametersOpti
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonParameters extends js.Object {
  var data: js.UndefOr[Content] = js.undefined
  var options: js.UndefOr[IBaseButtonParametersOpti] = js.undefined
  var state: js.UndefOr[Enabled] = js.undefined
}

object IButtonParameters {
  @scala.inline
  def apply(data: Content = null, options: IBaseButtonParametersOpti = null, state: Enabled = null): IButtonParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButtonParameters]
  }
}

