package typings.tern.anon

import typings.tern.libTernMod.DocumentationQuery
import typings.tern.libTernMod.DocumentationQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDocumentationQuery extends StObject {
  
  var query: DocumentationQuery
  
  var result: DocumentationQueryResult
}
object QueryDocumentationQuery {
  
  inline def apply(query: DocumentationQuery, result: DocumentationQueryResult): QueryDocumentationQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDocumentationQuery]
  }
  
  extension [Self <: QueryDocumentationQuery](x: Self) {
    
    inline def setQuery(value: DocumentationQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult(value: DocumentationQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
