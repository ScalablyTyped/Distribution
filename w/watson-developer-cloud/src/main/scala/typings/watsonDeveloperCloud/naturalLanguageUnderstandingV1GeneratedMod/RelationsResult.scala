package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The relations between entities found in the content. */
trait RelationsResult extends js.Object {
  /** Entity mentions that are involved in the relation. */
  var arguments: js.UndefOr[js.Array[RelationArgument]] = js.undefined
  /** Confidence score for the relation. Higher values indicate greater confidence. */
  var score: js.UndefOr[Double] = js.undefined
  /** The sentence that contains the relation. */
  var sentence: js.UndefOr[String] = js.undefined
  /** The type of the relation. */
  var `type`: js.UndefOr[String] = js.undefined
}

object RelationsResult {
  @scala.inline
  def apply(
    arguments: js.Array[RelationArgument] = null,
    score: Int | Double = null,
    sentence: String = null,
    `type`: String = null
  ): RelationsResult = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (sentence != null) __obj.updateDynamic("sentence")(sentence.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationsResult]
  }
}

