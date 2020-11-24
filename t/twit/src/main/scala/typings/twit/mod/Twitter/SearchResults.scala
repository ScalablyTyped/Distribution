package typings.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResults extends js.Object {
  
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
  implicit class SearchResultsOps[Self <: SearchResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSearch_metadata(value: Metadata): Self = this.set("search_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesVarargs(value: Status*): Self = this.set("statuses", js.Array(value :_*))
    
    @scala.inline
    def setStatuses(value: js.Array[Status]): Self = this.set("statuses", value.asInstanceOf[js.Any])
  }
}
