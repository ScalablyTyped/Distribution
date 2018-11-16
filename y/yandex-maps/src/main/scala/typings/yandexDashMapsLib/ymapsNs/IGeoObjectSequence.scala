package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoObjectSequence
  extends ICustomizable
     with IParentOnMap {
  def each(callback: js.Function1[/* geoObject */ IGeoObject, scala.Unit]): scala.Unit = js.native
  def each(callback: js.Function1[/* geoObject */ IGeoObject, scala.Unit], context: js.Object): scala.Unit = js.native
  def get(index: scala.Double): IGeoObject = js.native
  def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  def getIterator(): IIterator = js.native
  def getLength(): scala.Double = js.native
  def getPixelBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  def indexOf(geoObject: IGeoObject): scala.Double = js.native
}

