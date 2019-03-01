package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopRecordOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_StopRecordOptions: js.UndefOr[js.Function1[/* res */ RecordResponse, scala.Unit]] = js.undefined
}

object StopRecordOptions {
  @scala.inline
  def apply(
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ RecordResponse, scala.Unit] = null
  ): StopRecordOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[StopRecordOptions]
  }
}

