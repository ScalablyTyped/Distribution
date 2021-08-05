package typings.tern.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryQuery extends StObject {
  
  var query: typings.tern.ternMod.Query
}
object QueryQuery {
  
  inline def apply(query: typings.tern.ternMod.Query): QueryQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryQuery]
  }
  
  extension [Self <: QueryQuery](x: Self) {
    
    inline def setQuery(value: typings.tern.ternMod.Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
