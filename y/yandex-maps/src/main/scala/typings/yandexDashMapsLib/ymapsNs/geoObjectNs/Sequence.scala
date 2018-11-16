package typings
package yandexDashMapsLib.ymapsNs.geoObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(yandexDashMapsLib.ymapsNs.IGeoObjectSequence because Would inherit conflicting mutable fields List(events, options))*/
@JSGlobal("ymaps.geoObject.Sequence")
@js.native
class Sequence protected ()
  extends yandexDashMapsLib.ymapsNs.IGeoObject {
  def this(geoObject: yandexDashMapsLib.ymapsNs.GeoObject) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  def each(callback: js.Function1[/* geoObject */ yandexDashMapsLib.ymapsNs.IGeoObject, scala.Unit]): scala.Unit = js.native
  def each(
    callback: js.Function1[/* geoObject */ yandexDashMapsLib.ymapsNs.IGeoObject, scala.Unit],
    context: js.Object
  ): scala.Unit = js.native
  def get(index: scala.Double): yandexDashMapsLib.ymapsNs.IGeoObject = js.native
  def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  def getIterator(): yandexDashMapsLib.ymapsNs.IIterator = js.native
  def getLength(): scala.Double = js.native
  /* CompleteClass */
  override def getMap(): yandexDashMapsLib.ymapsNs.Map = js.native
  def getPixelBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  def indexOf(geoObject: yandexDashMapsLib.ymapsNs.IGeoObject): scala.Double = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IControlParent): this.type = js.native
}

