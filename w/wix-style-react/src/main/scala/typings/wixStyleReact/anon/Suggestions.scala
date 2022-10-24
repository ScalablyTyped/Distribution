package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suggestions extends StObject {
  
  var suggestions: js.Array[scala.Nothing]
  
  var value: Any
}
object Suggestions {
  
  inline def apply(suggestions: js.Array[scala.Nothing], value: Any): Suggestions = {
    val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggestions]
  }
  
  extension [Self <: Suggestions](x: Self) {
    
    inline def setSuggestions(value: js.Array[scala.Nothing]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsVarargs(value: scala.Nothing*): Self = StObject.set(x, "suggestions", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
