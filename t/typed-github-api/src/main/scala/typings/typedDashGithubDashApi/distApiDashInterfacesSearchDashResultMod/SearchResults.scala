package typings.typedDashGithubDashApi.distApiDashInterfacesSearchDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults[T] extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[T with SearchResult]
  var total_count: Double
}

object SearchResults {
  @scala.inline
  def apply[T](incomplete_results: Boolean, items: js.Array[T with SearchResult], total_count: Double): SearchResults[T] = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results, items = items, total_count = total_count)
  
    __obj.asInstanceOf[SearchResults[T]]
  }
}

