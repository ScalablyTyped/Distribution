package typings.webDashBluetooth

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEventHandlers extends js.Object {
  def onserviceadded(ev: Event): js.Any
  def onservicechanged(ev: Event): js.Any
  def onserviceremoved(ev: Event): js.Any
}

object ServiceEventHandlers {
  @scala.inline
  def apply(
    onserviceadded: Event => js.Any,
    onservicechanged: Event => js.Any,
    onserviceremoved: Event => js.Any
  ): ServiceEventHandlers = {
    val __obj = js.Dynamic.literal(onserviceadded = js.Any.fromFunction1(onserviceadded), onservicechanged = js.Any.fromFunction1(onservicechanged), onserviceremoved = js.Any.fromFunction1(onserviceremoved))
  
    __obj.asInstanceOf[ServiceEventHandlers]
  }
}

