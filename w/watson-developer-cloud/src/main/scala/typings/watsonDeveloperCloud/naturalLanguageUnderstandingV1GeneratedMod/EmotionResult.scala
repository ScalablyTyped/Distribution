package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The detected anger, disgust, fear, joy, or sadness that is conveyed by the content. Emotion information can be returned for detected entities, keywords, or user-specified target phrases found in the text. */
trait EmotionResult extends js.Object {
  /** Emotion results for the document as a whole. */
  var document: js.UndefOr[DocumentEmotionResults] = js.undefined
  /** Emotion results for specified targets. */
  var targets: js.UndefOr[js.Array[TargetedEmotionResults]] = js.undefined
}

object EmotionResult {
  @scala.inline
  def apply(document: DocumentEmotionResults = null, targets: js.Array[TargetedEmotionResults] = null): EmotionResult = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmotionResult]
  }
}

