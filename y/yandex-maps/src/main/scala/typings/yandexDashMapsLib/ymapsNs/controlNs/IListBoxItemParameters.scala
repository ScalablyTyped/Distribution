package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListBoxItemParameters extends js.Object {
  var data: js.UndefOr[yandexDashMapsLib.Anon_ContentString] = js.undefined
  var options: js.UndefOr[yandexDashMapsLib.Anon_Layout] = js.undefined
  var state: js.UndefOr[yandexDashMapsLib.Anon_Selected] = js.undefined
}

object IListBoxItemParameters {
  @scala.inline
  def apply(
    data: yandexDashMapsLib.Anon_ContentString = null,
    options: yandexDashMapsLib.Anon_Layout = null,
    state: yandexDashMapsLib.Anon_Selected = null
  ): IListBoxItemParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (options != null) __obj.updateDynamic("options")(options)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IListBoxItemParameters]
  }
}

