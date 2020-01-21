package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCenterLocationSuccCbOptions extends CommonCallbackOptions {
  @JSName("success")
  def success_MGetCenterLocationSuccCbOptions(res: LocationBaseOptions): Unit
}

object GetCenterLocationSuccCbOptions {
  @scala.inline
  def apply(
    success: LocationBaseOptions => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null
  ): GetCenterLocationSuccCbOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetCenterLocationSuccCbOptions]
  }
}

