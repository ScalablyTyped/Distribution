package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.Anon_Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IGeoObjectCollection because var conflicts: events, options. Inlined add, add, each, each, get, getBounds, getIterator, getLength, getPixelBounds, indexOf, remove, removeAll, set, splice */ @JSImport("yandex-maps", "GeoObjectCollection")
@js.native
class GeoObjectCollection () extends IGeoObject {
  def this(feature: Anon_Children) = this()
  def this(feature: Anon_Children, options: js.Object) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  def add(child: IGeoObject): this.type = js.native
  def add(child: IGeoObject, index: Double): this.type = js.native
  def each(callback: js.Function1[/* object */ IGeoObject, Unit]): Unit = js.native
  def each(callback: js.Function1[/* object */ IGeoObject, Unit], context: js.Object): Unit = js.native
  def get(index: Double): IGeoObject = js.native
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  def getIterator(): IIterator = js.native
  def getLength(): Double = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
  def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
  def indexOf(`object`: IGeoObject): Double = js.native
  def remove(child: IGeoObject): this.type = js.native
  def removeAll(): this.type = js.native
  def set(index: Double, child: IGeoObject): this.type = js.native
  def setParent(parent: IControlParent): this.type = js.native
  def splice(index: Double, length: Double): this.type = js.native
  def toArray(): js.Array[IGeoObject] = js.native
}

