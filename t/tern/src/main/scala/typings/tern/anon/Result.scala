package typings.tern.anon

import typings.tern.ternMod.CompletionsQuery
import typings.tern.ternMod.CompletionsQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  var query: CompletionsQuery
  
  var result: CompletionsQueryResult
}
object Result {
  
  inline def apply(query: CompletionsQuery, result: CompletionsQueryResult): Result = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setQuery(value: CompletionsQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult(value: CompletionsQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
