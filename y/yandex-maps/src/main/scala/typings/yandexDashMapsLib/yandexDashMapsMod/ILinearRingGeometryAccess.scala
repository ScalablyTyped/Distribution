package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILinearRingGeometryAccess extends IFreezable {
  def contain(position: scala.Double): scala.Boolean = js.native
  def get(index: scala.Double): js.Array[scala.Double] = js.native
  def getChildGeometry(index: scala.Double): IPointGeometryAccess = js.native
  def getClosest(anchorPosition: js.Array[scala.Double]): js.Object = js.native
  def getCoordinates(): js.Array[js.Array[scala.Double]] = js.native
  def getFillRule(): java.lang.String = js.native
  def getLength(): scala.Double = js.native
  def insert(index: scala.Double, coordinates: js.Array[scala.Double]): ILinearRingGeometryAccess = js.native
  def remove(index: scala.Double): js.Array[scala.Double] = js.native
  def set(index: scala.Double, coordinates: js.Array[scala.Double]): ILinearRingGeometryAccess = js.native
  def setCoordinates(coordinates: js.Array[js.Array[scala.Double]]): ILinearRingGeometryAccess = js.native
  def setFillRule(fillRule: java.lang.String): ILinearRingGeometryAccess = js.native
  def splice(index: scala.Double, number: scala.Double): js.Array[js.Array[scala.Double]] = js.native
}

