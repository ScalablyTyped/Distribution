package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Analyzes the general sentiment of your content or the sentiment toward specific target phrases. You can analyze sentiment for detected entities with `entities.sentiment` and for keywords with `keywords.sentiment`. Supported languages: Arabic, English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish. */
@js.native
trait SentimentOptions extends js.Object {
  /** Set this to `false` to hide document-level sentiment results. */
  var document: js.UndefOr[Boolean] = js.native
  /** Sentiment results will be returned for each target string that is found in the document. */
  var targets: js.UndefOr[js.Array[String]] = js.native
}

object SentimentOptions {
  @scala.inline
  def apply(): SentimentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentOptions]
  }
  @scala.inline
  implicit class SentimentOptionsOps[Self <: SentimentOptions] (val x: Self) extends AnyVal {
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
    def setDocument(value: Boolean): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: String*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: js.Array[String]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
  }
  
}

