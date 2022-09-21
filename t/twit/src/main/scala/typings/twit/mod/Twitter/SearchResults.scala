package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResults extends StObject {
  
  var search_metadata: Metadata
  
  var statuses: js.Array[Status]
}
object SearchResults {
  
  inline def apply(search_metadata: Metadata, statuses: js.Array[Status]): SearchResults = {
    val __obj = js.Dynamic.literal(search_metadata = search_metadata.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResults]
  }
  
  extension [Self <: SearchResults](x: Self) {
    
    inline def setSearch_metadata(value: Metadata): Self = StObject.set(x, "search_metadata", value.asInstanceOf[js.Any])
    
    inline def setStatuses(value: js.Array[Status]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesVarargs(value: Status*): Self = StObject.set(x, "statuses", js.Array(value*))
  }
}
