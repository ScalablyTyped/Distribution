package typings.wavesurferJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer extends js.Object {
  def fireEvent(eventName: String, args: js.Any*): Unit
  def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor
  def once(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor
  def un(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit
  def unAll(): Unit
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
}

