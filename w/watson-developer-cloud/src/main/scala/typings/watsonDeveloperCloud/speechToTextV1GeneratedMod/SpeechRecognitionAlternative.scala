package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SpeechRecognitionAlternative. */
trait SpeechRecognitionAlternative extends StObject {
  
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
  
  inline def apply(transcript: String): SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal(transcript = transcript.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionAlternative]
  }
  
  extension [Self <: SpeechRecognitionAlternative](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setTimestamps(value: js.Array[String]): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setTimestampsVarargs(value: String*): Self = StObject.set(x, "timestamps", js.Array(value*))
    
    inline def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    
    inline def setWord_confidence(value: js.Array[String]): Self = StObject.set(x, "word_confidence", value.asInstanceOf[js.Any])
    
    inline def setWord_confidenceUndefined: Self = StObject.set(x, "word_confidence", js.undefined)
    
    inline def setWord_confidenceVarargs(value: String*): Self = StObject.set(x, "word_confidence", js.Array(value*))
  }
}
