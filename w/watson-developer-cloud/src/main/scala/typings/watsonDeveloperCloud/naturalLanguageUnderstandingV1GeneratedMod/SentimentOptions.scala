package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Analyzes the general sentiment of your content or the sentiment toward specific target phrases. You can analyze sentiment for detected entities with `entities.sentiment` and for keywords with `keywords.sentiment`. Supported languages: Arabic, English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish. */
trait SentimentOptions extends js.Object {
  /** Set this to `false` to hide document-level sentiment results. */
  var document: js.UndefOr[Boolean] = js.undefined
  /** Sentiment results will be returned for each target string that is found in the document. */
  var targets: js.UndefOr[js.Array[String]] = js.undefined
}

object SentimentOptions {
  @scala.inline
  def apply(document: js.UndefOr[Boolean] = js.undefined, targets: js.Array[String] = null): SentimentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(document)) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentimentOptions]
  }
}

