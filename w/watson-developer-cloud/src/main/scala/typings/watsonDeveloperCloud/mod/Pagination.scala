package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The pagination data for the returned objects. */
trait Pagination extends js.Object {
  /** Reserved for future use. */
  var matched: js.UndefOr[Double] = js.undefined
  /** A token identifying the next page of results. */
  var next_cursor: js.UndefOr[String] = js.undefined
  /** The URL that will return the next page of results. */
  var next_url: js.UndefOr[String] = js.undefined
  /** A token identifying the current page of results. */
  var refresh_cursor: js.UndefOr[String] = js.undefined
  /** The URL that will return the same page of results. */
  var refresh_url: String
  /** Reserved for future use. */
  var total: js.UndefOr[Double] = js.undefined
}

object Pagination {
  @scala.inline
  def apply(
    refresh_url: String,
    matched: js.UndefOr[Double] = js.undefined,
    next_cursor: String = null,
    next_url: String = null,
    refresh_cursor: String = null,
    total: js.UndefOr[Double] = js.undefined
  ): Pagination = {
    val __obj = js.Dynamic.literal(refresh_url = refresh_url.asInstanceOf[js.Any])
    if (!js.isUndefined(matched)) __obj.updateDynamic("matched")(matched.get.asInstanceOf[js.Any])
    if (next_cursor != null) __obj.updateDynamic("next_cursor")(next_cursor.asInstanceOf[js.Any])
    if (next_url != null) __obj.updateDynamic("next_url")(next_url.asInstanceOf[js.Any])
    if (refresh_cursor != null) __obj.updateDynamic("refresh_cursor")(refresh_cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
}

