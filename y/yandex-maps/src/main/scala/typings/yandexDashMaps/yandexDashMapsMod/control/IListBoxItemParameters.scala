package typings.yandexDashMaps.yandexDashMapsMod.control

import typings.yandexDashMaps.Anon_ContentString
import typings.yandexDashMaps.Anon_Layout
import typings.yandexDashMaps.Anon_Selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListBoxItemParameters extends js.Object {
  var data: js.UndefOr[Anon_ContentString] = js.undefined
  var options: js.UndefOr[Anon_Layout] = js.undefined
  var state: js.UndefOr[Anon_Selected] = js.undefined
}

object IListBoxItemParameters {
  @scala.inline
  def apply(data: Anon_ContentString = null, options: Anon_Layout = null, state: Anon_Selected = null): IListBoxItemParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (options != null) __obj.updateDynamic("options")(options)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IListBoxItemParameters]
  }
}

