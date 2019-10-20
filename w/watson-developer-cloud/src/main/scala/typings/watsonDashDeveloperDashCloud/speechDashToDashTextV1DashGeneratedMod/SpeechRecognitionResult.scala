package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SpeechRecognitionResult. */
trait SpeechRecognitionResult extends js.Object {
  /** An array of alternative transcripts. The `alternatives` array can include additional requested output such as word confidence or timestamps. */
  var alternatives: js.Array[SpeechRecognitionAlternative]
  /** An indication of whether the transcription results are final. If `true`, the results for this utterance are not updated further; no additional results are sent for a `result_index` once its results are indicated as final. */
  var final_results: Boolean
  /** A dictionary (or associative array) whose keys are the strings specified for `keywords` if both that parameter and `keywords_threshold` are specified. The value for each key is an array of matches spotted in the audio for that keyword. Each match is described by a `KeywordResult` object. A keyword for which no matches are found is omitted from the dictionary. The dictionary is omitted entirely if no matches are found for any keywords. */
  var keywords_result: js.UndefOr[js.Object] = js.undefined
  /** An array of alternative hypotheses found for words of the input audio if a `word_alternatives_threshold` is specified. */
  var word_alternatives: js.UndefOr[js.Array[WordAlternativeResults]] = js.undefined
}

object SpeechRecognitionResult {
  @scala.inline
  def apply(
    alternatives: js.Array[SpeechRecognitionAlternative],
    final_results: Boolean,
    keywords_result: js.Object = null,
    word_alternatives: js.Array[WordAlternativeResults] = null
  ): SpeechRecognitionResult = {
    val __obj = js.Dynamic.literal(alternatives = alternatives, final_results = final_results)
    if (keywords_result != null) __obj.updateDynamic("keywords_result")(keywords_result)
    if (word_alternatives != null) __obj.updateDynamic("word_alternatives")(word_alternatives)
    __obj.asInstanceOf[SpeechRecognitionResult]
  }
}

