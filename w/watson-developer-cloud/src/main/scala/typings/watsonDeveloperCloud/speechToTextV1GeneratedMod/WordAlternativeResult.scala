package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WordAlternativeResult. */
@js.native
trait WordAlternativeResult extends js.Object {
  /** A confidence score for the word alternative hypothesis in the range of 0.0 to 1.0. */
  var confidence: Double = js.native
  /** An alternative hypothesis for a word from the input audio. */
  var word: String = js.native
}

object WordAlternativeResult {
  @scala.inline
  def apply(confidence: Double, word: String): WordAlternativeResult = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordAlternativeResult]
  }
  @scala.inline
  implicit class WordAlternativeResultOps[Self <: WordAlternativeResult] (val x: Self) extends AnyVal {
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def setWord(value: String): Self = this.set("word", value.asInstanceOf[js.Any])
  }
  
}

