package typings
package yandexDashMapsLib.ymapsNs.behaviorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.behavior.RouteEditor")
@js.native
class RouteEditor ()
  extends yandexDashMapsLib.ymapsNs.IBehavior {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  def getRoute(): yandexDashMapsLib.ymapsNs.routerNs.Route = js.native
  def getState(): java.lang.String = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IControlParent): this.type = js.native
  def setState(): scala.Unit = js.native
  def setState(state: java.lang.String): scala.Unit = js.native
}

