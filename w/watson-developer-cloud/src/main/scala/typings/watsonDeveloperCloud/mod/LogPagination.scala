package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The pagination data for the returned objects. */
trait LogPagination extends js.Object {
  /** Reserved for future use. */
  var matched: js.UndefOr[Double] = js.undefined
  /** A token identifying the next page of results. */
  var next_cursor: js.UndefOr[String] = js.undefined
  /** The URL that will return the next page of results, if any. */
  var next_url: js.UndefOr[String] = js.undefined
}

object LogPagination {
  @scala.inline
  def apply(matched: js.UndefOr[Double] = js.undefined, next_cursor: String = null, next_url: String = null): LogPagination = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(matched)) __obj.updateDynamic("matched")(matched.get.asInstanceOf[js.Any])
    if (next_cursor != null) __obj.updateDynamic("next_cursor")(next_cursor.asInstanceOf[js.Any])
    if (next_url != null) __obj.updateDynamic("next_url")(next_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogPagination]
  }
}

