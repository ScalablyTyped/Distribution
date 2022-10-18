package typings.vanillaSwipe

import typings.std.Event
import typings.std.HTMLElement
import typings.vanillaSwipe.vanillaSwipeInts.`0`
import typings.vanillaSwipe.vanillaSwipeInts.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  @js.native
  sealed trait Axis extends StObject
  @JSImport("vanilla-swipe/lib/types", "Axis")
  @js.native
  object Axis extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Axis & String] = js.native
    
    @js.native
    sealed trait X
      extends StObject
         with Axis
    /* "x" */ val X: typings.vanillaSwipe.libTypesMod.Axis.X & String = js.native
    
    @js.native
    sealed trait Y
      extends StObject
         with Axis
    /* "y" */ val Y: typings.vanillaSwipe.libTypesMod.Axis.Y & String = js.native
  }
  
  @js.native
  sealed trait Direction extends StObject
  @JSImport("vanilla-swipe/lib/types", "Direction")
  @js.native
  object Direction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Direction & String] = js.native
    
    @js.native
    sealed trait BOTTOM
      extends StObject
         with Direction
    /* "BOTTOM" */ val BOTTOM: typings.vanillaSwipe.libTypesMod.Direction.BOTTOM & String = js.native
    
    @js.native
    sealed trait LEFT
      extends StObject
         with Direction
    /* "LEFT" */ val LEFT: typings.vanillaSwipe.libTypesMod.Direction.LEFT & String = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with Direction
    /* "NONE" */ val NONE: typings.vanillaSwipe.libTypesMod.Direction.NONE & String = js.native
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with Direction
    /* "RIGHT" */ val RIGHT: typings.vanillaSwipe.libTypesMod.Direction.RIGHT & String = js.native
    
    @js.native
    sealed trait TOP
      extends StObject
         with Direction
    /* "TOP" */ val TOP: typings.vanillaSwipe.libTypesMod.Direction.TOP & String = js.native
  }
  
  @js.native
  sealed trait TraceDirectionKey extends StObject
  @JSImport("vanilla-swipe/lib/types", "TraceDirectionKey")
  @js.native
  object TraceDirectionKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TraceDirectionKey & String] = js.native
    
    @js.native
    sealed trait NEGATIVE
      extends StObject
         with TraceDirectionKey
    /* "NEGATIVE" */ val NEGATIVE: typings.vanillaSwipe.libTypesMod.TraceDirectionKey.NEGATIVE & String = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with TraceDirectionKey
    /* "NONE" */ val NONE: typings.vanillaSwipe.libTypesMod.TraceDirectionKey.NONE & String = js.native
    
    @js.native
    sealed trait POSITIVE
      extends StObject
         with TraceDirectionKey
    /* "POSITIVE" */ val POSITIVE: typings.vanillaSwipe.libTypesMod.TraceDirectionKey.POSITIVE & String = js.native
  }
  
  trait ConstructorProps extends StObject {
    
    var delta: js.UndefOr[Double | `10`] = js.undefined
    
    var directionDelta: js.UndefOr[Double | `0`] = js.undefined
    
    var element: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var mouseTrackingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var onSwipeStart: js.UndefOr[EventHandler] = js.undefined
    
    var onSwiped: js.UndefOr[EventHandler] = js.undefined
    
    var onSwiping: js.UndefOr[EventHandler] = js.undefined
    
    var onTap: js.UndefOr[EventHandler] = js.undefined
    
    var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined
    
    var preventTrackingOnMouseleave: js.UndefOr[Boolean] = js.undefined
    
    var rotationAngle: js.UndefOr[Double | `0`] = js.undefined
    
    var target: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var touchTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object ConstructorProps {
    
    inline def apply(): ConstructorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorProps]
    }
    
    extension [Self <: ConstructorProps](x: Self) {
      
      inline def setDelta(value: Double | `10`): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      inline def setDirectionDelta(value: Double | `0`): Self = StObject.set(x, "directionDelta", value.asInstanceOf[js.Any])
      
      inline def setDirectionDeltaUndefined: Self = StObject.set(x, "directionDelta", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setMouseTrackingEnabled(value: Boolean): Self = StObject.set(x, "mouseTrackingEnabled", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackingEnabledUndefined: Self = StObject.set(x, "mouseTrackingEnabled", js.undefined)
      
      inline def setOnSwipeStart(value: (/* e */ Event, /* data */ EventData) => Unit): Self = StObject.set(x, "onSwipeStart", js.Any.fromFunction2(value))
      
      inline def setOnSwipeStartUndefined: Self = StObject.set(x, "onSwipeStart", js.undefined)
      
      inline def setOnSwiped(value: (/* e */ Event, /* data */ EventData) => Unit): Self = StObject.set(x, "onSwiped", js.Any.fromFunction2(value))
      
      inline def setOnSwipedUndefined: Self = StObject.set(x, "onSwiped", js.undefined)
      
      inline def setOnSwiping(value: (/* e */ Event, /* data */ EventData) => Unit): Self = StObject.set(x, "onSwiping", js.Any.fromFunction2(value))
      
      inline def setOnSwipingUndefined: Self = StObject.set(x, "onSwiping", js.undefined)
      
      inline def setOnTap(value: (/* e */ Event, /* data */ EventData) => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction2(value))
      
      inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      inline def setPreventDefaultTouchmoveEvent(value: Boolean): Self = StObject.set(x, "preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultTouchmoveEventUndefined: Self = StObject.set(x, "preventDefaultTouchmoveEvent", js.undefined)
      
      inline def setPreventTrackingOnMouseleave(value: Boolean): Self = StObject.set(x, "preventTrackingOnMouseleave", value.asInstanceOf[js.Any])
      
      inline def setPreventTrackingOnMouseleaveUndefined: Self = StObject.set(x, "preventTrackingOnMouseleave", js.undefined)
      
      inline def setRotationAngle(value: Double | `0`): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      inline def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTouchTrackingEnabled(value: Boolean): Self = StObject.set(x, "touchTrackingEnabled", value.asInstanceOf[js.Any])
      
      inline def setTouchTrackingEnabledUndefined: Self = StObject.set(x, "touchTrackingEnabled", js.undefined)
    }
  }
  
  trait EventData extends StObject {
    
    var absX: Double
    
    var absY: Double
    
    var deltaX: Double
    
    var deltaY: Double
    
    var directionX: Direction
    
    var directionY: Direction
    
    var duration: Double
    
    var positionX: js.UndefOr[Double] = js.undefined
    
    var positionY: js.UndefOr[Double] = js.undefined
    
    var velocity: Double
  }
  object EventData {
    
    inline def apply(
      absX: Double,
      absY: Double,
      deltaX: Double,
      deltaY: Double,
      directionX: Direction,
      directionY: Direction,
      duration: Double,
      velocity: Double
    ): EventData = {
      val __obj = js.Dynamic.literal(absX = absX.asInstanceOf[js.Any], absY = absY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], directionX = directionX.asInstanceOf[js.Any], directionY = directionY.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventData]
    }
    
    extension [Self <: EventData](x: Self) {
      
      inline def setAbsX(value: Double): Self = StObject.set(x, "absX", value.asInstanceOf[js.Any])
      
      inline def setAbsY(value: Double): Self = StObject.set(x, "absY", value.asInstanceOf[js.Any])
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setDirectionX(value: Direction): Self = StObject.set(x, "directionX", value.asInstanceOf[js.Any])
      
      inline def setDirectionY(value: Direction): Self = StObject.set(x, "directionY", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setPositionX(value: Double): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
      
      inline def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
      
      inline def setPositionY(value: Double): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
      
      inline def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    }
  }
  
  type EventHandler = js.Function2[/* e */ Event, /* data */ EventData, Unit]
  
  trait State extends StObject {
    
    var isSwiping: Boolean
    
    var start: Double
    
    var traceX: Trace
    
    var traceY: Trace
    
    var x: Double
    
    var y: Double
  }
  object State {
    
    inline def apply(isSwiping: Boolean, start: Double, traceX: Trace, traceY: Trace, x: Double, y: Double): State = {
      val __obj = js.Dynamic.literal(isSwiping = isSwiping.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], traceX = traceX.asInstanceOf[js.Any], traceY = traceY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setIsSwiping(value: Boolean): Self = StObject.set(x, "isSwiping", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTraceX(value: Trace): Self = StObject.set(x, "traceX", value.asInstanceOf[js.Any])
      
      inline def setTraceXVarargs(value: Double*): Self = StObject.set(x, "traceX", js.Array(value*))
      
      inline def setTraceY(value: Trace): Self = StObject.set(x, "traceY", value.asInstanceOf[js.Any])
      
      inline def setTraceYVarargs(value: Double*): Self = StObject.set(x, "traceY", js.Array(value*))
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Trace = js.Array[Double]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in vanilla-swipe.vanilla-swipe/lib/types.TraceDirectionKey | string ]: std.Array<number>}
    }}}
    */
  @js.native
  trait TraceDirection extends StObject
}
