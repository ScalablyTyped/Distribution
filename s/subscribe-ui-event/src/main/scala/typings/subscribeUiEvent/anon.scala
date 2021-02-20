package typings.subscribeUiEvent

import typings.subscribeUiEvent.subscribeUiEventStrings._empty
import typings.subscribeUiEvent.subscribeUiEventStrings.x
import typings.subscribeUiEvent.subscribeUiEventStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AxisIntention extends StObject {
    
    var axisIntention: x | y | _empty = js.native
    
    var deltaX: Double = js.native
    
    var deltaY: Double = js.native
    
    var startX: Double = js.native
    
    var startY: Double = js.native
  }
  object AxisIntention {
    
    @scala.inline
    def apply(axisIntention: x | y | _empty, deltaX: Double, deltaY: Double, startX: Double, startY: Double): AxisIntention = {
      val __obj = js.Dynamic.literal(axisIntention = axisIntention.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisIntention]
    }
    
    @scala.inline
    implicit class AxisIntentionMutableBuilder[Self <: AxisIntention] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxisIntention(value: typings.subscribeUiEvent.subscribeUiEventStrings.x | y | _empty): Self = StObject.set(x, "axisIntention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Delta extends StObject {
    
    var delta: Double = js.native
    
    var top: Double = js.native
  }
  object Delta {
    
    @scala.inline
    def apply(delta: Double, top: Double): Delta = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delta]
    }
    
    @scala.inline
    implicit class DeltaMutableBuilder[Self <: Delta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Remove extends StObject {
    
    def remove(): Unit = js.native
  }
  object Remove {
    
    @scala.inline
    def apply(remove: () => Unit): Remove = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[Remove]
    }
    
    @scala.inline
    implicit class RemoveMutableBuilder[Self <: Remove] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
