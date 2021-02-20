package typings.tern.anon

import typings.tern.ternMod.RenameQuery
import typings.tern.ternMod.RenameQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryRenameQuery extends StObject {
  
  var query: RenameQuery = js.native
  
  var result: RenameQueryResult = js.native
}
object QueryRenameQuery {
  
  @scala.inline
  def apply(query: RenameQuery, result: RenameQueryResult): QueryRenameQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRenameQuery]
  }
  
  @scala.inline
  implicit class QueryRenameQueryMutableBuilder[Self <: QueryRenameQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: RenameQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: RenameQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
