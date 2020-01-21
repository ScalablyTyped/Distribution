package typings.thepiratebay.mod

import typings.thepiratebay.AnonVerified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var category: js.UndefOr[String | Double] = js.undefined
  var filter: js.UndefOr[AnonVerified] = js.undefined
  var orderBy: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var sortBy: js.UndefOr[String] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    category: String | Double = null,
    filter: AnonVerified = null,
    orderBy: String = null,
    page: Int | Double = null,
    sortBy: String = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

