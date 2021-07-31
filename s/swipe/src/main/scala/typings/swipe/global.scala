package typings.swipe

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Swipe")
  @js.native
  class Swipe protected ()
    extends StObject
       with typings.swipe.Swipe {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, options: SwipeOptions) = this()
    
    /* CompleteClass */
    override def attachEvents(): Unit = js.native
    
    /* CompleteClass */
    override def getNumSlides(): Double = js.native
    
    /* CompleteClass */
    override def getPos(): Double = js.native
    
    /* CompleteClass */
    override def kill(): Unit = js.native
    
    /* CompleteClass */
    override def next(): Unit = js.native
    
    /* CompleteClass */
    override def prev(): Unit = js.native
    
    /* CompleteClass */
    override def setup(): Unit = js.native
    
    /* CompleteClass */
    override def slide(index: Double, duration: Double): Unit = js.native
  }
}
