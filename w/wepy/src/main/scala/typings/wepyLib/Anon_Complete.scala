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
  def apply[T](
    complete: js.Function0[scala.Unit],
    fail: js.Function0[scala.Unit],
    success: js.Function1[T, scala.Unit]
  ): Anon_Complete[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    __obj.updateDynamic("fail")(fail)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_Complete[T]]
  }
}

