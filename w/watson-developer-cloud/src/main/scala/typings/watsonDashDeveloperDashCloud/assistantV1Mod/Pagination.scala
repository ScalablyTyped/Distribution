package typings.watsonDashDeveloperDashCloud.assistantV1Mod

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
    matched: Int | Double = null,
    next_cursor: String = null,
    next_url: String = null,
    refresh_cursor: String = null,
    total: Int | Double = null
  ): Pagination = {
    val __obj = js.Dynamic.literal(refresh_url = refresh_url)
    if (matched != null) __obj.updateDynamic("matched")(matched.asInstanceOf[js.Any])
    if (next_cursor != null) __obj.updateDynamic("next_cursor")(next_cursor)
    if (next_url != null) __obj.updateDynamic("next_url")(next_url)
    if (refresh_cursor != null) __obj.updateDynamic("refresh_cursor")(refresh_cursor)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
}

