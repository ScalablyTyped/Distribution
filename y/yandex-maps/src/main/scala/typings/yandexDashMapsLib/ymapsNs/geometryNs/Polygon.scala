package typings
package yandexDashMapsLib.ymapsNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.geometry.Polygon")
@js.native
class Polygon ()
  extends yandexDashMapsLib.ymapsNs.IPolygonGeometry {
  def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]]) = this()
  def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]], fillRule: yandexDashMapsLib.yandexDashMapsLibStrings.evenOdd) = this()
  def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]], fillRule: yandexDashMapsLib.yandexDashMapsLibStrings.nonZero) = this()
  def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]], fillRule: yandexDashMapsLib.yandexDashMapsLibStrings.evenOdd, options: js.Object) = this()
  def this(coordinates: js.Array[js.Array[js.Array[scala.Double]]], fillRule: yandexDashMapsLib.yandexDashMapsLibStrings.nonZero, options: js.Object) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  /* CompleteClass */
  override def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  /* CompleteClass */
  override def getType(): java.lang.String = js.native
}

@JSGlobal("ymaps.geometry.Polygon")
@js.native
object Polygon extends js.Object {
  def fromEncodedCoordinates(encodedCoordinates: java.lang.String): yandexDashMapsLib.ymapsNs.geometryNs.Polygon = js.native
   //tslint:disable-line function-name
  def toEncodedCoordinates(geometry: yandexDashMapsLib.ymapsNs.geometryNs.Polygon): java.lang.String = js.native
}

