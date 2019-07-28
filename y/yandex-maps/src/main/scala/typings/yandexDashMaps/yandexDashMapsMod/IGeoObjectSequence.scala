package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoObjectSequence
  extends ICustomizable
     with IParentOnMap {
  def each(callback: js.Function1[/* geoObject */ IGeoObject, Unit]): Unit = js.native
  def each(callback: js.Function1[/* geoObject */ IGeoObject, Unit], context: js.Object): Unit = js.native
  def get(index: Double): IGeoObject = js.native
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  def getIterator(): IIterator = js.native
  def getLength(): Double = js.native
  def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
  def indexOf(geoObject: IGeoObject): Double = js.native
}

