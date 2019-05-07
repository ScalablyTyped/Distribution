package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "GeoObject")
@js.native
class GeoObject () extends IGeoObject {
  def this(feature: IGeoObjectFeature) = this()
  def this(feature: IGeoObjectFeature, options: IGeoObjectOptions) = this()
  var balloon: yandexDashMapsLib.yandexDashMapsMod.geoObjectNs.Balloon = js.native
  var editor: IGeometryEditor = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  @JSName("events")
  var events_GeoObject: yandexDashMapsLib.yandexDashMapsMod.eventNs.Manager = js.native
  var hint: yandexDashMapsLib.yandexDashMapsMod.geoObjectNs.Hint = js.native
  @JSName("options")
  var options_GeoObject: yandexDashMapsLib.yandexDashMapsMod.optionNs.Manager = js.native
  @JSName("properties")
  var properties_GeoObject: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
  @JSName("state")
  var state_GeoObject: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

