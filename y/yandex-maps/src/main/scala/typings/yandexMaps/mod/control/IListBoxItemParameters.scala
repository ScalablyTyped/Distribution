package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.ContentString
import typings.yandexMaps.anon.Layout
import typings.yandexMaps.anon.Selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListBoxItemParameters extends js.Object {
  var data: js.UndefOr[ContentString] = js.undefined
  var options: js.UndefOr[Layout] = js.undefined
  var state: js.UndefOr[Selected] = js.undefined
}

object IListBoxItemParameters {
  @scala.inline
  def apply(data: ContentString = null, options: Layout = null, state: Selected = null): IListBoxItemParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListBoxItemParameters]
  }
}

