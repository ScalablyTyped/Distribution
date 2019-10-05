package typings.yandexDashMaps.yandexDashMapsMod.multiRouter

import typings.yandexDashMaps.Anon_ActiveRouteAutoSelection
import typings.yandexDashMaps.yandexDashMapsMod.GeoObjectCollection
import typings.yandexDashMaps.yandexDashMapsMod.IEventManager
import typings.yandexDashMaps.yandexDashMapsMod.IGeoObject
import typings.yandexDashMaps.yandexDashMapsMod.IMultiRouteModelJson
import typings.yandexDashMaps.yandexDashMapsMod.Map
import typings.yandexDashMaps.yandexDashMapsMod.multiRouter.driving.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.MultiRoute")
@js.native
class MultiRoute protected () extends IGeoObject {
  def this(model: IMultiRouteModelJson) = this()
  def this(model: MultiRouteModel) = this()
  def this(model: IMultiRouteModelJson, options: Anon_ActiveRouteAutoSelection) = this()
  def this(model: MultiRouteModel, options: Anon_ActiveRouteAutoSelection) = this()
  var editor: EditorAddon = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  var model: MultiRouteModel = js.native
  def getActiveRoute(): Route | typings.yandexDashMaps.yandexDashMapsMod.multiRouter.masstransit.Route | Null = js.native
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
  def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
  def getRoutes(): GeoObjectCollection = js.native
  def getViaPoints(): GeoObjectCollection = js.native
  def getWayPoints(): GeoObjectCollection = js.native
  def setActiveRoute(): Unit = js.native
  def setActiveRoute(route: Route): Unit = js.native
  def setActiveRoute(route: typings.yandexDashMaps.yandexDashMapsMod.multiRouter.masstransit.Route): Unit = js.native
}

