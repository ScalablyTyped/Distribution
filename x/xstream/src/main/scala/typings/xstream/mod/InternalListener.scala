package typings.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalListener[T] extends js.Object {
  def _c(): Unit
  def _e(err: js.Any): Unit
  def _n(v: T): Unit
}

object InternalListener {
  @scala.inline
  def apply[T](_c: () => Unit, _e: js.Any => Unit, _n: T => Unit): InternalListener[T] = {
    val __obj = js.Dynamic.literal(_c = js.Any.fromFunction0(_c), _e = js.Any.fromFunction1(_e), _n = js.Any.fromFunction1(_n))
    __obj.asInstanceOf[InternalListener[T]]
  }
}

