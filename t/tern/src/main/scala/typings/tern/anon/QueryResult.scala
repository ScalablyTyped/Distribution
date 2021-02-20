package typings.tern.anon

import typings.tern.ternMod.TypeQuery
import typings.tern.ternMod.TypeQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResult extends StObject {
  
  var query: TypeQuery = js.native
  
  var result: TypeQueryResult = js.native
}
object QueryResult {
  
  @scala.inline
  def apply(query: TypeQuery, result: TypeQueryResult): QueryResult = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
  
  @scala.inline
  implicit class QueryResultMutableBuilder[Self <: QueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: TypeQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: TypeQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
