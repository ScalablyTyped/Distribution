package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResults extends StObject {
  
  var search_metadata: Metadata = js.native
  
  var statuses: js.Array[Status] = js.native
}
object SearchResults {
  
  @scala.inline
  def apply(search_metadata: Metadata, statuses: js.Array[Status]): SearchResults = {
    val __obj = js.Dynamic.literal(search_metadata = search_metadata.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResults]
  }
  
  @scala.inline
  implicit class SearchResultsMutableBuilder[Self <: SearchResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearch_metadata(value: Metadata): Self = StObject.set(x, "search_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatuses(value: js.Array[Status]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesVarargs(value: Status*): Self = StObject.set(x, "statuses", js.Array(value :_*))
  }
}
