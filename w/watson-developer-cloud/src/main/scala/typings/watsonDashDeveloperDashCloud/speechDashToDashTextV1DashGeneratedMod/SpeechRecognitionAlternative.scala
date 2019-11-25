package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SpeechRecognitionAlternative. */
trait SpeechRecognitionAlternative extends js.Object {
  /** A score that indicates the service's confidence in the transcript in the range of 0.0 to 1.0. A confidence score is returned only for the best alternative and only with results marked as final. */
  var confidence: js.UndefOr[Double] = js.undefined
  /** Time alignments for each word from the transcript as a list of lists. Each inner list consists of three elements: the word followed by its start and end time in seconds, for example: `[["hello",0.0,1.2],["world",1.2,2.5]]`. Timestamps are returned only for the best alternative. */
  var timestamps: js.UndefOr[js.Array[String]] = js.undefined
  /** A transcription of the audio. */
  var transcript: String
  /** A confidence score for each word of the transcript as a list of lists. Each inner list consists of two elements: the word and its confidence score in the range of 0.0 to 1.0, for example: `[["hello",0.95],["world",0.866]]`. Confidence scores are returned only for the best alternative and only with results marked as final. */
  var word_confidence: js.UndefOr[js.Array[String]] = js.undefined
}

object SpeechRecognitionAlternative {
  @scala.inline
  def apply(
    transcript: String,
    confidence: Int | Double = null,
    timestamps: js.Array[String] = null,
    word_confidence: js.Array[String] = null
  ): SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal(transcript = transcript.asInstanceOf[js.Any])
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (timestamps != null) __obj.updateDynamic("timestamps")(timestamps.asInstanceOf[js.Any])
    if (word_confidence != null) __obj.updateDynamic("word_confidence")(word_confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionAlternative]
  }
}

