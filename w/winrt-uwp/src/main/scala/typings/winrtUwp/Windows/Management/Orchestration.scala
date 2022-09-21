package typings.winrtUwp.Windows.Management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Orchestration {
  
  trait CurrentAppOrchestration extends StObject {
    
    /* unmapped type */
    var startSingleAppMode: Any
  }
  object CurrentAppOrchestration {
    
    inline def apply(startSingleAppMode: Any): CurrentAppOrchestration = {
      val __obj = js.Dynamic.literal(startSingleAppMode = startSingleAppMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentAppOrchestration]
    }
    
    extension [Self <: CurrentAppOrchestration](x: Self) {
      
      inline def setStartSingleAppMode(value: Any): Self = StObject.set(x, "startSingleAppMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait SingleAppModeContext extends StObject {
    
    var close: Any
  }
  object SingleAppModeContext {
    
    inline def apply(close: Any): SingleAppModeContext = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleAppModeContext]
    }
    
    extension [Self <: SingleAppModeContext](x: Self) {
      
      inline def setClose(value: Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    }
  }
}
