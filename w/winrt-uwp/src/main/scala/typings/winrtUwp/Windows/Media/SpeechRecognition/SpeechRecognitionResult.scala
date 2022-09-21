package typings.winrtUwp.Windows.Media.SpeechRecognition

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The result of a speech recognition session. */
trait SpeechRecognitionResult extends StObject {
  
  /** Gets a value that indicates the confidence of the speech recognizer in the recognition result. */
  var confidence: SpeechRecognitionConfidence
  
  /** Gets the constraint that was triggered to return the recognized phrase. */
  var constraint: ISpeechRecognitionConstraint
  
  /**
    * Gets a collection of recognition result alternatives, ordered by RawConfidence from most likely to least likely. The first item in the collection is the recognition result indicated by the parent object.
    * @param maxAlternates The maximum number of speech recognition results to return in the collection.
    * @return A collection of speech recognition results, ordered by confidence from most likely to least likely.
    */
  def getAlternates(maxAlternates: Double): IVectorView[SpeechRecognitionResult]
  
  /** Gets the amount of time required for the utterance. */
  var phraseDuration: Double
  
  /** Gets the start time of the utterance. */
  var phraseStartTime: js.Date
  
  /** Gets a value that indicates the relative confidence of the SpeechRecognitionResult when compared with a collection of alternatives returned with the recognition result. */
  var rawConfidence: Double
  
  /** Gets the hierarchy of rule elements that were triggered to return the recognized phrase. */
  var rulePath: IVectorView[String]
  
  /** Gets an interpretation object containing the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
  var semanticInterpretation: SpeechRecognitionSemanticInterpretation
  
  /** Gets the result state ( SpeechRecognitionResultStatus ) of a speech recognition session. */
  var status: SpeechRecognitionResultStatus
  
  /** Gets the recognized phrase of the speech recognition session. */
  var text: String
}
object SpeechRecognitionResult {
  
  inline def apply(
    confidence: SpeechRecognitionConfidence,
    constraint: ISpeechRecognitionConstraint,
    getAlternates: Double => IVectorView[SpeechRecognitionResult],
    phraseDuration: Double,
    phraseStartTime: js.Date,
    rawConfidence: Double,
    rulePath: IVectorView[String],
    semanticInterpretation: SpeechRecognitionSemanticInterpretation,
    status: SpeechRecognitionResultStatus,
    text: String
  ): SpeechRecognitionResult = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], constraint = constraint.asInstanceOf[js.Any], getAlternates = js.Any.fromFunction1(getAlternates), phraseDuration = phraseDuration.asInstanceOf[js.Any], phraseStartTime = phraseStartTime.asInstanceOf[js.Any], rawConfidence = rawConfidence.asInstanceOf[js.Any], rulePath = rulePath.asInstanceOf[js.Any], semanticInterpretation = semanticInterpretation.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionResult]
  }
  
  extension [Self <: SpeechRecognitionResult](x: Self) {
    
    inline def setConfidence(value: SpeechRecognitionConfidence): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConstraint(value: ISpeechRecognitionConstraint): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setGetAlternates(value: Double => IVectorView[SpeechRecognitionResult]): Self = StObject.set(x, "getAlternates", js.Any.fromFunction1(value))
    
    inline def setPhraseDuration(value: Double): Self = StObject.set(x, "phraseDuration", value.asInstanceOf[js.Any])
    
    inline def setPhraseStartTime(value: js.Date): Self = StObject.set(x, "phraseStartTime", value.asInstanceOf[js.Any])
    
    inline def setRawConfidence(value: Double): Self = StObject.set(x, "rawConfidence", value.asInstanceOf[js.Any])
    
    inline def setRulePath(value: IVectorView[String]): Self = StObject.set(x, "rulePath", value.asInstanceOf[js.Any])
    
    inline def setSemanticInterpretation(value: SpeechRecognitionSemanticInterpretation): Self = StObject.set(x, "semanticInterpretation", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: SpeechRecognitionResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
