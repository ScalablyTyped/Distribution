package typings
package yandexDashMapsLib.ymapsNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.geometry.Point")
@js.native
class Point ()
  extends yandexDashMapsLib.ymapsNs.IPointGeometry {
  def this(coordinates: js.Array[scala.Double]) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  /* CompleteClass */
  override def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
  /* CompleteClass */
  override def getType(): java.lang.String = js.native
}

