package typings.subscribeUiEvent

import typings.subscribeUiEvent.subscribeUiEventStrings._empty
import typings.subscribeUiEvent.subscribeUiEventStrings.x
import typings.subscribeUiEvent.subscribeUiEventStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AxisIntention extends StObject {
    
    var axisIntention: x | y | _empty
    
    var deltaX: Double
    
    var deltaY: Double
    
    var startX: Double
    
    var startY: Double
  }
  object AxisIntention {
    
    inline def apply(axisIntention: x | y | _empty, deltaX: Double, deltaY: Double, startX: Double, startY: Double): AxisIntention = {
      val __obj = js.Dynamic.literal(axisIntention = axisIntention.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisIntention]
    }
    
    extension [Self <: AxisIntention](x: Self) {
      
      inline def setAxisIntention(value: typings.subscribeUiEvent.subscribeUiEventStrings.x | y | _empty): Self = StObject.set(x, "axisIntention", value.asInstanceOf[js.Any])
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delta extends StObject {
    
    var delta: Double
    
    var top: Double
  }
  object Delta {
    
    inline def apply(delta: Double, top: Double): Delta = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delta]
    }
    
    extension [Self <: Delta](x: Self) {
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Remove extends StObject {
    
    def remove(): Unit
  }
  object Remove {
    
    inline def apply(remove: () => Unit): Remove = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[Remove]
    }
    
    extension [Self <: Remove](x: Self) {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
