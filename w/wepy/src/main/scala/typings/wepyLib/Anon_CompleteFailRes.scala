package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailRes extends js.Object {
  def complete(): scala.Unit
  def fail(): scala.Unit
  def success(res: Anon_Northeast): scala.Unit
}

object Anon_CompleteFailRes {
  @scala.inline
  def apply(
    complete: js.Function0[scala.Unit],
    fail: js.Function0[scala.Unit],
    success: js.Function1[Anon_Northeast, scala.Unit]
  ): Anon_CompleteFailRes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    __obj.updateDynamic("fail")(fail)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_CompleteFailRes]
  }
}

