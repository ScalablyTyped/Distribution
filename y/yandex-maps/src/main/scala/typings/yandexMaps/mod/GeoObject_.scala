package typings.yandexMaps.mod

import typings.yandexMaps.mod.event.Manager
import typings.yandexMaps.mod.geoObject.Hint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "GeoObject")
@js.native
class GeoObject_ () extends IGeoObject {
  def this(feature: IGeoObjectFeature) = this()
  def this(feature: js.UndefOr[scala.Nothing], options: IGeoObjectOptions) = this()
  def this(feature: IGeoObjectFeature, options: IGeoObjectOptions) = this()
  var balloon: typings.yandexMaps.mod.geoObject.Balloon = js.native
  var editor: IGeometryEditor = js.native
  @JSName("events")
  var events_GeoObject_ : Manager = js.native
  var hint: Hint = js.native
  @JSName("options")
  var options_GeoObject_ : typings.yandexMaps.mod.option.Manager = js.native
  @JSName("properties")
  var properties_GeoObject_ : typings.yandexMaps.mod.data.Manager = js.native
  @JSName("state")
  var state_GeoObject_ : typings.yandexMaps.mod.data.Manager = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

