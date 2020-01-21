package typings.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults extends js.Object {
  var search_metadata: Metadata
  var statuses: js.Array[Status]
}

object SearchResults {
  @scala.inline
  def apply(search_metadata: Metadata, statuses: js.Array[Status]): SearchResults = {
    val __obj = js.Dynamic.literal(search_metadata = search_metadata.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResults]
  }
}

