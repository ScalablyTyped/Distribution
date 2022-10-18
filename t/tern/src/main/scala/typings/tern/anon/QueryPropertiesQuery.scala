package typings.tern.anon

import typings.tern.libTernMod.PropertiesQuery
import typings.tern.libTernMod.PropertiesQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPropertiesQuery extends StObject {
  
  var query: PropertiesQuery
  
  var result: PropertiesQueryResult
}
object QueryPropertiesQuery {
  
  inline def apply(query: PropertiesQuery, result: PropertiesQueryResult): QueryPropertiesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPropertiesQuery]
  }
  
  extension [Self <: QueryPropertiesQuery](x: Self) {
    
    inline def setQuery(value: PropertiesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult(value: PropertiesQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
