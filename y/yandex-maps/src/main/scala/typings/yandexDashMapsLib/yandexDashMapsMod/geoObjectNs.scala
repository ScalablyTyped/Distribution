package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "geoObject")
@js.native
object geoObjectNs extends js.Object {
  @js.native
  class Balloon protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IBalloonManager[yandexDashMapsLib.yandexDashMapsMod.GeoObject] {
    //tslint:disable-line no-shadowed-variable
    def this(geoObject: yandexDashMapsLib.yandexDashMapsMod.GeoObject) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
  }
  
  @js.native
  class Hint protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IHintManager[yandexDashMapsLib.yandexDashMapsMod.GeoObject] {
    def this(geoObject: yandexDashMapsLib.yandexDashMapsMod.GeoObject) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - yandexDashMapsLib.yandexDashMapsMod.IGeoObjectSequence because var conflicts: events, options. Inlined each, each, get, getBounds, getIterator, getLength, getPixelBounds, indexOf */ @js.native
  class Sequence protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IGeoObject {
    def this(geoObject: yandexDashMapsLib.yandexDashMapsMod.GeoObject) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def each(callback: js.Function1[/* geoObject */ yandexDashMapsLib.yandexDashMapsMod.IGeoObject, scala.Unit]): scala.Unit = js.native
    def each(
      callback: js.Function1[/* geoObject */ yandexDashMapsLib.yandexDashMapsMod.IGeoObject, scala.Unit],
      context: js.Object
    ): scala.Unit = js.native
    def get(index: scala.Double): yandexDashMapsLib.yandexDashMapsMod.IGeoObject = js.native
    def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
    def getIterator(): yandexDashMapsLib.yandexDashMapsMod.IIterator = js.native
    def getLength(): scala.Double = js.native
    /* CompleteClass */
    override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
    def getPixelBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
    def indexOf(geoObject: yandexDashMapsLib.yandexDashMapsMod.IGeoObject): scala.Double = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
  }
  
}

