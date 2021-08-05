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
  
  inline def apply(query: FilesQuery, result: FilesQueryResult): QueryFilesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFilesQuery]
  }
  
  extension [Self <: QueryFilesQuery](x: Self) {
    
    inline def setQuery(value: FilesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult(value: FilesQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
