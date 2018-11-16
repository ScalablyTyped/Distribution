package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.Layer")
@js.native
class Layer protected ()
  extends ILayer
     with IParentOnMap
     with IPositioningContext {
  def this(tileUrlTemplate: java.lang.String) = this()
  def this(tileUrlTemplate: js.Function2[
      /* tileNumber */ js.Array[scala.Double], 
      /* tileZoom */ scala.Double, 
      java.lang.String
    ]) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  /* CompleteClass */
  override def fromClientPixels(clientPixelPoint: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
  /* CompleteClass */
  override def getZoom(): scala.Double = js.native
  def setParent(parent: IControlParent): this.type = js.native
  /* CompleteClass */
  override def toClientPixels(globalPixelPoint: js.Array[scala.Double]): js.Array[scala.Double] = js.native
}

