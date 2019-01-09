package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.ymapsNs.IGeoObjectCollection because var conflicts: events, options. Inlined add, add, each, get, getBounds, getIterator, getLength, getPixelBounds, indexOf, remove, removeAll, set, splice */ @JSGlobal("ymaps.GeoObjectCollection")
@js.native
class GeoObjectCollection () extends IGeoObject {
  def this(feature: yandexDashMapsLib.Anon_Children) = this()
  def this(feature: yandexDashMapsLib.Anon_Children, options: js.Object) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  def add(child: IGeoObject): this.type = js.native
  def add(child: IGeoObject, index: scala.Double): this.type = js.native
  def each(callback: js.Function1[/* object */ IGeoObject, scala.Unit], context: js.Object): scala.Unit = js.native
  def get(index: scala.Double): IGeoObject = js.native
  def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  def getIterator(): IIterator = js.native
  def getLength(): scala.Double = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
  def getPixelBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  def indexOf(`object`: IGeoObject): scala.Double = js.native
  def remove(child: IGeoObject): this.type = js.native
  def removeAll(): this.type = js.native
  def set(index: scala.Double, child: IGeoObject): this.type = js.native
  def setParent(parent: IControlParent): this.type = js.native
  def splice(index: scala.Double, length: scala.Double): this.type = js.native
  def toArray(): js.Array[IGeoObject] = js.native
}

