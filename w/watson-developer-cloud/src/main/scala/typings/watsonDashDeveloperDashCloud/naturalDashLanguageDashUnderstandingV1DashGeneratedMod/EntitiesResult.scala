package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The important people, places, geopolitical entities and other types of entities in your content. */
trait EntitiesResult extends js.Object {
  /** How many times the entity was mentioned in the text. */
  var count: js.UndefOr[Double] = js.undefined
  /** Disambiguation information for the entity. */
  var disambiguation: js.UndefOr[DisambiguationResult] = js.undefined
  /** Emotion analysis results for the entity, enabled with the `emotion` option. */
  var emotion: js.UndefOr[EmotionScores] = js.undefined
  /** Entity mentions and locations. */
  var mentions: js.UndefOr[js.Array[EntityMention]] = js.undefined
  /** Relevance score from 0 to 1. Higher values indicate greater relevance. */
  var relevance: js.UndefOr[Double] = js.undefined
  /** Sentiment analysis results for the entity, enabled with the `sentiment` option. */
  var sentiment: js.UndefOr[FeatureSentimentResults] = js.undefined
  /** The name of the entity. */
  var text: js.UndefOr[String] = js.undefined
  /** Entity type. */
  var `type`: js.UndefOr[String] = js.undefined
}

object EntitiesResult {
  @scala.inline
  def apply(
    count: Int | Double = null,
    disambiguation: DisambiguationResult = null,
    emotion: EmotionScores = null,
    mentions: js.Array[EntityMention] = null,
    relevance: Int | Double = null,
    sentiment: FeatureSentimentResults = null,
    text: String = null,
    `type`: String = null
  ): EntitiesResult = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (disambiguation != null) __obj.updateDynamic("disambiguation")(disambiguation.asInstanceOf[js.Any])
    if (emotion != null) __obj.updateDynamic("emotion")(emotion.asInstanceOf[js.Any])
    if (mentions != null) __obj.updateDynamic("mentions")(mentions.asInstanceOf[js.Any])
    if (relevance != null) __obj.updateDynamic("relevance")(relevance.asInstanceOf[js.Any])
    if (sentiment != null) __obj.updateDynamic("sentiment")(sentiment.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitiesResult]
  }
}

