package typings.tern.anon

import typings.tern.libTernMod.RefsQuery
import typings.tern.libTernMod.RefsQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRefsQuery extends StObject {
  
  var query: RefsQuery
  
  var result: RefsQueryResult
}
object QueryRefsQuery {
  
  inline def apply(query: RefsQuery, result: RefsQueryResult): QueryRefsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRefsQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryRefsQuery] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: RefsQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult(value: RefsQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
