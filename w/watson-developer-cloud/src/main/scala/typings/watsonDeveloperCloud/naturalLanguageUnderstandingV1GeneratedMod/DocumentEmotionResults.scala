package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Emotion results for the document as a whole. */
trait DocumentEmotionResults extends js.Object {
  /** Emotion results for the document as a whole. */
  var emotion: js.UndefOr[EmotionScores] = js.undefined
}

object DocumentEmotionResults {
  @scala.inline
  def apply(emotion: EmotionScores = null): DocumentEmotionResults = {
    val __obj = js.Dynamic.literal()
    if (emotion != null) __obj.updateDynamic("emotion")(emotion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentEmotionResults]
  }
}

