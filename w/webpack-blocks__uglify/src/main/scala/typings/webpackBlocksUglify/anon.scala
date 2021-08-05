package typings.webpackBlocksUglify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: js.Any
    
    var error: js.Any
    
    var extractedComments: js.Any
    
    var map: js.Any
    
    var warnings: js.Any
  }
  object Code {
    
    inline def apply(code: js.Any, error: js.Any, extractedComments: js.Any, map: js.Any, warnings: js.Any): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], extractedComments = extractedComments.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: js.Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setExtractedComments(value: js.Any): Self = StObject.set(x, "extractedComments", value.asInstanceOf[js.Any])
      
      inline def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Any): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    }
  }
}
