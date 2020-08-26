package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "geoObject")
@js.native
object geoObject extends js.Object {
  @js.native
  class Balloon protected () extends IBalloonManager[GeoObject_] {
    //tslint:disable-line no-shadowed-variable
    def this(geoObject: GeoObject_) = this()
  }
  
  @js.native
  class Hint protected () extends IPopupManager[GeoObject_] {
    def this(geoObject: GeoObject_) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.yandexMaps.mod.IEventEmitter because Already inherited
  - typings.yandexMaps.mod.IParentOnMap because Already inherited
  - typings.yandexMaps.mod.ICustomizable because Already inherited
  - typings.yandexMaps.mod.IGeoObjectSequence because var conflicts: events, options. Inlined each, each, get, getBounds, getIterator, getLength, getPixelBounds, indexOf */ @js.native
  class Sequence protected () extends IGeoObject {
    def this(geoObject: GeoObject_) = this()
    def each(callback: js.Function1[/* geoObject */ IGeoObject, Unit]): Unit = js.native
    def each(callback: js.Function1[/* geoObject */ IGeoObject, Unit], context: js.Object): Unit = js.native
    def get(index: Double): IGeoObject = js.native
    def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    def getIterator(): IIterator = js.native
    def getLength(): Double = js.native
    def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
    def indexOf(geoObject: IGeoObject): Double = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
}

