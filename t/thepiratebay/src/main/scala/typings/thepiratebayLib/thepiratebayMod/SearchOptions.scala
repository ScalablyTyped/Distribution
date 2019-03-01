package typings
package thepiratebayLib.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var category: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var filter: js.UndefOr[thepiratebayLib.Anon_Verified] = js.undefined
  var orderBy: js.UndefOr[java.lang.String] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var sortBy: js.UndefOr[java.lang.String] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    category: java.lang.String | scala.Double = null,
    filter: thepiratebayLib.Anon_Verified = null,
    orderBy: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    sortBy: java.lang.String = null
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

