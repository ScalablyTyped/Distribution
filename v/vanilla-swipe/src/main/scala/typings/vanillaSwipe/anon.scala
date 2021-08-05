package typings.vanillaSwipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClientX extends StObject {
    
    var clientX: Double
    
    var clientY: Double
  }
  object ClientX {
    
    inline def apply(clientX: Double, clientY: Double): ClientX = {
      val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientX]
    }
    
    extension [Self <: ClientX](x: Self) {
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delta extends StObject {
    
    var delta: Double
    
    var element: Null
    
    var mouseTrackingEnabled: Boolean
    
    var preventDefaultTouchmoveEvent: Boolean
    
    var preventTrackingOnMouseleave: Boolean
    
    var rotationAngle: Double
    
    var touchTrackingEnabled: Boolean
  }
  object Delta {
    
    inline def apply(
      delta: Double,
      element: Null,
      mouseTrackingEnabled: Boolean,
      preventDefaultTouchmoveEvent: Boolean,
      preventTrackingOnMouseleave: Boolean,
      rotationAngle: Double,
      touchTrackingEnabled: Boolean
    ): Delta = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], mouseTrackingEnabled = mouseTrackingEnabled.asInstanceOf[js.Any], preventDefaultTouchmoveEvent = preventDefaultTouchmoveEvent.asInstanceOf[js.Any], preventTrackingOnMouseleave = preventTrackingOnMouseleave.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], touchTrackingEnabled = touchTrackingEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delta]
    }
    
    extension [Self <: Delta](x: Self) {
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Null): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackingEnabled(value: Boolean): Self = StObject.set(x, "mouseTrackingEnabled", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultTouchmoveEvent(value: Boolean): Self = StObject.set(x, "preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
      
      inline def setPreventTrackingOnMouseleave(value: Boolean): Self = StObject.set(x, "preventTrackingOnMouseleave", value.asInstanceOf[js.Any])
      
      inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      inline def setTouchTrackingEnabled(value: Boolean): Self = StObject.set(x, "touchTrackingEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsSwiping extends StObject {
    
    var isSwiping: Boolean
    
    var start: Double
    
    var traceX: js.Array[scala.Nothing]
    
    var traceY: js.Array[scala.Nothing]
    
    var x: Double
    
    var y: Double
  }
  object IsSwiping {
    
    inline def apply(
      isSwiping: Boolean,
      start: Double,
      traceX: js.Array[scala.Nothing],
      traceY: js.Array[scala.Nothing],
      x: Double,
      y: Double
    ): IsSwiping = {
      val __obj = js.Dynamic.literal(isSwiping = isSwiping.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], traceX = traceX.asInstanceOf[js.Any], traceY = traceY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsSwiping]
    }
    
    extension [Self <: IsSwiping](x: Self) {
      
      inline def setIsSwiping(value: Boolean): Self = StObject.set(x, "isSwiping", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTraceX(value: js.Array[scala.Nothing]): Self = StObject.set(x, "traceX", value.asInstanceOf[js.Any])
      
      inline def setTraceXVarargs(value: scala.Nothing*): Self = StObject.set(x, "traceX", js.Array(value :_*))
      
      inline def setTraceY(value: js.Array[scala.Nothing]): Self = StObject.set(x, "traceY", value.asInstanceOf[js.Any])
      
      inline def setTraceYVarargs(value: scala.Nothing*): Self = StObject.set(x, "traceY", js.Array(value :_*))
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Passive extends StObject {
    
    var passive: Boolean
  }
  object Passive {
    
    inline def apply(passive: Boolean): Passive = {
      val __obj = js.Dynamic.literal(passive = passive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Passive]
    }
    
    extension [Self <: Passive](x: Self) {
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    }
  }
  
  trait PassiveUndefined extends StObject {
    
    var passive: Unit
  }
  object PassiveUndefined {
    
    inline def apply(passive: Unit): PassiveUndefined = {
      val __obj = js.Dynamic.literal(passive = passive.asInstanceOf[js.Any])
      __obj.asInstanceOf[PassiveUndefined]
    }
    
    extension [Self <: PassiveUndefined](x: Self) {
      
      inline def setPassive(value: Unit): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: js.Any
    
    var y: js.Any
  }
  object X {
    
    inline def apply(x: js.Any, y: js.Any): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: js.Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Y extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Y {
    
    inline def apply(x: Double, y: Double): Y = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    extension [Self <: Y](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
