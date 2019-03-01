package typings
package atUifabricUtilitiesLib.libAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICancelable[T] extends js.Object {
  def cancel(): scala.Unit
  def flush(): T
  def pending(): scala.Boolean
}

object ICancelable {
  @scala.inline
  def apply[T](cancel: js.Function0[scala.Unit], flush: js.Function0[T], pending: js.Function0[scala.Boolean]): ICancelable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("pending")(pending)
    __obj.asInstanceOf[ICancelable[T]]
  }
}

