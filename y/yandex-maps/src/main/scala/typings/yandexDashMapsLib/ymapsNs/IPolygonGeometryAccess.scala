package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPolygonGeometryAccess extends IFreezable {
  def contains(position: js.Array[scala.Double]): scala.Boolean = js.native
  def get(index: scala.Double): js.Array[js.Array[scala.Double]] = js.native
  def getChildGeometry(index: scala.Double): ILinearRingGeometryAccess = js.native
  def getClosest(anchorPosition: js.Array[scala.Double]): js.Object = js.native
  def getCoordinates(): js.Array[js.Array[js.Array[scala.Double]]] = js.native
  def getFillRule(): java.lang.String = js.native
  def getLength(): scala.Double = js.native
  def insert(index: scala.Double, path: js.Array[js.Array[scala.Double]]): IPolygonGeometryAccess = js.native
  def remove(index: scala.Double): ILinearRingGeometryAccess = js.native
  def set(index: scala.Double, path: js.Array[js.Array[scala.Double]]): IPolygonGeometryAccess = js.native
  def setCoordinates(coordinates: js.Array[js.Array[js.Array[scala.Double]]]): IPolygonGeometryAccess = js.native
  def setFillRule(fillRule: java.lang.String): IPolygonGeometryAccess = js.native
  def splice(index: scala.Double, number: scala.Double): js.Array[ILinearRingGeometryAccess] = js.native
}

