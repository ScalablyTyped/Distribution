package typings.tern.anon

import typings.tern.libTernMod.RenameQuery
import typings.tern.libTernMod.RenameQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRenameQuery extends StObject {
  
  var query: RenameQuery
  
  var result: RenameQueryResult
}
object QueryRenameQuery {
  
  inline def apply(query: RenameQuery, result: RenameQueryResult): QueryRenameQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRenameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryRenameQuery] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: RenameQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult(value: RenameQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
