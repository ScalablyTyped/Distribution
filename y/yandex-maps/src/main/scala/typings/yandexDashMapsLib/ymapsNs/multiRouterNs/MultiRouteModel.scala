package typings
package yandexDashMapsLib.ymapsNs.multiRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.multiRouter.MultiRouteModel")
@js.native
class MultiRouteModel protected ()
  extends yandexDashMapsLib.ymapsNs.IEventEmitter {
  def this(referencePoints: js.Array[yandexDashMapsLib.ymapsNs.IMultiRouteReferencePoint]) = this()
  def this(referencePoints: js.Array[yandexDashMapsLib.ymapsNs.IMultiRouteReferencePoint], params: yandexDashMapsLib.ymapsNs.IMultiRouteParams) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var properties: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  def destroy(): scala.Unit = js.native
  def getAllPoints(): js.Array[WayPointModel | ViaPointModel] = js.native
  def getJson(): js.Object = js.native
  def getParams(): yandexDashMapsLib.ymapsNs.IMultiRouteParams = js.native
  def getPoints(): js.Array[WayPointModel | ViaPointModel] = js.native
  def getReferencePointIndexes(): js.Object = js.native
  def getReferencePoints(): js.Array[yandexDashMapsLib.ymapsNs.IMultiRouteReferencePoint] = js.native
  def getRoutes(): js.Array[yandexDashMapsLib.ymapsNs.multiRouterNs.drivingNs.RouteModel] | js.Array[yandexDashMapsLib.ymapsNs.multiRouterNs.masstransitNs.RouteModel] = js.native
  def getViaPoints(): js.Array[ViaPointModel] = js.native
  def getWayPoints(): js.Array[WayPointModel] = js.native
  def setParams(params: yandexDashMapsLib.ymapsNs.IMultiRouteParams): scala.Unit = js.native
  def setParams(params: yandexDashMapsLib.ymapsNs.IMultiRouteParams, extend: scala.Boolean): scala.Unit = js.native
  def setParams(
    params: yandexDashMapsLib.ymapsNs.IMultiRouteParams,
    extend: scala.Boolean,
    clearRequests: scala.Boolean
  ): scala.Unit = js.native
  def setReferencePoints(referencePoints: js.Array[yandexDashMapsLib.ymapsNs.IMultiRouteReferencePoint]): scala.Unit = js.native
  def setReferencePoints(
    referencePoints: js.Array[yandexDashMapsLib.ymapsNs.IMultiRouteReferencePoint],
    viaIndexes: js.Array[scala.Double]
  ): scala.Unit = js.native
  def setReferencePoints(
    referencePoints: js.Array[yandexDashMapsLib.ymapsNs.IMultiRouteReferencePoint],
    viaIndexes: js.Array[scala.Double],
    clearRequests: scala.Boolean
  ): scala.Unit = js.native
}

