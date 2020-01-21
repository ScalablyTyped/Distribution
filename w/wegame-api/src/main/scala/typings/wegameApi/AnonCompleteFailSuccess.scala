package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompleteFailSuccess extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 是否使用带 shareTicket 的转发详情
    */
  var withShareTicket: Boolean
}

object AnonCompleteFailSuccess {
  @scala.inline
  def apply(
    withShareTicket: Boolean,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): AnonCompleteFailSuccess = {
    val __obj = js.Dynamic.literal(withShareTicket = withShareTicket.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AnonCompleteFailSuccess]
  }
}

