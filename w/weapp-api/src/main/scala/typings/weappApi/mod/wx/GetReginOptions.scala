package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReginOptions extends CommonCallbackOptions {
  @JSName("success")
  var success_GetReginOptions: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* res */ GetReginSuccessCallbackOptions, Unit], Unit]
  ] = js.undefined
}

object GetReginOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* callback */ js.Function1[/* res */ GetReginSuccessCallbackOptions, Unit] => Unit = null
  ): GetReginOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetReginOptions]
  }
}

