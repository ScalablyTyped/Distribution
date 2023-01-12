package typings.webpackBlocksUglify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: Any
    
    var error: Any
    
    var extractedComments: Any
    
    var map: Any
    
    var warnings: Any
  }
  object Code {
    
    inline def apply(code: Any, error: Any, extractedComments: Any, map: Any, warnings: Any): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], extractedComments = extractedComments.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setExtractedComments(value: Any): Self = StObject.set(x, "extractedComments", value.asInstanceOf[js.Any])
      
      inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: Any): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    }
  }
}
