package typings.tablestore.anon

import typings.tablestore.mod.EnumValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  var query: js.UndefOr[Any] = js.undefined
  
  var queryType: EnumValues[BOOLQUERY]
}
object Query {
  
  inline def apply(queryType: EnumValues[BOOLQUERY]): Query = {
    val __obj = js.Dynamic.literal(queryType = queryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryType(value: EnumValues[BOOLQUERY]): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
