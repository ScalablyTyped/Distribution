package typings.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalProducer[T] extends js.Object {
  def _start(listener: InternalListener[T]): Unit = js.native
  def _stop(): Unit = js.native
}

object InternalProducer {
  @scala.inline
  def apply[T](_start: InternalListener[T] => Unit, _stop: () => Unit): InternalProducer[T] = {
    val __obj = js.Dynamic.literal(_start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop))
    __obj.asInstanceOf[InternalProducer[T]]
  }
  @scala.inline
  implicit class InternalProducerOps[Self <: InternalProducer[_], T] (val x: Self with InternalProducer[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_start(value: InternalListener[T] => Unit): Self = this.set("_start", js.Any.fromFunction1(value))
    @scala.inline
    def set_stop(value: () => Unit): Self = this.set("_stop", js.Any.fromFunction0(value))
  }
  
}

