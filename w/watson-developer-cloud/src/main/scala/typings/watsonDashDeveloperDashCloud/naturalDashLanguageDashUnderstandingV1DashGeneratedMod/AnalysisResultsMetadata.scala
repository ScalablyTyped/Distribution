package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Webpage metadata, such as the author and the title of the page. */
trait AnalysisResultsMetadata extends js.Object {
  /** The authors of the document. */
  var authors: js.UndefOr[js.Array[Author]] = js.undefined
  /** RSS/ATOM feeds found on the webpage. */
  var feeds: js.UndefOr[js.Array[Feed]] = js.undefined
  /** URL of a prominent image on the webpage. */
  var image: js.UndefOr[String] = js.undefined
  /** The publication date in the format ISO 8601. */
  var publication_date: js.UndefOr[String] = js.undefined
  /** The title of the document. */
  var title: js.UndefOr[String] = js.undefined
}

object AnalysisResultsMetadata {
  @scala.inline
  def apply(
    authors: js.Array[Author] = null,
    feeds: js.Array[Feed] = null,
    image: String = null,
    publication_date: String = null,
    title: String = null
  ): AnalysisResultsMetadata = {
    val __obj = js.Dynamic.literal()
    if (authors != null) __obj.updateDynamic("authors")(authors)
    if (feeds != null) __obj.updateDynamic("feeds")(feeds)
    if (image != null) __obj.updateDynamic("image")(image)
    if (publication_date != null) __obj.updateDynamic("publication_date")(publication_date)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AnalysisResultsMetadata]
  }
}

