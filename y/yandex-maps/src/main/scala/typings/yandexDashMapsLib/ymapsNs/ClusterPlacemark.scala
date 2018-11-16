package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(yandexDashMapsLib.ymapsNs.IGeoObject because Would inherit conflicting mutable fields List(events, options))*/
@JSGlobal("ymaps.ClusterPlacemark")
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
  var state: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  def getGeoObjects(): js.Array[IGeoObject] = js.native
  def getOverlay(): stdLib.Promise[IOverlay | scala.Null] = js.native
  def getOverlaySync(): IOverlay | scala.Null = js.native
}

