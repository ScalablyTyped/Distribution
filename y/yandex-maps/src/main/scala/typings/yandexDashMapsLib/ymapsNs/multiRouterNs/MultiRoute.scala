package typings
package yandexDashMapsLib.ymapsNs.multiRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.multiRouter.MultiRoute")
@js.native
class MultiRoute protected ()
  extends yandexDashMapsLib.ymapsNs.IGeoObject {
  def this(model: yandexDashMapsLib.ymapsNs.IMultiRouteModelJson) = this()
  def this(model: MultiRouteModel) = this()
  def this(model: yandexDashMapsLib.ymapsNs.IMultiRouteModelJson, options: yandexDashMapsLib.Anon_Index) = this()
  def this(model: MultiRouteModel, options: yandexDashMapsLib.Anon_Index) = this()
  var editor: EditorAddon = js.native
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var model: MultiRouteModel = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  def getActiveRoute(): yandexDashMapsLib.ymapsNs.multiRouterNs.drivingNs.Route | yandexDashMapsLib.ymapsNs.multiRouterNs.masstransitNs.Route | scala.Null = js.native
  def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  /* CompleteClass */
  override def getMap(): yandexDashMapsLib.ymapsNs.Map = js.native
  def getPixelBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  def getRoutes(): yandexDashMapsLib.ymapsNs.GeoObjectCollection = js.native
  def getViaPoints(): yandexDashMapsLib.ymapsNs.GeoObjectCollection = js.native
  def getWayPoints(): yandexDashMapsLib.ymapsNs.GeoObjectCollection = js.native
  def setActiveRoute(): scala.Unit = js.native
  def setActiveRoute(
    route: yandexDashMapsLib.ymapsNs.multiRouterNs.drivingNs.Route | yandexDashMapsLib.ymapsNs.multiRouterNs.masstransitNs.Route
  ): scala.Unit = js.native
}

