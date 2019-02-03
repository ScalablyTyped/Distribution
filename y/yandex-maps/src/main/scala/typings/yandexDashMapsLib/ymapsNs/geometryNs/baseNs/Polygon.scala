package typings
package yandexDashMapsLib.ymapsNs.geometryNs.baseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.geometry.base.Polygon")
@js.native
class Polygon ()
  extends yandexDashMapsLib.ymapsNs.IBasePointGeometry {
  def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]]) = this()
  def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]], fillRule: yandexDashMapsLib.yandexDashMapsLibStrings.evenOdd) = this()
  def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]], fillRule: yandexDashMapsLib.yandexDashMapsLibStrings.nonZero) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
   //tslint:disable-line function-name
  def contains(position: js.Array[scala.Double]): scala.Boolean = js.native
  def freeze(): yandexDashMapsLib.ymapsNs.IFreezable = js.native
  def get(index: scala.Double): js.Array[js.Array[scala.Double]] = js.native
  /* CompleteClass */
  override def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  def getChildGeometry(index: scala.Double): yandexDashMapsLib.ymapsNs.ILinearRingGeometryAccess = js.native
  def getClosest(anchorPosition: js.Array[scala.Double]): js.Object = js.native
  def getFillRule(): java.lang.String = js.native
  def getLength(): scala.Double = js.native
  /* CompleteClass */
  override def getType(): java.lang.String = js.native
  def insert(index: scala.Double, path: js.Array[js.Array[scala.Double]]): yandexDashMapsLib.ymapsNs.IPolygonGeometryAccess = js.native
  def isFrozen(): scala.Boolean = js.native
  def remove(index: scala.Double): yandexDashMapsLib.ymapsNs.ILinearRingGeometryAccess = js.native
  def set(index: scala.Double, path: js.Array[js.Array[scala.Double]]): yandexDashMapsLib.ymapsNs.IPolygonGeometryAccess = js.native
  def setFillRule(fillRule: java.lang.String): yandexDashMapsLib.ymapsNs.IPolygonGeometryAccess = js.native
  def splice(index: scala.Double, number: scala.Double): js.Array[yandexDashMapsLib.ymapsNs.ILinearRingGeometryAccess] = js.native
  def unfreeze(): yandexDashMapsLib.ymapsNs.IFreezable = js.native
}

/* static members */
@JSGlobal("ymaps.geometry.base.Polygon")
@js.native
object Polygon extends js.Object {
  def fromEncodedCoordinates(encodedCoordinates: java.lang.String): yandexDashMapsLib.ymapsNs.geometryNs.baseNs.Polygon = js.native
   //tslint:disable-line function-name
  def toEncodedCoordinates(geometry: yandexDashMapsLib.ymapsNs.geometryNs.baseNs.Polygon): java.lang.String = js.native
}

