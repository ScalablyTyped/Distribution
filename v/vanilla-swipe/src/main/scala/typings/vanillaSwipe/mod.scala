package typings.vanillaSwipe

import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.vanillaSwipe.anon.DirectionDelta
import typings.vanillaSwipe.typesMod.ConstructorProps
import typings.vanillaSwipe.typesMod.EventData
import typings.vanillaSwipe.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vanilla-swipe", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with VanillaSwipe {
    def this(props: ConstructorProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("vanilla-swipe", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def isTouchEventsSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchEventsSupported")().asInstanceOf[Boolean]
  }
  
  @JSImport("vanilla-swipe", "Axis")
  @js.native
  object Axis extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.vanillaSwipe.typesMod.Axis & String] = js.native
    
    /* "x" */ val X: typings.vanillaSwipe.typesMod.Axis.X & String = js.native
    
    /* "y" */ val Y: typings.vanillaSwipe.typesMod.Axis.Y & String = js.native
  }
  
  @JSImport("vanilla-swipe", "Direction")
  @js.native
  object Direction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.vanillaSwipe.typesMod.Direction & String] = js.native
    
    /* "BOTTOM" */ val BOTTOM: typings.vanillaSwipe.typesMod.Direction.BOTTOM & String = js.native
    
    /* "LEFT" */ val LEFT: typings.vanillaSwipe.typesMod.Direction.LEFT & String = js.native
    
    /* "NONE" */ val NONE: typings.vanillaSwipe.typesMod.Direction.NONE & String = js.native
    
    /* "RIGHT" */ val RIGHT: typings.vanillaSwipe.typesMod.Direction.RIGHT & String = js.native
    
    /* "TOP" */ val TOP: typings.vanillaSwipe.typesMod.Direction.TOP & String = js.native
  }
  
  @JSImport("vanilla-swipe", "TraceDirectionKey")
  @js.native
  object TraceDirectionKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.vanillaSwipe.typesMod.TraceDirectionKey & String] = js.native
    
    /* "NEGATIVE" */ val NEGATIVE: typings.vanillaSwipe.typesMod.TraceDirectionKey.NEGATIVE & String = js.native
    
    /* "NONE" */ val NONE: typings.vanillaSwipe.typesMod.TraceDirectionKey.NONE & String = js.native
    
    /* "POSITIVE" */ val POSITIVE: typings.vanillaSwipe.typesMod.TraceDirectionKey.POSITIVE & String = js.native
  }
  
  @js.native
  trait VanillaSwipe extends StObject {
    
    def cleanupMouseListeners(): Unit = js.native
    
    def cleanupTouchListeners(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getEventData(e: MouseEvent): EventData = js.native
    def getEventData(e: MouseEvent, options: DirectionDelta): EventData = js.native
    def getEventData(e: TouchEvent): EventData = js.native
    def getEventData(e: TouchEvent, options: DirectionDelta): EventData = js.native
    
    def handleMouseDown(e: MouseEvent): Unit = js.native
    
    def handleMouseLeave(e: MouseEvent): Unit = js.native
    
    def handleMouseMove(e: MouseEvent): Unit = js.native
    
    def handleMouseUp(e: MouseEvent): Unit = js.native
    
    def handleSwipeEnd(e: Any): Unit = js.native
    
    def handleSwipeMove(e: Any): Unit = js.native
    
    def handleSwipeStart(e: Any): Unit = js.native
    
    def init(): Unit = js.native
    
    var props: ConstructorProps = js.native
    
    def setupMouseListeners(): Unit = js.native
    
    def setupTouchListeners(): Unit = js.native
    
    var state: State = js.native
    
    def update(props: ConstructorProps): Unit = js.native
  }
}
