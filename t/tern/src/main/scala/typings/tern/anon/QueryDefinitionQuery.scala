package typings.tern.anon

import typings.tern.ternMod.DefinitionQuery
import typings.tern.ternMod.DefinitionQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryDefinitionQuery extends StObject {
  
  var query: DefinitionQuery = js.native
  
  var result: DefinitionQueryResult = js.native
}
object QueryDefinitionQuery {
  
  @scala.inline
  def apply(query: DefinitionQuery, result: DefinitionQueryResult): QueryDefinitionQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDefinitionQuery]
  }
  
  @scala.inline
  implicit class QueryDefinitionQueryMutableBuilder[Self <: QueryDefinitionQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: DefinitionQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: DefinitionQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
