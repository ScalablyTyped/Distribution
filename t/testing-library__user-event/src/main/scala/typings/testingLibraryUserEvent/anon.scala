package typings.testingLibraryUserEvent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Delay extends StObject {
    
    var delay: Double
  }
  object Delay {
    
    inline def apply(delay: Double): Delay = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delay]
    }
    
    extension [Self <: Delay](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitialSelectionEnd extends StObject {
    
    var initialSelectionEnd: js.UndefOr[Double] = js.undefined
    
    var initialSelectionStart: js.UndefOr[Double] = js.undefined
  }
  object InitialSelectionEnd {
    
    inline def apply(): InitialSelectionEnd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitialSelectionEnd]
    }
    
    extension [Self <: InitialSelectionEnd](x: Self) {
      
      inline def setInitialSelectionEnd(value: Double): Self = StObject.set(x, "initialSelectionEnd", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectionEndUndefined: Self = StObject.set(x, "initialSelectionEnd", js.undefined)
      
      inline def setInitialSelectionStart(value: Double): Self = StObject.set(x, "initialSelectionStart", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectionStartUndefined: Self = StObject.set(x, "initialSelectionStart", js.undefined)
    }
  }
}
