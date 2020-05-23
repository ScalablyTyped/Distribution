package typings.thepiratebay.mod

import typings.thepiratebay.anon.Verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var category: js.UndefOr[String | Double] = js.undefined
  var filter: js.UndefOr[Verified] = js.undefined
  var orderBy: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var sortBy: js.UndefOr[String] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    category: String | Double = null,
    filter: Verified = null,
    orderBy: String = null,
    page: js.UndefOr[Double] = js.undefined,
    sortBy: String = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

