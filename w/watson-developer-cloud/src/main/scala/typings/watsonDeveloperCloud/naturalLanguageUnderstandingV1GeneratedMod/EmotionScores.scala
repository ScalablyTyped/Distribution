package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** EmotionScores. */
@js.native
trait EmotionScores extends js.Object {
  /** Anger score from 0 to 1. A higher score means that the text is more likely to convey anger. */
  var anger: js.UndefOr[Double] = js.native
  /** Disgust score from 0 to 1. A higher score means that the text is more likely to convey disgust. */
  var disgust: js.UndefOr[Double] = js.native
  /** Fear score from 0 to 1. A higher score means that the text is more likely to convey fear. */
  var fear: js.UndefOr[Double] = js.native
  /** Joy score from 0 to 1. A higher score means that the text is more likely to convey joy. */
  var joy: js.UndefOr[Double] = js.native
  /** Sadness score from 0 to 1. A higher score means that the text is more likely to convey sadness. */
  var sadness: js.UndefOr[Double] = js.native
}

object EmotionScores {
  @scala.inline
  def apply(): EmotionScores = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionScores]
  }
  @scala.inline
  implicit class EmotionScoresOps[Self <: EmotionScores] (val x: Self) extends AnyVal {
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
    def setAnger(value: Double): Self = this.set("anger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnger: Self = this.set("anger", js.undefined)
    @scala.inline
    def setDisgust(value: Double): Self = this.set("disgust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisgust: Self = this.set("disgust", js.undefined)
    @scala.inline
    def setFear(value: Double): Self = this.set("fear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFear: Self = this.set("fear", js.undefined)
    @scala.inline
    def setJoy(value: Double): Self = this.set("joy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoy: Self = this.set("joy", js.undefined)
    @scala.inline
    def setSadness(value: Double): Self = this.set("sadness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSadness: Self = this.set("sadness", js.undefined)
  }
  
}

