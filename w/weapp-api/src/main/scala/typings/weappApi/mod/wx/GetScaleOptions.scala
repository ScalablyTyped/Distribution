package typings.weappApi.mod.wx

import typings.weappApi.anon.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScaleOptions extends CommonCallbackOptions {
  @JSName("success")
  var success_GetScaleOptions: js.UndefOr[js.Function1[/* callback */ js.Function1[/* res */ Scale, Unit], Unit]] = js.undefined
}

object GetScaleOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* callback */ js.Function1[/* res */ Scale, Unit] => Unit = null
  ): GetScaleOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetScaleOptions]
  }
}

