package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.yandexDashMapsMod.event.Manager
import typings.yandexDashMaps.yandexDashMapsMod.geoObject.Hint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "GeoObject")
@js.native
class GeoObject () extends IGeoObject {
  def this(feature: IGeoObjectFeature) = this()
  def this(feature: IGeoObjectFeature, options: IGeoObjectOptions) = this()
  var balloon: typings.yandexDashMaps.yandexDashMapsMod.geoObject.Balloon = js.native
  var editor: IGeometryEditor = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  @JSName("events")
  var events_GeoObject: Manager = js.native
  var hint: Hint = js.native
  @JSName("options")
  var options_GeoObject: typings.yandexDashMaps.yandexDashMapsMod.option.Manager = js.native
  @JSName("properties")
  var properties_GeoObject: typings.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  @JSName("state")
  var state_GeoObject: typings.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

@JSImport("yandex-maps", "geoObject")
@js.native
object geoObject extends js.Object {
  @js.native
  class Balloon protected () extends IBalloonManager[GeoObject] {
    //tslint:disable-line no-shadowed-variable
    def this(geoObject: GeoObject) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
  }
  
  @js.native
  class Hint protected () extends IHintManager[GeoObject] {
    def this(geoObject: GeoObject) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
  - typings.yandexDashMaps.yandexDashMapsMod.IParentOnMap because Already inherited
  - typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because Already inherited
  - typings.yandexDashMaps.yandexDashMapsMod.IGeoObjectSequence because var conflicts: events, options. Inlined each, each, get, getBounds, getIterator, getLength, getPixelBounds, indexOf */ @js.native
  class Sequence protected () extends IGeoObject {
    def this(geoObject: GeoObject) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def each(callback: js.Function1[/* geoObject */ IGeoObject, Unit]): Unit = js.native
    def each(callback: js.Function1[/* geoObject */ IGeoObject, Unit], context: js.Object): Unit = js.native
    def get(index: Double): IGeoObject = js.native
    def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    def getIterator(): IIterator = js.native
    def getLength(): Double = js.native
    /* CompleteClass */
    override def getMap(): Map = js.native
    def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
    def indexOf(geoObject: IGeoObject): Double = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
}

