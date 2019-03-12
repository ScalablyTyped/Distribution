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
  def apply[T](cancel: () => scala.Unit, flush: () => T, pending: () => scala.Boolean): ICancelable[T] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush), pending = js.Any.fromFunction0(pending))
  
    __obj.asInstanceOf[ICancelable[T]]
  }
}

