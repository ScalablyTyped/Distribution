package typings.yandexMaps.mod.control

import typings.yandexMaps.AnonContentString
import typings.yandexMaps.AnonLayout
import typings.yandexMaps.AnonSelected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListBoxItemParameters extends js.Object {
  var data: js.UndefOr[AnonContentString] = js.undefined
  var options: js.UndefOr[AnonLayout] = js.undefined
  var state: js.UndefOr[AnonSelected] = js.undefined
}

object IListBoxItemParameters {
  @scala.inline
  def apply(data: AnonContentString = null, options: AnonLayout = null, state: AnonSelected = null): IListBoxItemParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListBoxItemParameters]
  }
}

