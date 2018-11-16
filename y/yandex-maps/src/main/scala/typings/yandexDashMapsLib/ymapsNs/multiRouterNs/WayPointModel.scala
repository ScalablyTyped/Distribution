package typings
package yandexDashMapsLib.ymapsNs.multiRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.multiRouter.WayPointModel")
@js.native
class WayPointModel ()
  extends yandexDashMapsLib.ymapsNs.IEventEmitter {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var geometry: yandexDashMapsLib.ymapsNs.geometryNs.baseNs.Point = js.native
  var multiRoute: MultiRouteModel = js.native
  var properties: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  def destroy(): scala.Unit = js.native
  def getReferencePoint(): js.Object = js.native
  def getReferencePointIndex(): scala.Double = js.native
  def setReferencePoint(referencePoint: js.Object): scala.Unit = js.native
  def update(wayPointJson: js.Object): scala.Unit = js.native
}

