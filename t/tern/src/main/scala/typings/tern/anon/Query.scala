package typings.tern.anon

import typings.tern.libTernMod.CompletionsQuery
import typings.tern.libTernMod.CompletionsQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  var query: CompletionsQuery
  
  var result: CompletionsQueryResult
}
object Query {
  
  inline def apply(query: CompletionsQuery, result: CompletionsQueryResult): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setQuery(value: CompletionsQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult(value: CompletionsQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
