package typings.tern.anon

import typings.tern.ternMod.DefinitionQuery
import typings.tern.ternMod.DefinitionQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDefinitionQuery extends StObject {
  
  var query: DefinitionQuery
  
  var result: DefinitionQueryResult
}
object QueryDefinitionQuery {
  
  inline def apply(query: DefinitionQuery, result: DefinitionQueryResult): QueryDefinitionQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDefinitionQuery]
  }
  
  extension [Self <: QueryDefinitionQuery](x: Self) {
    
    inline def setQuery(value: DefinitionQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult(value: DefinitionQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
