package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailResShareTicket extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var shareTicket: java.lang.String
  var success: js.UndefOr[js.Function1[/* res */ Anon_EncryptedDataErrMsg, scala.Unit]] = js.undefined
}

object Anon_CompleteFailResShareTicket {
  @scala.inline
  def apply(
    shareTicket: java.lang.String,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function1[/* res */ Anon_EncryptedDataErrMsg, scala.Unit] = null
  ): Anon_CompleteFailResShareTicket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("shareTicket")(shareTicket)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_CompleteFailResShareTicket]
  }
}

