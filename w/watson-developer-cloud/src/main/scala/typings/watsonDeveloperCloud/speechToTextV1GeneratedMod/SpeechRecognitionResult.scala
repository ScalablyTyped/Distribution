package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SpeechRecognitionResult. */
@js.native
trait SpeechRecognitionResult extends js.Object {
  
  /** An array of alternative transcripts. The `alternatives` array can include additional requested output such as word confidence or timestamps. */
  var alternatives: js.Array[SpeechRecognitionAlternative] = js.native
  
  /** An indication of whether the transcription results are final. If `true`, the results for this utterance are not updated further; no additional results are sent for a `result_index` once its results are indicated as final. */
  var final_results: Boolean = js.native
  
  /** A dictionary (or associative array) whose keys are the strings specified for `keywords` if both that parameter and `keywords_threshold` are specified. The value for each key is an array of matches spotted in the audio for that keyword. Each match is described by a `KeywordResult` object. A keyword for which no matches are found is omitted from the dictionary. The dictionary is omitted entirely if no matches are found for any keywords. */
  var keywords_result: js.UndefOr[js.Object] = js.native
  
  /** An array of alternative hypotheses found for words of the input audio if a `word_alternatives_threshold` is specified. */
  var word_alternatives: js.UndefOr[js.Array[WordAlternativeResults]] = js.native
}
object SpeechRecognitionResult {
  
  @scala.inline
  def apply(alternatives: js.Array[SpeechRecognitionAlternative], final_results: Boolean): SpeechRecognitionResult = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], final_results = final_results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionResult]
  }
  
  @scala.inline
  implicit class SpeechRecognitionResultOps[Self <: SpeechRecognitionResult] (val x: Self) extends AnyVal {
    
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
    def setAlternativesVarargs(value: SpeechRecognitionAlternative*): Self = this.set("alternatives", js.Array(value :_*))
    
    @scala.inline
    def setAlternatives(value: js.Array[SpeechRecognitionAlternative]): Self = this.set("alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinal_results(value: Boolean): Self = this.set("final_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywords_result(value: js.Object): Self = this.set("keywords_result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords_result: Self = this.set("keywords_result", js.undefined)
    
    @scala.inline
    def setWord_alternativesVarargs(value: WordAlternativeResults*): Self = this.set("word_alternatives", js.Array(value :_*))
    
    @scala.inline
    def setWord_alternatives(value: js.Array[WordAlternativeResults]): Self = this.set("word_alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWord_alternatives: Self = this.set("word_alternatives", js.undefined)
  }
}
