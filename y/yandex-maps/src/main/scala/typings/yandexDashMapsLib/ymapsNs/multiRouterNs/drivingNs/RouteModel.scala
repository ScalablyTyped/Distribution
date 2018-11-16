package typings
package yandexDashMapsLib.ymapsNs.multiRouterNs.drivingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.multiRouter.driving.RouteModel")
@js.native
class RouteModel ()
  extends yandexDashMapsLib.ymapsNs.IEventEmitter {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var multiRoute: yandexDashMapsLib.ymapsNs.multiRouterNs.MultiRouteModel = js.native
  var properties: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  def destroy(): scala.Unit = js.native
  def getPaths(): js.Array[PathModel] = js.native
  def getType(): java.lang.String = js.native
  def update(routeJson: js.Object): scala.Unit = js.native
}

