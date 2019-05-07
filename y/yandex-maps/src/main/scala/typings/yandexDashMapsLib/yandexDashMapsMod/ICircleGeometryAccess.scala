package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICircleGeometryAccess extends IFreezable {
  def contains(position: js.Array[scala.Double]): scala.Boolean = js.native
  def getClosest(anchorPosition: js.Array[scala.Double]): js.Object = js.native
  def getCoordinates(): js.Array[scala.Double] | scala.Null = js.native
  def getRadius(): scala.Double = js.native
  def setCoordinates(): this.type = js.native
  def setCoordinates(coordinates: js.Array[scala.Double]): this.type = js.native
  def setRadius(radius: scala.Double): this.type = js.native
}

