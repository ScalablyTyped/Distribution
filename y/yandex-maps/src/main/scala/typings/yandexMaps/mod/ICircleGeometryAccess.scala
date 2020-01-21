package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICircleGeometryAccess extends IFreezable {
  def contains(position: js.Array[Double]): Boolean = js.native
  def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
  def getCoordinates(): js.Array[Double] | Null = js.native
  def getRadius(): Double = js.native
  def setCoordinates(): this.type = js.native
  def setCoordinates(coordinates: js.Array[Double]): this.type = js.native
  def setRadius(radius: Double): this.type = js.native
}

