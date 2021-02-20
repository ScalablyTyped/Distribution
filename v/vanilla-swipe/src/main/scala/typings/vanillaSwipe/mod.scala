package typings.vanillaSwipe

import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.vanillaSwipe.typesMod.ConstructorProps
import typings.vanillaSwipe.typesMod.EventData
import typings.vanillaSwipe.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vanilla-swipe", JSImport.Default)
  @js.native
  class default protected () extends VanillaSwipe {
    def this(props: ConstructorProps) = this()
  }
  
  @js.native
  trait VanillaSwipe extends StObject {
    
    def cleanupMouseListeners(): Unit = js.native
    
    def cleanupTouchListeners(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getEventData(e: MouseEvent): EventData = js.native
    def getEventData(e: TouchEvent): EventData = js.native
    
    def handleMouseDown(e: MouseEvent): Unit = js.native
    
    def handleMouseLeave(e: MouseEvent): Unit = js.native
    
    def handleMouseMove(e: MouseEvent): Unit = js.native
    
    def handleMouseUp(e: MouseEvent): Unit = js.native
    
    def handleSwipeEnd(e: js.Any): Unit = js.native
    
    def handleSwipeMove(e: js.Any): Unit = js.native
    
    def handleSwipeStart(e: js.Any): Unit = js.native
    
    def init(): Unit = js.native
    
    var props: ConstructorProps = js.native
    
    def setupMouseListeners(): Unit = js.native
    
    def setupTouchListeners(): Unit = js.native
    
    var state: State = js.native
    
    def update(props: ConstructorProps): Unit = js.native
  }
}
