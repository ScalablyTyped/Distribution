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
    onserviceadded: js.Function2[ServiceEventHandlers, stdLib.Event, js.Any],
    onservicechanged: js.Function2[ServiceEventHandlers, stdLib.Event, js.Any],
    onserviceremoved: js.Function2[ServiceEventHandlers, stdLib.Event, js.Any]
  ): ServiceEventHandlers = {
    val __obj = js.Dynamic.literal(onserviceadded = onserviceadded, onservicechanged = onservicechanged, onserviceremoved = onserviceremoved)
  
    __obj.asInstanceOf[ServiceEventHandlers]
  }
}

