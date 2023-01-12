package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchQuery
  extends StObject
     with Query {
  
  var search: String
}
object SearchQuery {
  
  inline def apply(search: String): SearchQuery = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchQuery] (val x: Self) extends AnyVal {
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
