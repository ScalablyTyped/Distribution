package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetKeepScreenOnParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var keepScreenOn: scala.Boolean
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object SetKeepScreenOnParams {
  @scala.inline
  def apply(
    keepScreenOn: scala.Boolean,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): SetKeepScreenOnParams = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SetKeepScreenOnParams]
  }
}

