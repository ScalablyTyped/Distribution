package typings.wavesurferJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer extends js.Object {
  def fireEvent(eventName: String, args: js.Any*): Unit = js.native
  def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor = js.native
  def once(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor = js.native
  def un(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def unAll(): Unit = js.native
}

object Observer {
  @scala.inline
  def apply(
    fireEvent: (String, /* repeated */ js.Any) => Unit,
    on: (String, js.Function1[/* repeated */ js.Any, Unit]) => ListenerDescriptor,
    once: (String, js.Function1[/* repeated */ js.Any, Unit]) => ListenerDescriptor,
    un: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit,
    unAll: () => Unit
  ): Observer = {
    val __obj = js.Dynamic.literal(fireEvent = js.Any.fromFunction2(fireEvent), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), un = js.Any.fromFunction2(un), unAll = js.Any.fromFunction0(unAll))
    __obj.asInstanceOf[Observer]
  }
  @scala.inline
  implicit class ObserverOps[Self <: Observer] (val x: Self) extends AnyVal {
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
    def setFireEvent(value: (String, /* repeated */ js.Any) => Unit): Self = this.set("fireEvent", js.Any.fromFunction2(value))
    @scala.inline
    def setOn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => ListenerDescriptor): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setOnce(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => ListenerDescriptor): Self = this.set("once", js.Any.fromFunction2(value))
    @scala.inline
    def setUn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit): Self = this.set("un", js.Any.fromFunction2(value))
    @scala.inline
    def setUnAll(value: () => Unit): Self = this.set("unAll", js.Any.fromFunction0(value))
  }
  
}

