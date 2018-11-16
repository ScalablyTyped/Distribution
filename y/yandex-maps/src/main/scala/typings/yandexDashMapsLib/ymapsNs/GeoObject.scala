package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.GeoObject")
@js.native
class GeoObject () extends IGeoObject {
  def this(feature: IGeoObjectFeature) = this()
  def this(feature: IGeoObjectFeature, options: IGeoObjectOptions) = this()
  var balloon: yandexDashMapsLib.ymapsNs.geoObjectNs.Balloon = js.native
  var editor: IGeometryEditor = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  @JSName("events")
  var events_GeoObject: yandexDashMapsLib.ymapsNs.eventNs.Manager = js.native
  var hint: yandexDashMapsLib.ymapsNs.geoObjectNs.Hint = js.native
  var options: yandexDashMapsLib.ymapsNs.optionNs.Manager = js.native
  @JSName("properties")
  var properties_GeoObject: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  @JSName("state")
  var state_GeoObject: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

