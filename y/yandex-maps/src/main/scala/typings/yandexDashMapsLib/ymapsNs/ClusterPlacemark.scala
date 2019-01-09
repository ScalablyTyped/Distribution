package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.ymapsNs.IGeoObject because var conflicts: events, options. Inlined geometry, properties, state, getOverlay, getOverlaySync */ @JSGlobal("ymaps.ClusterPlacemark")
@js.native
class ClusterPlacemark protected ()
  extends yandexDashMapsLib.ymapsNs.collectionNs.Item {
  def this(geometry: js.Array[scala.Double], properties: IClusterPlacemarkProperties) = this()
  def this(geometry: js.Object, properties: IClusterPlacemarkProperties) = this()
  def this(geometry: IPointGeometry, properties: IClusterPlacemarkProperties) = this()
  def this(geometry: js.Array[scala.Double], properties: IClusterPlacemarkProperties, options: IClusterPlacemarkOptions) = this()
  def this(geometry: js.Object, properties: IClusterPlacemarkProperties, options: IClusterPlacemarkOptions) = this()
  def this(geometry: IPointGeometry, properties: IClusterPlacemarkProperties, options: IClusterPlacemarkOptions) = this()
  var geometry: IGeometry | scala.Null = js.native
  var properties: IDataManager = js.native
  var state: IDataManager | yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  def getGeoObjects(): js.Array[IGeoObject] = js.native
  def getOverlay(): js.Promise[IOverlay | scala.Null] = js.native
  def getOverlaySync(): IOverlay | scala.Null = js.native
}

