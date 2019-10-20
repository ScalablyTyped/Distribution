package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTML converted from an input document. */
trait HTMLReturn extends js.Object {
  /** The author of the input document, if identified. */
  var author: js.UndefOr[String] = js.undefined
  /** The HTML version of the input document. */
  var html: js.UndefOr[String] = js.undefined
  /** The number of pages in the input document. */
  var num_pages: js.UndefOr[String] = js.undefined
  /** The publication date of the input document, if identified. */
  var publication_date: js.UndefOr[String] = js.undefined
  /** The title of the input document, if identified. */
  var title: js.UndefOr[String] = js.undefined
}

object HTMLReturn {
  @scala.inline
  def apply(
    author: String = null,
    html: String = null,
    num_pages: String = null,
    publication_date: String = null,
    title: String = null
  ): HTMLReturn = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (html != null) __obj.updateDynamic("html")(html)
    if (num_pages != null) __obj.updateDynamic("num_pages")(num_pages)
    if (publication_date != null) __obj.updateDynamic("publication_date")(publication_date)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[HTMLReturn]
  }
}

