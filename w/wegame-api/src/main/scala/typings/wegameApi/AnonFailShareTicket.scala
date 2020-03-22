package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailShareTicket extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var shareTicket: String
  var success: js.UndefOr[js.Function1[/* res */ AnonEncryptedDataErrMsg, Unit]] = js.undefined
}

object AnonFailShareTicket {
  @scala.inline
  def apply(
    shareTicket: String,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: /* res */ AnonEncryptedDataErrMsg => Unit = null
  ): AnonFailShareTicket = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AnonFailShareTicket]
  }
}

