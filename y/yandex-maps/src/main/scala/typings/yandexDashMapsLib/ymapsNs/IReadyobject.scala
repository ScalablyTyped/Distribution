package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReadyobject extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
  var errorCallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var require: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var successCallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IReadyobject {
  @scala.inline
  def apply(
    context: js.Object = null,
    errorCallback: js.Function0[scala.Unit] = null,
    require: js.Array[java.lang.String] = null,
    successCallback: js.Function0[scala.Unit] = null
  ): IReadyobject = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (errorCallback != null) __obj.updateDynamic("errorCallback")(errorCallback)
    if (require != null) __obj.updateDynamic("require")(require)
    if (successCallback != null) __obj.updateDynamic("successCallback")(successCallback)
    __obj.asInstanceOf[IReadyobject]
  }
}

