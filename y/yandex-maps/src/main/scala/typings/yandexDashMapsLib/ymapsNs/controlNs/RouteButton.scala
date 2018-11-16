package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(yandexDashMapsLib.ymapsNs.ICustomizable because Would inherit conflicting mutable fields List(events))*/
@JSGlobal("ymaps.control.RouteButton")
@js.native
class RouteButton ()
  extends yandexDashMapsLib.ymapsNs.IControl {
  def this(parameters: IRouteButtonParameters) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  var routePanel: yandexDashMapsLib.ymapsNs.IRoutePanel = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IControlParent): this.type = js.native
}

