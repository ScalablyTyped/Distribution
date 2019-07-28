package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "Layer")
@js.native
class Layer protected ()
  extends ILayer
     with IParentOnMap
     with IPositioningContext {
  def this(tileUrlTemplate: String) = this()
  def this(tileUrlTemplate: js.Function2[/* tileNumber */ js.Array[Double], /* tileZoom */ Double, String]) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  /* CompleteClass */
  override def fromClientPixels(clientPixelPoint: js.Array[Double]): js.Array[Double] = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
  /* CompleteClass */
  override def getZoom(): Double = js.native
  def setParent(parent: IControlParent): this.type = js.native
  /* CompleteClass */
  override def toClientPixels(globalPixelPoint: js.Array[Double]): js.Array[Double] = js.native
}

