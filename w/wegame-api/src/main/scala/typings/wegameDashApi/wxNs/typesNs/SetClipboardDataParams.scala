package typings.wegameDashApi.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetClipboardDataParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var data: String
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SetClipboardDataParams {
  @scala.inline
  def apply(data: String, complete: () => Unit = null, fail: () => Unit = null, success: () => Unit = null): SetClipboardDataParams = {
    val __obj = js.Dynamic.literal(data = data)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[SetClipboardDataParams]
  }
}

