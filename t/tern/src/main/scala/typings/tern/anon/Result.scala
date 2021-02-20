package typings.tern.anon

import typings.tern.ternMod.CompletionsQuery
import typings.tern.ternMod.CompletionsQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends StObject {
  
  var query: CompletionsQuery = js.native
  
  var result: CompletionsQueryResult = js.native
}
object Result {
  
  @scala.inline
  def apply(query: CompletionsQuery, result: CompletionsQueryResult): Result = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: CompletionsQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: CompletionsQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
