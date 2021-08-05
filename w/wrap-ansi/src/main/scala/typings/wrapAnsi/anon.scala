package typings.wrapAnsi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hard extends StObject {
    
    var hard: js.UndefOr[Boolean] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var wordWrap: js.UndefOr[Boolean] = js.undefined
  }
  object Hard {
    
    inline def apply(): Hard = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hard]
    }
    
    extension [Self <: Hard](x: Self) {
      
      inline def setHard(value: Boolean): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
      
      inline def setHardUndefined: Self = StObject.set(x, "hard", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    }
  }
}
