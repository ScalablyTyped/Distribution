package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Complete[T] extends js.Object {
  def complete(): scala.Unit
  def fail(): scala.Unit
  def success(res: T): scala.Unit
}

object Anon_Complete {
  @scala.inline
  def apply[T](complete: () => scala.Unit, fail: () => scala.Unit, success: T => scala.Unit): Anon_Complete[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), fail = js.Any.fromFunction0(fail), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_Complete[T]]
  }
}

