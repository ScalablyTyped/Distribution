package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Webpage metadata, such as the author and the title of the page. */
@js.native
trait AnalysisResultsMetadata extends js.Object {
  /** The authors of the document. */
  var authors: js.UndefOr[js.Array[Author]] = js.native
  /** RSS/ATOM feeds found on the webpage. */
  var feeds: js.UndefOr[js.Array[Feed]] = js.native
  /** URL of a prominent image on the webpage. */
  var image: js.UndefOr[String] = js.native
  /** The publication date in the format ISO 8601. */
  var publication_date: js.UndefOr[String] = js.native
  /** The title of the document. */
  var title: js.UndefOr[String] = js.native
}

object AnalysisResultsMetadata {
  @scala.inline
  def apply(): AnalysisResultsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisResultsMetadata]
  }
  @scala.inline
  implicit class AnalysisResultsMetadataOps[Self <: AnalysisResultsMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthorsVarargs(value: Author*): Self = this.set("authors", js.Array(value :_*))
    @scala.inline
    def setAuthors(value: js.Array[Author]): Self = this.set("authors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthors: Self = this.set("authors", js.undefined)
    @scala.inline
    def setFeedsVarargs(value: Feed*): Self = this.set("feeds", js.Array(value :_*))
    @scala.inline
    def setFeeds(value: js.Array[Feed]): Self = this.set("feeds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeeds: Self = this.set("feeds", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setPublication_date(value: String): Self = this.set("publication_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublication_date: Self = this.set("publication_date", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

