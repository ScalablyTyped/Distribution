package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReadyobject extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
  var errorCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var require: js.UndefOr[js.Array[String]] = js.undefined
  var successCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IReadyobject {
  @scala.inline
  def apply(
    context: js.Object = null,
    errorCallback: () => Unit = null,
    require: js.Array[String] = null,
    successCallback: () => Unit = null
  ): IReadyobject = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (errorCallback != null) __obj.updateDynamic("errorCallback")(js.Any.fromFunction0(errorCallback))
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    if (successCallback != null) __obj.updateDynamic("successCallback")(js.Any.fromFunction0(successCallback))
    __obj.asInstanceOf[IReadyobject]
  }
}

