package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.yandexDashMapsMod.eventNs.Manager
import typings.yandexDashMaps.yandexDashMapsMod.geoObjectNs.Hint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "GeoObject")
@js.native
class GeoObject () extends IGeoObject {
  def this(feature: IGeoObjectFeature) = this()
  def this(feature: IGeoObjectFeature, options: IGeoObjectOptions) = this()
  var balloon: typings.yandexDashMaps.yandexDashMapsMod.geoObjectNs.Balloon = js.native
  var editor: IGeometryEditor = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  @JSName("events")
  var events_GeoObject: Manager = js.native
  var hint: Hint = js.native
  @JSName("options")
  var options_GeoObject: typings.yandexDashMaps.yandexDashMapsMod.optionNs.Manager = js.native
  @JSName("properties")
  var properties_GeoObject: typings.yandexDashMaps.yandexDashMapsMod.dataNs.Manager = js.native
  @JSName("state")
  var state_GeoObject: typings.yandexDashMaps.yandexDashMapsMod.dataNs.Manager = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

