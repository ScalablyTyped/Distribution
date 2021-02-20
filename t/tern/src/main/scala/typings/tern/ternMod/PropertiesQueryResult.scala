package typings.tern.ternMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesQueryResult extends StObject {
  
  /** The property names. */
  var completions: js.Array[String] = js.native
}
object PropertiesQueryResult {
  
  @scala.inline
  def apply(completions: js.Array[String]): PropertiesQueryResult = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesQueryResult]
  }
  
  @scala.inline
  implicit class PropertiesQueryResultMutableBuilder[Self <: PropertiesQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletions(value: js.Array[String]): Self = StObject.set(x, "completions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionsVarargs(value: String*): Self = StObject.set(x, "completions", js.Array(value :_*))
  }
}
