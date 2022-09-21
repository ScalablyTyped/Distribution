package typings.yandexMaps.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "Layer")
@js.native
open class Layer protected ()
  extends StObject
     with ILayer
     with IParentOnMap
     with IPositioningContext {
  def this(tileUrlTemplate: String) = this()
  def this(tileUrlTemplate: js.Function2[/* tileNumber */ js.Array[Double], /* tileZoom */ Double, String]) = this()
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  
  /* CompleteClass */
  override def fromClientPixels(clientPixelPoint: js.Array[Double]): js.Array[Double] = js.native
  
  def getAlias(): String = js.native
  
  def getElement(): HTMLElement = js.native
  
  /* CompleteClass */
  override def getMap(): Map_ = js.native
  
  /* CompleteClass */
  override def getZoom(): Double = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
  
  /* CompleteClass */
  override def toClientPixels(globalPixelPoint: js.Array[Double]): js.Array[Double] = js.native
}
