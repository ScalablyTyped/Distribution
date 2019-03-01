package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouteEditorParameters extends js.Object {
  var data: js.UndefOr[yandexDashMapsLib.Anon_Image] = js.undefined
  var options: js.UndefOr[IBaseButtonParametersOptions] = js.undefined
  var state: js.UndefOr[js.Object] = js.undefined
}

object IRouteEditorParameters {
  @scala.inline
  def apply(
    data: yandexDashMapsLib.Anon_Image = null,
    options: IBaseButtonParametersOptions = null,
    state: js.Object = null
  ): IRouteEditorParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (options != null) __obj.updateDynamic("options")(options)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IRouteEditorParameters]
  }
}

