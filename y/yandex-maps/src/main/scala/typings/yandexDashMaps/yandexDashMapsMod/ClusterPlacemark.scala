package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.yandexDashMapsMod.collection.Item
import typings.yandexDashMaps.yandexDashMapsMod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.IParentOnMap because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.IChild because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.IGeoObject because var conflicts: events, options. Inlined geometry, properties, state, getOverlay, getOverlaySync */ @JSImport("yandex-maps", "ClusterPlacemark")
@js.native
class ClusterPlacemark protected () extends Item {
  def this(geometry: js.Array[Double], properties: IClusterPlacemarkProperties) = this()
  def this(geometry: js.Object, properties: IClusterPlacemarkProperties) = this()
  def this(geometry: IPointGeometry, properties: IClusterPlacemarkProperties) = this()
  def this(
    geometry: js.Array[Double],
    properties: IClusterPlacemarkProperties,
    options: IClusterPlacemarkOptions
  ) = this()
  def this(geometry: js.Object, properties: IClusterPlacemarkProperties, options: IClusterPlacemarkOptions) = this()
  def this(
    geometry: IPointGeometry,
    properties: IClusterPlacemarkProperties,
    options: IClusterPlacemarkOptions
  ) = this()
  var geometry: IGeometry | Null = js.native
  var properties: IDataManager = js.native
  var state: IDataManager | Manager = js.native
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  def getGeoObjects(): js.Array[IGeoObject] = js.native
  def getOverlay(): js.Promise[IOverlay | Null] = js.native
  def getOverlaySync(): IOverlay | Null = js.native
}

