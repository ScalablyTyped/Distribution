package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** WordAlternativeResults. */
@js.native
trait WordAlternativeResults extends js.Object {
  
  /** An array of alternative hypotheses for a word from the input audio. */
  var alternatives: js.Array[WordAlternativeResult] = js.native
  
  /** The end time in seconds of the word from the input audio that corresponds to the word alternatives. */
  var end_time: Double = js.native
  
  /** The start time in seconds of the word from the input audio that corresponds to the word alternatives. */
  var start_time: Double = js.native
}
object WordAlternativeResults {
  
  @scala.inline
  def apply(alternatives: js.Array[WordAlternativeResult], end_time: Double, start_time: Double): WordAlternativeResults = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordAlternativeResults]
  }
  
  @scala.inline
  implicit class WordAlternativeResultsOps[Self <: WordAlternativeResults] (val x: Self) extends AnyVal {
    
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
    def setAlternativesVarargs(value: WordAlternativeResult*): Self = this.set("alternatives", js.Array(value :_*))
    
    @scala.inline
    def setAlternatives(value: js.Array[WordAlternativeResult]): Self = this.set("alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_time(value: Double): Self = this.set("end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time(value: Double): Self = this.set("start_time", value.asInstanceOf[js.Any])
  }
}
