package typings.yandexMaps.mod.multiRouter

import typings.yandexMaps.mod.IEventEmitter
import typings.yandexMaps.mod.IMultiRouteParams
import typings.yandexMaps.mod.IMultiRouteReferencePoint
import typings.yandexMaps.mod.data.Manager
import typings.yandexMaps.mod.multiRouter.driving.RouteModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "multiRouter.MultiRouteModel")
@js.native
class MultiRouteModel protected () extends IEventEmitter {
  def this(referencePoints: js.Array[IMultiRouteReferencePoint]) = this()
  def this(referencePoints: js.Array[IMultiRouteReferencePoint], params: IMultiRouteParams) = this()
  
  def destroy(): Unit = js.native
  
  def getAllPoints(): js.Array[WayPointModel | ViaPointModel] = js.native
  
  def getJson(): js.Object = js.native
  
  def getParams(): IMultiRouteParams = js.native
  
  def getPoints(): js.Array[WayPointModel | ViaPointModel] = js.native
  
  def getReferencePointIndexes(): js.Object = js.native
  
  def getReferencePoints(): js.Array[IMultiRouteReferencePoint] = js.native
  
  def getRoutes(): js.Array[RouteModel | typings.yandexMaps.mod.multiRouter.masstransit.RouteModel] = js.native
  
  def getViaPoints(): js.Array[ViaPointModel] = js.native
  
  def getWayPoints(): js.Array[WayPointModel] = js.native
  
  var properties: Manager = js.native
  
  def setParams(params: IMultiRouteParams): Unit = js.native
  def setParams(params: IMultiRouteParams, extend: js.UndefOr[scala.Nothing], clearRequests: Boolean): Unit = js.native
  def setParams(params: IMultiRouteParams, extend: Boolean): Unit = js.native
  def setParams(params: IMultiRouteParams, extend: Boolean, clearRequests: Boolean): Unit = js.native
  
  def setReferencePoints(referencePoints: js.Array[IMultiRouteReferencePoint]): Unit = js.native
  def setReferencePoints(
    referencePoints: js.Array[IMultiRouteReferencePoint],
    viaIndexes: js.UndefOr[scala.Nothing],
    clearRequests: Boolean
  ): Unit = js.native
  def setReferencePoints(referencePoints: js.Array[IMultiRouteReferencePoint], viaIndexes: js.Array[Double]): Unit = js.native
  def setReferencePoints(
    referencePoints: js.Array[IMultiRouteReferencePoint],
    viaIndexes: js.Array[Double],
    clearRequests: Boolean
  ): Unit = js.native
}
