package typings.thepiratebay.thepiratebayMod

import typings.thepiratebay.Anon_Verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var category: js.UndefOr[String | Double] = js.undefined
  var filter: js.UndefOr[Anon_Verified] = js.undefined
  var orderBy: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var sortBy: js.UndefOr[String] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    category: String | Double = null,
    filter: Anon_Verified = null,
    orderBy: String = null,
    page: Int | Double = null,
    sortBy: String = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy)
    __obj.asInstanceOf[SearchOptions]
  }
}

