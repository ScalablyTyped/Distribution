package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeCompilerOptions extends StObject {
  
  var comments: js.UndefOr[Boolean] = js.undefined
  
  var delimiters: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  
  var isCustomElement: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.undefined
  
  var whitespace: js.UndefOr["preserve" | "condense"] = js.undefined
}
object RuntimeCompilerOptions {
  
  inline def apply(): RuntimeCompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeCompilerOptions]
  }
  
  extension [Self <: RuntimeCompilerOptions](x: Self) {
    
    inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setDelimiters(value: js.Tuple2[String, String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
    
    inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
    
    inline def setIsCustomElement(value: /* tag */ String => Boolean): Self = StObject.set(x, "isCustomElement", js.Any.fromFunction1(value))
    
    inline def setIsCustomElementUndefined: Self = StObject.set(x, "isCustomElement", js.undefined)
    
    inline def setWhitespace(value: "preserve" | "condense"): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    
    inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
  }
}
