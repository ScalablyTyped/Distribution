package typings.webDashBluetooth

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEventHandlers extends js.Object {
  def onserviceadded(`this`: this.type, ev: Event): js.Any
  def onservicechanged(`this`: this.type, ev: Event): js.Any
  def onserviceremoved(`this`: this.type, ev: Event): js.Any
}

object ServiceEventHandlers {
  @scala.inline
  def apply(
    onserviceadded: (ServiceEventHandlers, Event) => js.Any,
    onservicechanged: (ServiceEventHandlers, Event) => js.Any,
    onserviceremoved: (ServiceEventHandlers, Event) => js.Any
  ): ServiceEventHandlers = {
    val __obj = js.Dynamic.literal(onserviceadded = js.Any.fromFunction2(onserviceadded), onservicechanged = js.Any.fromFunction2(onservicechanged), onserviceremoved = js.Any.fromFunction2(onserviceremoved))
  
    __obj.asInstanceOf[ServiceEventHandlers]
  }
}

