package typings.vanillaSwipe

import typings.std.Event
import typings.std.HTMLElement
import typings.vanillaSwipe.vanillaSwipeNumbers.`0`
import typings.vanillaSwipe.vanillaSwipeNumbers.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ConstructorProps extends StObject {
    
    var delta: js.UndefOr[Double | `10`] = js.undefined
    
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
    
    @scala.inline
    def apply(): ConstructorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorProps]
    }
    
    @scala.inline
    implicit class ConstructorPropsMutableBuilder[Self <: ConstructorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Double | `10`): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementNull: Self = StObject.set(x, "element", null)
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setMouseTrackingEnabled(value: Boolean): Self = StObject.set(x, "mouseTrackingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseTrackingEnabledUndefined: Self = StObject.set(x, "mouseTrackingEnabled", js.undefined)
      
      @scala.inline
      def setOnSwipeStart(value: (/* e */ Event, /* data */ EventData) => Unit): Self = StObject.set(x, "onSwipeStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSwipeStartUndefined: Self = StObject.set(x, "onSwipeStart", js.undefined)
      
      @scala.inline
      def setOnSwiped(value: (/* e */ Event, /* data */ EventData) => Unit): Self = StObject.set(x, "onSwiped", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSwipedUndefined: Self = StObject.set(x, "onSwiped", js.undefined)
      
      @scala.inline
      def setOnSwiping(value: (/* e */ Event, /* data */ EventData) => Unit): Self = StObject.set(x, "onSwiping", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSwipingUndefined: Self = StObject.set(x, "onSwiping", js.undefined)
      
      @scala.inline
      def setOnTap(value: (/* e */ Event, /* data */ EventData) => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      @scala.inline
      def setPreventDefaultTouchmoveEvent(value: Boolean): Self = StObject.set(x, "preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultTouchmoveEventUndefined: Self = StObject.set(x, "preventDefaultTouchmoveEvent", js.undefined)
      
      @scala.inline
      def setPreventTrackingOnMouseleave(value: Boolean): Self = StObject.set(x, "preventTrackingOnMouseleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventTrackingOnMouseleaveUndefined: Self = StObject.set(x, "preventTrackingOnMouseleave", js.undefined)
      
      @scala.inline
      def setRotationAngle(value: Double | `0`): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTouchTrackingEnabled(value: Boolean): Self = StObject.set(x, "touchTrackingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchTrackingEnabledUndefined: Self = StObject.set(x, "touchTrackingEnabled", js.undefined)
    }
  }
  
  trait EventData extends StObject {
    
    var absX: Double
    
    var absY: Double
    
    var deltaX: Double
    
    var deltaY: Double
    
    var directionX: String
    
    var directionY: String
    
    var duration: Double
    
    var velocity: Double
  }
  object EventData {
    
    @scala.inline
    def apply(
      absX: Double,
      absY: Double,
      deltaX: Double,
      deltaY: Double,
      directionX: String,
      directionY: String,
      duration: Double,
      velocity: Double
    ): EventData = {
      val __obj = js.Dynamic.literal(absX = absX.asInstanceOf[js.Any], absY = absY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], directionX = directionX.asInstanceOf[js.Any], directionY = directionY.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventData]
    }
    
    @scala.inline
    implicit class EventDataMutableBuilder[Self <: EventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsX(value: Double): Self = StObject.set(x, "absX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsY(value: Double): Self = StObject.set(x, "absY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionX(value: String): Self = StObject.set(x, "directionX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionY(value: String): Self = StObject.set(x, "directionY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(isSwiping: Boolean, start: Double, traceX: Trace, traceY: Trace, x: Double, y: Double): State = {
      val __obj = js.Dynamic.literal(isSwiping = isSwiping.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], traceX = traceX.asInstanceOf[js.Any], traceY = traceY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSwiping(value: Boolean): Self = StObject.set(x, "isSwiping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceX(value: Trace): Self = StObject.set(x, "traceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceXVarargs(value: Double*): Self = StObject.set(x, "traceX", js.Array(value :_*))
      
      @scala.inline
      def setTraceY(value: Trace): Self = StObject.set(x, "traceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceYVarargs(value: Double*): Self = StObject.set(x, "traceY", js.Array(value :_*))
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Trace = js.Array[Double]
}
