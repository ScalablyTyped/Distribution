package typings.vueComponentCompilerUtils

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleProcessorsMod {
  
  @js.native
  trait StylePreprocessor extends StObject {
    
    def render(source: String, map: js.Any, options: js.Any): StylePreprocessorResults = js.native
    def render(source: String, map: Null, options: js.Any): StylePreprocessorResults = js.native
  }
  
  @js.native
  trait StylePreprocessorResults extends StObject {
    
    var code: String = js.native
    
    var errors: js.Array[Error] = js.native
    
    var map: js.UndefOr[js.Any] = js.native
  }
  object StylePreprocessorResults {
    
    @scala.inline
    def apply(code: String, errors: js.Array[Error]): StylePreprocessorResults = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylePreprocessorResults]
    }
    
    @scala.inline
    implicit class StylePreprocessorResultsMutableBuilder[Self <: StylePreprocessorResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
}
