package typings.vueComponentCompilerUtils

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleProcessorsMod {
  
  @js.native
  trait StylePreprocessor extends StObject {
    
    def render(source: String, map: js.Any, options: js.Any): StylePreprocessorResults = js.native
    def render(source: String, map: Null, options: js.Any): StylePreprocessorResults = js.native
  }
  
  trait StylePreprocessorResults extends StObject {
    
    var code: String
    
    var errors: js.Array[Error]
    
    var map: js.UndefOr[js.Any] = js.undefined
  }
  object StylePreprocessorResults {
    
    inline def apply(code: String, errors: js.Array[Error]): StylePreprocessorResults = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylePreprocessorResults]
    }
    
    extension [Self <: StylePreprocessorResults](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      inline def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
}
