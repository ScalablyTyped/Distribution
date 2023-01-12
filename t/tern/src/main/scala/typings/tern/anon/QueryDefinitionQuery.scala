package typings.tern.anon

import typings.tern.libTernMod.DefinitionQuery
import typings.tern.libTernMod.DefinitionQueryResult
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDefinitionQuery] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: DefinitionQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult(value: DefinitionQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
