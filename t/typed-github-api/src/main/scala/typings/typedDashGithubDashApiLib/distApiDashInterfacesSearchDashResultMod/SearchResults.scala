package typings
package typedDashGithubDashApiLib.distApiDashInterfacesSearchDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults[T] extends js.Object {
  var incomplete_results: scala.Boolean
  var items: js.Array[T with SearchResult]
  var total_count: scala.Double
}

object SearchResults {
  @scala.inline
  def apply[T](incomplete_results: scala.Boolean, items: js.Array[T with SearchResult], total_count: scala.Double): SearchResults[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("incomplete_results")(incomplete_results)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("total_count")(total_count)
    __obj.asInstanceOf[SearchResults[T]]
  }
}

