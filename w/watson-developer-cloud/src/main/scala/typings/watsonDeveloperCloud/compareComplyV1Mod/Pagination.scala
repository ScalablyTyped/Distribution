package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Pagination details, if required by the length of the output. */
trait Pagination extends js.Object {
  /** A token identifying the next page of results. */
  var next_cursor: js.UndefOr[String] = js.undefined
  /** The URL that returns the next page of results. */
  var next_url: js.UndefOr[String] = js.undefined
  /** A token identifying the current page of results. */
  var refresh_cursor: js.UndefOr[String] = js.undefined
  /** The URL that returns the current page of results. */
  var refresh_url: js.UndefOr[String] = js.undefined
  /** Reserved for future use. */
  var total: js.UndefOr[Double] = js.undefined
}

object Pagination {
  @scala.inline
  def apply(
    next_cursor: String = null,
    next_url: String = null,
    refresh_cursor: String = null,
    refresh_url: String = null,
    total: js.UndefOr[Double] = js.undefined
  ): Pagination = {
    val __obj = js.Dynamic.literal()
    if (next_cursor != null) __obj.updateDynamic("next_cursor")(next_cursor.asInstanceOf[js.Any])
    if (next_url != null) __obj.updateDynamic("next_url")(next_url.asInstanceOf[js.Any])
    if (refresh_cursor != null) __obj.updateDynamic("refresh_cursor")(refresh_cursor.asInstanceOf[js.Any])
    if (refresh_url != null) __obj.updateDynamic("refresh_url")(refresh_url.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
}

