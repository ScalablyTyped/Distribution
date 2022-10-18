package typings.tern.libTernMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesQueryResult extends StObject {
  
  /** The property names. */
  var completions: js.Array[String]
}
object PropertiesQueryResult {
  
  inline def apply(completions: js.Array[String]): PropertiesQueryResult = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesQueryResult]
  }
  
  extension [Self <: PropertiesQueryResult](x: Self) {
    
    inline def setCompletions(value: js.Array[String]): Self = StObject.set(x, "completions", value.asInstanceOf[js.Any])
    
    inline def setCompletionsVarargs(value: String*): Self = StObject.set(x, "completions", js.Array(value*))
  }
}
