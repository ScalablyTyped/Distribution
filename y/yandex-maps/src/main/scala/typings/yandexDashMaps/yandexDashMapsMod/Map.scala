package typings.yandexDashMaps.yandexDashMapsMod

import typings.std.HTMLElement
import typings.yandexDashMaps.yandexDashMapsMod.mapNs.Container
import typings.yandexDashMaps.yandexDashMapsMod.mapNs.Converter
import typings.yandexDashMaps.yandexDashMapsMod.mapNs.Copyrights
import typings.yandexDashMaps.yandexDashMapsMod.mapNs.GeoObjects
import typings.yandexDashMaps.yandexDashMapsMod.mapNs.Hint
import typings.yandexDashMaps.yandexDashMapsMod.mapNs.ZoomRange
import typings.yandexDashMaps.yandexDashMapsMod.mapNs.actionNs.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "Map")
@js.native
class Map protected () extends IDomEventEmitter {
  def this(parentElement: String, state: IMapState) = this()
  def this(parentElement: HTMLElement, state: IMapState) = this()
  def this(parentElement: String, state: IMapState, options: IMapOptions) = this()
  def this(parentElement: HTMLElement, state: IMapState, options: IMapOptions) = this()
  var action: Manager = js.native
  var balloon: typings.yandexDashMaps.yandexDashMapsMod.mapNs.Balloon = js.native
  var behaviors: typings.yandexDashMaps.yandexDashMapsMod.mapNs.behaviorNs.Manager = js.native
  var container: Container = js.native
  var controls: typings.yandexDashMaps.yandexDashMapsMod.controlNs.Manager = js.native
  var converter: Converter = js.native
  var copyrights: Copyrights = js.native
  var cursors: typings.yandexDashMaps.yandexDashMapsMod.utilNs.cursorNs.Manager = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  @JSName("events")
  var events_Map: typings.yandexDashMaps.yandexDashMapsMod.eventNs.Manager = js.native
  var geoObjects: GeoObjects = js.native
  var hint: Hint = js.native
  var layers: typings.yandexDashMaps.yandexDashMapsMod.mapNs.layerNs.Manager = js.native
  var margin: typings.yandexDashMaps.yandexDashMapsMod.mapNs.marginNs.Manager = js.native
  var options: typings.yandexDashMaps.yandexDashMapsMod.optionNs.Manager = js.native
  var panes: typings.yandexDashMaps.yandexDashMapsMod.mapNs.paneNs.Manager = js.native
  var zoomRange: ZoomRange = js.native
  def destroy(): Unit = js.native
  def getBounds(): js.Array[js.Array[Double]] = js.native
  def getBounds(options: IMapMarginOptions): js.Array[js.Array[Double]] = js.native
  def getCenter(): js.Array[Double] = js.native
  def getCenter(options: IMapMarginOptions): js.Array[Double] = js.native
  def getGlobalPixelCenter(): js.Array[Double] = js.native
  def getGlobalPixelCenter(options: IMapMarginOptions): js.Array[Double] = js.native
  def getPanoramaManager(): js.Promise[typings.yandexDashMaps.yandexDashMapsMod.panoramaNs.Manager] = js.native
  def getType(): String | MapType = js.native
  def getZoom(): Double = js.native
  def panTo(center: js.Array[Double | js.Object]): js.Promise[Unit] = js.native
  def panTo(center: js.Array[Double | js.Object], options: IMapPanOptions): js.Promise[Unit] = js.native
  def setBounds(bounds: js.Array[js.Array[Double]]): js.Promise[Unit] = js.native
  def setBounds(bounds: js.Array[js.Array[Double]], options: IMapBoundsOptions): js.Promise[Unit] = js.native
  def setCenter(center: js.Array[Double]): js.Promise[Unit] = js.native
  def setCenter(center: js.Array[Double], zoom: Double): js.Promise[Unit] = js.native
  def setCenter(center: js.Array[Double], zoom: Double, options: IMapPositionOptions): js.Promise[Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[Double]): js.Promise[Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[Double], zoom: Double): js.Promise[Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[Double], zoom: Double, options: IMapPositionOptions): js.Promise[Unit] = js.native
  def setType(`type`: String): js.Promise[Unit] = js.native
  def setType(`type`: String, options: IMapCheckZoomRangeOptions): js.Promise[Unit] = js.native
  def setType(`type`: MapType): js.Promise[Unit] = js.native
  def setType(`type`: MapType, options: IMapCheckZoomRangeOptions): js.Promise[Unit] = js.native
  def setZoom(zoom: Double): js.Promise[Unit] = js.native
  def setZoom(zoom: Double, options: IMapZoomOptions): js.Promise[Unit] = js.native
}

