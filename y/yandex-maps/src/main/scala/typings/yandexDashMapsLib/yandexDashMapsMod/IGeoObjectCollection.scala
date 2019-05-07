package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoObjectCollection
  extends ICustomizable
     with IParentOnMap {
  def add(child: IGeoObject): this.type = js.native
  def add(child: IGeoObject, index: scala.Double): this.type = js.native
  def each(callback: js.Function1[/* object */ IGeoObject, scala.Unit]): scala.Unit = js.native
  def each(callback: js.Function1[/* object */ IGeoObject, scala.Unit], context: js.Object): scala.Unit = js.native
  def get(index: scala.Double): IGeoObject = js.native
  def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  def getIterator(): IIterator = js.native
  def getLength(): scala.Double = js.native
  def getPixelBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  def indexOf(`object`: IGeoObject): scala.Double = js.native
  def remove(child: IGeoObject): this.type = js.native
  def removeAll(): this.type = js.native
  def set(index: scala.Double, child: IGeoObject): this.type = js.native
  def splice(index: scala.Double, length: scala.Double): this.type = js.native
}

