package typings.swipeview

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("SwipeView")
  @js.native
  class SwipeView protected ()
    extends StObject
       with typings.swipeview.SwipeView {
    def this(element: String) = this()
    def this(element: String, options: SwipeViewOptions) = this()
    
    /* CompleteClass */
    var currentMasterPage: Double = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def goToPage(p: Double): Unit = js.native
    
    /* CompleteClass */
    override def handleEvent(e: Event): Unit = js.native
    
    /* CompleteClass */
    var masterPages: js.Array[HTMLElement] = js.native
    
    /* CompleteClass */
    override def next(): Unit = js.native
    
    /* CompleteClass */
    override def onFlip(fn: js.Function): Unit = js.native
    /* CompleteClass */
    @JSName("onFlip")
    var onFlip_Original: SwipeViewEvent = js.native
    
    /* CompleteClass */
    override def onMoveIn(fn: js.Function): Unit = js.native
    /* CompleteClass */
    @JSName("onMoveIn")
    var onMoveIn_Original: SwipeViewEvent = js.native
    
    /* CompleteClass */
    override def onMoveOut(fn: js.Function): Unit = js.native
    /* CompleteClass */
    @JSName("onMoveOut")
    var onMoveOut_Original: SwipeViewEvent = js.native
    
    /* CompleteClass */
    override def onTouchStart(fn: js.Function): Unit = js.native
    /* CompleteClass */
    @JSName("onTouchStart")
    var onTouchStart_Original: SwipeViewEvent = js.native
    
    /* CompleteClass */
    override def prev(): Unit = js.native
    
    /* CompleteClass */
    override def refreshSize(): Unit = js.native
    
    /* CompleteClass */
    var slider: HTMLElement = js.native
    
    /* CompleteClass */
    override def updatePageCount(n: Double): Unit = js.native
    
    /* CompleteClass */
    var wrapper: HTMLElement = js.native
    
    /* CompleteClass */
    var wrapperHeight: Double = js.native
  }
}
