package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "Map")
@js.native
class Map protected () extends IDomEventEmitter {
  def this(parentElement: java.lang.String, state: IMapState) = this()
  def this(parentElement: stdLib.HTMLElement, state: IMapState) = this()
  def this(parentElement: java.lang.String, state: IMapState, options: IMapOptions) = this()
  def this(parentElement: stdLib.HTMLElement, state: IMapState, options: IMapOptions) = this()
  var action: yandexDashMapsLib.yandexDashMapsMod.mapNs.actionNs.Manager = js.native
  var balloon: yandexDashMapsLib.yandexDashMapsMod.mapNs.Balloon = js.native
  var behaviors: yandexDashMapsLib.yandexDashMapsMod.mapNs.behaviorNs.Manager = js.native
  var container: yandexDashMapsLib.yandexDashMapsMod.mapNs.Container = js.native
  var controls: yandexDashMapsLib.yandexDashMapsMod.controlNs.Manager = js.native
  var converter: yandexDashMapsLib.yandexDashMapsMod.mapNs.Converter = js.native
  var copyrights: yandexDashMapsLib.yandexDashMapsMod.mapNs.Copyrights = js.native
  var cursors: yandexDashMapsLib.yandexDashMapsMod.utilNs.cursorNs.Manager = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  @JSName("events")
  var events_Map: yandexDashMapsLib.yandexDashMapsMod.eventNs.Manager = js.native
  var geoObjects: yandexDashMapsLib.yandexDashMapsMod.mapNs.GeoObjects = js.native
  var hint: yandexDashMapsLib.yandexDashMapsMod.mapNs.Hint = js.native
  var layers: yandexDashMapsLib.yandexDashMapsMod.mapNs.layerNs.Manager = js.native
  var margin: yandexDashMapsLib.yandexDashMapsMod.mapNs.marginNs.Manager = js.native
  var options: yandexDashMapsLib.yandexDashMapsMod.optionNs.Manager = js.native
  var panes: yandexDashMapsLib.yandexDashMapsMod.mapNs.paneNs.Manager = js.native
  var zoomRange: yandexDashMapsLib.yandexDashMapsMod.mapNs.ZoomRange = js.native
  def destroy(): scala.Unit = js.native
  def getBounds(): js.Array[js.Array[scala.Double]] = js.native
  def getBounds(options: IMapMarginOptions): js.Array[js.Array[scala.Double]] = js.native
  def getCenter(): js.Array[scala.Double] = js.native
  def getCenter(options: IMapMarginOptions): js.Array[scala.Double] = js.native
  def getGlobalPixelCenter(): js.Array[scala.Double] = js.native
  def getGlobalPixelCenter(options: IMapMarginOptions): js.Array[scala.Double] = js.native
  def getPanoramaManager(): js.Promise[yandexDashMapsLib.yandexDashMapsMod.panoramaNs.Manager] = js.native
  def getType(): java.lang.String | MapType = js.native
  def getZoom(): scala.Double = js.native
  def panTo(center: js.Array[scala.Double | js.Object]): js.Promise[scala.Unit] = js.native
  def panTo(center: js.Array[scala.Double | js.Object], options: IMapPanOptions): js.Promise[scala.Unit] = js.native
  def setBounds(bounds: js.Array[js.Array[scala.Double]]): js.Promise[scala.Unit] = js.native
  def setBounds(bounds: js.Array[js.Array[scala.Double]], options: IMapBoundsOptions): js.Promise[scala.Unit] = js.native
  def setCenter(center: js.Array[scala.Double]): js.Promise[scala.Unit] = js.native
  def setCenter(center: js.Array[scala.Double], zoom: scala.Double): js.Promise[scala.Unit] = js.native
  def setCenter(center: js.Array[scala.Double], zoom: scala.Double, options: IMapPositionOptions): js.Promise[scala.Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[scala.Double]): js.Promise[scala.Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[scala.Double], zoom: scala.Double): js.Promise[scala.Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[scala.Double], zoom: scala.Double, options: IMapPositionOptions): js.Promise[scala.Unit] = js.native
  def setType(`type`: java.lang.String): js.Promise[scala.Unit] = js.native
  def setType(`type`: java.lang.String, options: IMapCheckZoomRangeOptions): js.Promise[scala.Unit] = js.native
  def setType(`type`: MapType): js.Promise[scala.Unit] = js.native
  def setType(`type`: MapType, options: IMapCheckZoomRangeOptions): js.Promise[scala.Unit] = js.native
  def setZoom(zoom: scala.Double): js.Promise[scala.Unit] = js.native
  def setZoom(zoom: scala.Double, options: IMapZoomOptions): js.Promise[scala.Unit] = js.native
}

