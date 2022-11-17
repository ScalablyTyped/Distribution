package typings.yandexMaps.mod

import typings.std.HTMLElement
import typings.yandexMaps.anon.CheckContextMenu
import typings.yandexMaps.anon.Css
import typings.yandexMaps.anon.Margin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pane {
  
  @JSImport("yandex-maps", "pane.EventsPane")
  @js.native
  open class EventsPane protected ()
    extends StObject
       with IEventPane {
    def this(map: Map_, params: CheckContextMenu) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def getMap(): Map_ = js.native
    
    /* CompleteClass */
    override def getOverflow(): "visible" | "hidden" = js.native
    
    /* CompleteClass */
    override def getZIndex(): Double = js.native
  }
  
  @JSImport("yandex-maps", "pane.MovablePane")
  @js.native
  open class MovablePane protected ()
    extends StObject
       with IContainerPane {
    def this(map: Map_, params: Css) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    /* CompleteClass */
    override def fromClientPixels(clientPixelPoint: js.Array[Double]): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def getMap(): Map_ = js.native
    
    /* CompleteClass */
    override def getOverflow(): "visible" | "hidden" = js.native
    
    /* CompleteClass */
    override def getZIndex(): Double = js.native
    
    /* CompleteClass */
    override def getZoom(): Double = js.native
    
    /* CompleteClass */
    override def toClientPixels(globalPixelPoint: js.Array[Double]): js.Array[Double] = js.native
  }
  
  @JSImport("yandex-maps", "pane.StaticPane")
  @js.native
  open class StaticPane protected ()
    extends StObject
       with IContainerPane {
    def this(map: Map_, params: Margin) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    /* CompleteClass */
    override def fromClientPixels(clientPixelPoint: js.Array[Double]): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def getMap(): Map_ = js.native
    
    /* CompleteClass */
    override def getOverflow(): "visible" | "hidden" = js.native
    
    /* CompleteClass */
    override def getZIndex(): Double = js.native
    
    /* CompleteClass */
    override def getZoom(): Double = js.native
    
    /* CompleteClass */
    override def toClientPixels(globalPixelPoint: js.Array[Double]): js.Array[Double] = js.native
  }
}
