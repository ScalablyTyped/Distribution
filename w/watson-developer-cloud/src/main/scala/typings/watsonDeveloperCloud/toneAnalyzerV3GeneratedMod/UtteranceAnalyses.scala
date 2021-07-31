package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** UtteranceAnalyses. */
trait UtteranceAnalyses extends StObject {
  
  /** An array of `UtteranceAnalysis` objects that provides the results for each utterance of the input. */
  var utterances_tone: js.Array[UtteranceAnalysis]
  
  /** **`2017-09-21`:** A warning message if the content contains more than 50 utterances. The service analyzes only the first 50 utterances. **`2016-05-19`:** Not returned. */
  var warning: js.UndefOr[String] = js.undefined
}
object UtteranceAnalyses {
  
  @scala.inline
  def apply(utterances_tone: js.Array[UtteranceAnalysis]): UtteranceAnalyses = {
    val __obj = js.Dynamic.literal(utterances_tone = utterances_tone.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtteranceAnalyses]
  }
  
  @scala.inline
  implicit class UtteranceAnalysesMutableBuilder[Self <: UtteranceAnalyses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUtterances_tone(value: js.Array[UtteranceAnalysis]): Self = StObject.set(x, "utterances_tone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtterances_toneVarargs(value: UtteranceAnalysis*): Self = StObject.set(x, "utterances_tone", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
