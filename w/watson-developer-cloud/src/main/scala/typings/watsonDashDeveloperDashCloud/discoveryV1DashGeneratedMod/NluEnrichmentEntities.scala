package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object speficying the Entities enrichment and related parameters. */
trait NluEnrichmentEntities extends js.Object {
  /** When `true`, emotion detection of entities will be performed on the specified field. */
  var emotion: js.UndefOr[Boolean] = js.undefined
  /** The maximum number of entities to extract for each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.undefined
  /** When `true`, the types of mentions for each idetifieid entity is recorded. The default is `false`. */
  var mention_types: js.UndefOr[Boolean] = js.undefined
  /** When `true`, the number of mentions of each identified entity is recorded. The default is `false`. */
  var mentions: js.UndefOr[Boolean] = js.undefined
  /** The enrichement model to use with entity extraction. May be a custom model provided by Watson Knowledge Studio, the public model for use with Knowledge Graph `en-news`, or the default public model `alchemy`. */
  var model: js.UndefOr[String] = js.undefined
  /** When `true`, a list of sentence locations for each instance of each identified entity is recorded. The default is `false`. */
  var sentence_locations: js.UndefOr[Boolean] = js.undefined
  /** When `true`, sentiment analysis of entities will be performed on the specified field. */
  var sentiment: js.UndefOr[Boolean] = js.undefined
}

object NluEnrichmentEntities {
  @scala.inline
  def apply(
    emotion: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    mention_types: js.UndefOr[Boolean] = js.undefined,
    mentions: js.UndefOr[Boolean] = js.undefined,
    model: String = null,
    sentence_locations: js.UndefOr[Boolean] = js.undefined,
    sentiment: js.UndefOr[Boolean] = js.undefined
  ): NluEnrichmentEntities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emotion)) __obj.updateDynamic("emotion")(emotion)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(mention_types)) __obj.updateDynamic("mention_types")(mention_types)
    if (!js.isUndefined(mentions)) __obj.updateDynamic("mentions")(mentions)
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(sentence_locations)) __obj.updateDynamic("sentence_locations")(sentence_locations)
    if (!js.isUndefined(sentiment)) __obj.updateDynamic("sentiment")(sentiment)
    __obj.asInstanceOf[NluEnrichmentEntities]
  }
}

