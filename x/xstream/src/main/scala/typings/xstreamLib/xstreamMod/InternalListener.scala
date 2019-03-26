package typings
package xstreamLib.xstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalListener[T] extends js.Object {
  def _c(): scala.Unit
  def _e(err: js.Any): scala.Unit
  def _n(v: T): scala.Unit
}

object InternalListener {
  @scala.inline
  def apply[T](_c: () => scala.Unit, _e: js.Any => scala.Unit, _n: T => scala.Unit): InternalListener[T] = {
    val __obj = js.Dynamic.literal(_c = js.Any.fromFunction0(_c), _e = js.Any.fromFunction1(_e), _n = js.Any.fromFunction1(_n))
  
    __obj.asInstanceOf[InternalListener[T]]
  }
}

