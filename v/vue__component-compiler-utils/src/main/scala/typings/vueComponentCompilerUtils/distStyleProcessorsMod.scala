package typings.vueComponentCompilerUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStyleProcessorsMod {
  
  @js.native
  trait StylePreprocessor extends StObject {
    
    def render(source: String, map: Any, options: Any): StylePreprocessorResults = js.native
    def render(source: String, map: Null, options: Any): StylePreprocessorResults = js.native
  }
  
  trait StylePreprocessorResults extends StObject {
    
    var code: String
    
    var errors: js.Array[js.Error]
    
    var map: js.UndefOr[Any] = js.undefined
  }
  object StylePreprocessorResults {
    
    inline def apply(code: String, errors: js.Array[js.Error]): StylePreprocessorResults = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylePreprocessorResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StylePreprocessorResults] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
}
