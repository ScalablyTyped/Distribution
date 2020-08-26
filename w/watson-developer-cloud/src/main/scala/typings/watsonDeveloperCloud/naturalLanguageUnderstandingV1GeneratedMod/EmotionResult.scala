package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The detected anger, disgust, fear, joy, or sadness that is conveyed by the content. Emotion information can be returned for detected entities, keywords, or user-specified target phrases found in the text. */
@js.native
trait EmotionResult extends js.Object {
  /** Emotion results for the document as a whole. */
  var document: js.UndefOr[DocumentEmotionResults] = js.native
  /** Emotion results for specified targets. */
  var targets: js.UndefOr[js.Array[TargetedEmotionResults]] = js.native
}

object EmotionResult {
  @scala.inline
  def apply(): EmotionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionResult]
  }
  @scala.inline
  implicit class EmotionResultOps[Self <: EmotionResult] (val x: Self) extends AnyVal {
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
    def setDocument(value: DocumentEmotionResults): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: TargetedEmotionResults*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: js.Array[TargetedEmotionResults]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
  }
  
}

