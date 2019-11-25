package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailResShareTicket extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var shareTicket: String
  var success: js.UndefOr[js.Function1[/* res */ Anon_EncryptedDataErrMsg, Unit]] = js.undefined
}

object Anon_CompleteFailResShareTicket {
  @scala.inline
  def apply(
    shareTicket: String,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: /* res */ Anon_EncryptedDataErrMsg => Unit = null
  ): Anon_CompleteFailResShareTicket = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[Anon_CompleteFailResShareTicket]
  }
}

