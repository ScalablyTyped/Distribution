package typings.tern.anon

import typings.tern.ternMod.DocumentationQuery
import typings.tern.ternMod.DocumentationQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryDocumentationQuery extends StObject {
  
  var query: DocumentationQuery = js.native
  
  var result: DocumentationQueryResult = js.native
}
object QueryDocumentationQuery {
  
  @scala.inline
  def apply(query: DocumentationQuery, result: DocumentationQueryResult): QueryDocumentationQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDocumentationQuery]
  }
  
  @scala.inline
  implicit class QueryDocumentationQueryMutableBuilder[Self <: QueryDocumentationQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: DocumentationQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: DocumentationQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
