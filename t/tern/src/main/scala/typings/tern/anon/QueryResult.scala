package typings.tern.anon

import typings.tern.libTernMod.TypeQuery
import typings.tern.libTernMod.TypeQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResult extends StObject {
  
  var query: TypeQuery
  
  var result: TypeQueryResult
}
object QueryResult {
  
  inline def apply(query: TypeQuery, result: TypeQueryResult): QueryResult = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
  
  extension [Self <: QueryResult](x: Self) {
    
    inline def setQuery(value: TypeQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult(value: TypeQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
