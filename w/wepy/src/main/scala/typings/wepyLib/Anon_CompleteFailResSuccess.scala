package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailResSuccess extends js.Object {
  def complete(): scala.Unit
  def fail(): scala.Unit
  def success(res: Anon_Scale): scala.Unit
}

object Anon_CompleteFailResSuccess {
  @scala.inline
  def apply(
    complete: js.Function0[scala.Unit],
    fail: js.Function0[scala.Unit],
    success: js.Function1[Anon_Scale, scala.Unit]
  ): Anon_CompleteFailResSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    __obj.updateDynamic("fail")(fail)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_CompleteFailResSuccess]
  }
}

