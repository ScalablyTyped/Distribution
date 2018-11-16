package typings
package yandexDashMapsLib.ymapsNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.geometry.LineString")
@js.native
class LineString ()
  extends yandexDashMapsLib.ymapsNs.ILineStringGeometry {
  def this(coordinates: js.Array[js.Array[scala.Double]]) = this()
  def this(coordinates: js.Array[js.Array[scala.Double]], options: yandexDashMapsLib.Anon_PixelRendering) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  /* CompleteClass */
  override def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  /* CompleteClass */
  override def getType(): java.lang.String = js.native
  def remove(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.ymapsNs.IEvent, scala.Unit]
  ): this.type = js.native
  def remove(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.ymapsNs.IEvent, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.ymapsNs.IEvent, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def remove(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.ymapsNs.IEvent, scala.Unit]
  ): this.type = js.native
  def remove(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.ymapsNs.IEvent, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.ymapsNs.IEvent, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IEventManager): this.type = js.native
}

@JSGlobal("ymaps.geometry.LineString")
@js.native
object LineString extends js.Object {
  def fromEncodedCoordinates(encodedCoordinates: java.lang.String): yandexDashMapsLib.ymapsNs.geometryNs.LineString = js.native
   //tslint:disable-line function-name
  def toEncodedCoordinates(geometry: yandexDashMapsLib.ymapsNs.geometryNs.LineString): java.lang.String = js.native
}

