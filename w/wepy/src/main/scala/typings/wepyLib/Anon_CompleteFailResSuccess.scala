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
  def apply(complete: () => scala.Unit, fail: () => scala.Unit, success: Anon_Scale => scala.Unit): Anon_CompleteFailResSuccess = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), fail = js.Any.fromFunction0(fail), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_CompleteFailResSuccess]
  }
}

