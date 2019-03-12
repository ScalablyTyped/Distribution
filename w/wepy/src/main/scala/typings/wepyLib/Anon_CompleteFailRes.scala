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
  def apply(complete: () => scala.Unit, fail: () => scala.Unit, success: Anon_Northeast => scala.Unit): Anon_CompleteFailRes = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), fail = js.Any.fromFunction0(fail), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_CompleteFailRes]
  }
}

