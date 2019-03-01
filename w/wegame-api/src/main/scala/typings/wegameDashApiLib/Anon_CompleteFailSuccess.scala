package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailSuccess extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 是否使用带 shareTicket 的转发详情
    */
  var withShareTicket: scala.Boolean
}

object Anon_CompleteFailSuccess {
  @scala.inline
  def apply(
    withShareTicket: scala.Boolean,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): Anon_CompleteFailSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("withShareTicket")(withShareTicket)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_CompleteFailSuccess]
  }
}

