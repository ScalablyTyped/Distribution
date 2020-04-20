package typings.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalProducer[T] extends js.Object {
  def _start(listener: InternalListener[T]): Unit
  def _stop(): Unit
}

object InternalProducer {
  @scala.inline
  def apply[T](_start: InternalListener[T] => Unit, _stop: () => Unit): InternalProducer[T] = {
    val __obj = js.Dynamic.literal(_start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop))
    __obj.asInstanceOf[InternalProducer[T]]
  }
}

