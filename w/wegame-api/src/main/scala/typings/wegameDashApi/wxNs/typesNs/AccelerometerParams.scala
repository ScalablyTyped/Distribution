package typings.wegameDashApi.wxNs.typesNs

import typings.wegameDashApi.wegameDashApiStrings.game
import typings.wegameDashApi.wegameDashApiStrings.normal
import typings.wegameDashApi.wegameDashApiStrings.ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var interval: game | ui | normal
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AccelerometerParams {
  @scala.inline
  def apply(
    interval: game | ui | normal,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): AccelerometerParams = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AccelerometerParams]
  }
}

