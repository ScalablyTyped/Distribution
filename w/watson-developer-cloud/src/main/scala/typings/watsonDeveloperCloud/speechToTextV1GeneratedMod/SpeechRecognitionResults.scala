package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SpeechRecognitionResults. */
trait SpeechRecognitionResults extends StObject {
  
  /** An index that indicates a change point in the `results` array. The service increments the index only for additional results that it sends for new audio for the same request. */
  var result_index: js.UndefOr[Double] = js.undefined
  
  /** An array of `SpeechRecognitionResult` objects that can include interim and final results (interim results are returned only if supported by the method). Final results are guaranteed not to change; interim results might be replaced by further interim results and final results. The service periodically sends updates to the results list; the `result_index` is set to the lowest index in the array that has changed; it is incremented for new results. */
  var results: js.UndefOr[js.Array[SpeechRecognitionResult]] = js.undefined
  
  /** An array of `SpeakerLabelsResult` objects that identifies which words were spoken by which speakers in a multi-person exchange. The array is returned only if the `speaker_labels` parameter is `true`. When interim results are also requested for methods that support them, it is possible for a `SpeechRecognitionResults` object to include only the `speaker_labels` field. */
  var speaker_labels: js.UndefOr[js.Array[SpeakerLabelsResult]] = js.undefined
  
  /** An array of warning messages associated with the request: * Warnings for invalid parameters or fields can include a descriptive message and a list of invalid argument strings, for example, `"Unknown arguments:"` or `"Unknown url query arguments:"` followed by a list of the form `"{invalid_arg_1}, {invalid_arg_2}."` * The following warning is returned if the request passes a custom model that is based on an older version of a base model for which an updated version is available: `"Using previous version of base model, because your custom model has been built with it. Please note that this version will be supported only for a limited time. Consider updating your custom model to the new base model. If you do not do that you will be automatically switched to base model when you used the non-updated custom model."` In both cases, the request succeeds despite the warnings. */
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object SpeechRecognitionResults {
  
  inline def apply(): SpeechRecognitionResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeechRecognitionResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpeechRecognitionResults] (val x: Self) extends AnyVal {
    
    inline def setResult_index(value: Double): Self = StObject.set(x, "result_index", value.asInstanceOf[js.Any])
    
    inline def setResult_indexUndefined: Self = StObject.set(x, "result_index", js.undefined)
    
    inline def setResults(value: js.Array[SpeechRecognitionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SpeechRecognitionResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setSpeaker_labels(value: js.Array[SpeakerLabelsResult]): Self = StObject.set(x, "speaker_labels", value.asInstanceOf[js.Any])
    
    inline def setSpeaker_labelsUndefined: Self = StObject.set(x, "speaker_labels", js.undefined)
    
    inline def setSpeaker_labelsVarargs(value: SpeakerLabelsResult*): Self = StObject.set(x, "speaker_labels", js.Array(value*))
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
