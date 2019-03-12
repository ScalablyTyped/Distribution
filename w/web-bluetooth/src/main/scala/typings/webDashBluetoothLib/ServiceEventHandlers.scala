package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEventHandlers extends js.Object {
  def onserviceadded(`this`: this.type, ev: stdLib.Event): js.Any
  def onservicechanged(`this`: this.type, ev: stdLib.Event): js.Any
  def onserviceremoved(`this`: this.type, ev: stdLib.Event): js.Any
}

object ServiceEventHandlers {
  @scala.inline
  def apply(
    onserviceadded: (ServiceEventHandlers, stdLib.Event) => js.Any,
    onservicechanged: (ServiceEventHandlers, stdLib.Event) => js.Any,
    onserviceremoved: (ServiceEventHandlers, stdLib.Event) => js.Any
  ): ServiceEventHandlers = {
    val __obj = js.Dynamic.literal(onserviceadded = js.Any.fromFunction2(onserviceadded), onservicechanged = js.Any.fromFunction2(onservicechanged), onserviceremoved = js.Any.fromFunction2(onserviceremoved))
  
    __obj.asInstanceOf[ServiceEventHandlers]
  }
}

