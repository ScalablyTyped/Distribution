package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies people, cities, organizations, and other entities in the content. See [Entity types and subtypes](https://cloud.ibm.com/docs/services/natural-language-understanding/entity-types.html). Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish, Swedish. Arabic, Chinese, and Dutch are supported only through custom models. */
trait EntitiesOptions extends js.Object {
  /** Set this to `true` to analyze emotion for detected keywords. */
  var emotion: js.UndefOr[Boolean] = js.undefined
  /** Maximum number of entities to return. */
  var limit: js.UndefOr[Double] = js.undefined
  /** Set this to `true` to return locations of entity mentions. */
  var mentions: js.UndefOr[Boolean] = js.undefined
  /** Enter a [custom model](https://cloud.ibm.com/docs/services/natural-language-understanding/customizing.html) ID to override the standard entity detection model. */
  var model: js.UndefOr[String] = js.undefined
  /** Set this to `true` to return sentiment information for detected entities. */
  var sentiment: js.UndefOr[Boolean] = js.undefined
}

object EntitiesOptions {
  @scala.inline
  def apply(
    emotion: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    mentions: js.UndefOr[Boolean] = js.undefined,
    model: String = null,
    sentiment: js.UndefOr[Boolean] = js.undefined
  ): EntitiesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emotion)) __obj.updateDynamic("emotion")(emotion)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(mentions)) __obj.updateDynamic("mentions")(mentions)
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(sentiment)) __obj.updateDynamic("sentiment")(sentiment)
    __obj.asInstanceOf[EntitiesOptions]
  }
}

