package typings.webBluetooth

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEventHandlers extends js.Object {
  def onserviceadded(ev: Event_): js.Any
  def onservicechanged(ev: Event_): js.Any
  def onserviceremoved(ev: Event_): js.Any
}

object ServiceEventHandlers {
  @scala.inline
  def apply(
    onserviceadded: Event_ => js.Any,
    onservicechanged: Event_ => js.Any,
    onserviceremoved: Event_ => js.Any
  ): ServiceEventHandlers = {
    val __obj = js.Dynamic.literal(onserviceadded = js.Any.fromFunction1(onserviceadded), onservicechanged = js.Any.fromFunction1(onservicechanged), onserviceremoved = js.Any.fromFunction1(onserviceremoved))
    __obj.asInstanceOf[ServiceEventHandlers]
  }
}

