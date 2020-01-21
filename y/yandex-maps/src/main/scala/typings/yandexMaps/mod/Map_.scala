package typings.yandexMaps.mod

import typings.std.HTMLElement
import typings.yandexMaps.mod.map.Container
import typings.yandexMaps.mod.map.Converter
import typings.yandexMaps.mod.map.Copyrights
import typings.yandexMaps.mod.map.GeoObjects
import typings.yandexMaps.mod.map.Hint
import typings.yandexMaps.mod.map.ZoomRange
import typings.yandexMaps.mod.map.action.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "Map")
@js.native
class Map_ protected () extends IEventEmitter {
  def this(parentElement: String, state: IMapState) = this()
  def this(parentElement: HTMLElement, state: IMapState) = this()
  def this(parentElement: String, state: IMapState, options: IMapOptions) = this()
  def this(parentElement: HTMLElement, state: IMapState, options: IMapOptions) = this()
  var action: Manager = js.native
  var balloon: typings.yandexMaps.mod.map.Balloon = js.native
  var behaviors: typings.yandexMaps.mod.map.behavior.Manager = js.native
  var container: Container = js.native
  var controls: typings.yandexMaps.mod.control.Manager = js.native
  var converter: Converter = js.native
  var copyrights: Copyrights = js.native
  var cursors: typings.yandexMaps.mod.util.cursor.Manager = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  @JSName("events")
  var events_Map_ : typings.yandexMaps.mod.event.Manager = js.native
  var geoObjects: GeoObjects = js.native
  var hint: Hint = js.native
  var layers: typings.yandexMaps.mod.map.layer.Manager = js.native
  var margin: typings.yandexMaps.mod.map.margin.Manager = js.native
  var options: typings.yandexMaps.mod.option.Manager = js.native
  var panes: typings.yandexMaps.mod.map.pane.Manager = js.native
  var zoomRange: ZoomRange = js.native
  def destroy(): Unit = js.native
  def getBounds(): js.Array[js.Array[Double]] = js.native
  def getBounds(options: IMapMarginOptions): js.Array[js.Array[Double]] = js.native
  def getCenter(): js.Array[Double] = js.native
  def getCenter(options: IMapMarginOptions): js.Array[Double] = js.native
  def getGlobalPixelCenter(): js.Array[Double] = js.native
  def getGlobalPixelCenter(options: IMapMarginOptions): js.Array[Double] = js.native
  def getPanoramaManager(): js.Promise[typings.yandexMaps.mod.panorama.Manager] = js.native
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

