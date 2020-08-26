package typings.typedGithubApi.searchResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResults[T] extends js.Object {
  var incomplete_results: Boolean = js.native
  var items: js.Array[T with SearchResult] = js.native
  var total_count: Double = js.native
}

object SearchResults {
  @scala.inline
  def apply[T](incomplete_results: Boolean, items: js.Array[T with SearchResult], total_count: Double): SearchResults[T] = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResults[T]]
  }
  @scala.inline
  implicit class SearchResultsOps[Self <: SearchResults[_], T] (val x: Self with SearchResults[T]) extends AnyVal {
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
    def setIncomplete_results(value: Boolean): Self = this.set("incomplete_results", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: (T with SearchResult)*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[T with SearchResult]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
  
}

