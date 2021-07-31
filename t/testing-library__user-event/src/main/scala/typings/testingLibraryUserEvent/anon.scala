package typings.testingLibraryUserEvent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Delay extends StObject {
    
    var delay: Double
  }
  object Delay {
    
    @scala.inline
    def apply(delay: Double): Delay = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitialSelectionEnd extends StObject {
    
    var initialSelectionEnd: js.UndefOr[Double] = js.undefined
    
    var initialSelectionStart: js.UndefOr[Double] = js.undefined
  }
  object InitialSelectionEnd {
    
    @scala.inline
    def apply(): InitialSelectionEnd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitialSelectionEnd]
    }
    
    @scala.inline
    implicit class InitialSelectionEndMutableBuilder[Self <: InitialSelectionEnd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialSelectionEnd(value: Double): Self = StObject.set(x, "initialSelectionEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSelectionEndUndefined: Self = StObject.set(x, "initialSelectionEnd", js.undefined)
      
      @scala.inline
      def setInitialSelectionStart(value: Double): Self = StObject.set(x, "initialSelectionStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSelectionStartUndefined: Self = StObject.set(x, "initialSelectionStart", js.undefined)
    }
  }
}
