package typings.tern.anon

import typings.tern.ternMod.FilesQuery
import typings.tern.ternMod.FilesQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFilesQuery extends StObject {
  
  var query: FilesQuery
  
  var result: FilesQueryResult
}
object QueryFilesQuery {
  
  @scala.inline
  def apply(query: FilesQuery, result: FilesQueryResult): QueryFilesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFilesQuery]
  }
  
  @scala.inline
  implicit class QueryFilesQueryMutableBuilder[Self <: QueryFilesQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: FilesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: FilesQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
