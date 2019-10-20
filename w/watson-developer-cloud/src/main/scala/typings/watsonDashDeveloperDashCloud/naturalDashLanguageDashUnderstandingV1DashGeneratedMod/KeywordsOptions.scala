package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns important keywords in the content. Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish, Swedish. */
trait KeywordsOptions extends js.Object {
  /** Set this to `true` to analyze emotion for detected keywords. */
  var emotion: js.UndefOr[Boolean] = js.undefined
  /** Maximum number of keywords to return. */
  var limit: js.UndefOr[Double] = js.undefined
  /** Set this to `true` to return sentiment information for detected keywords. */
  var sentiment: js.UndefOr[Boolean] = js.undefined
}

object KeywordsOptions {
  @scala.inline
  def apply(
    emotion: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    sentiment: js.UndefOr[Boolean] = js.undefined
  ): KeywordsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emotion)) __obj.updateDynamic("emotion")(emotion)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(sentiment)) __obj.updateDynamic("sentiment")(sentiment)
    __obj.asInstanceOf[KeywordsOptions]
  }
}

