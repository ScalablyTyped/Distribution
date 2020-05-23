package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Media.SpeechRecognition.ISpeechRecognitionConstraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The result of a speech recognition session. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionResult")
@js.native
abstract class SpeechRecognitionResult ()
  extends typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult {
  /** Gets a value that indicates the confidence of the speech recognizer in the recognition result. */
  /* CompleteClass */
  override var confidence: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence = js.native
  /** Gets the constraint that was triggered to return the recognized phrase. */
  /* CompleteClass */
  override var constraint: ISpeechRecognitionConstraint = js.native
  /** Gets the amount of time required for the utterance. */
  /* CompleteClass */
  override var phraseDuration: Double = js.native
  /** Gets the start time of the utterance. */
  /* CompleteClass */
  override var phraseStartTime: Date = js.native
  /** Gets a value that indicates the relative confidence of the SpeechRecognitionResult when compared with a collection of alternatives returned with the recognition result. */
  /* CompleteClass */
  override var rawConfidence: Double = js.native
  /** Gets the hierarchy of rule elements that were triggered to return the recognized phrase. */
  /* CompleteClass */
  override var rulePath: IVectorView[String] = js.native
  /** Gets an interpretation object containing the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
  /* CompleteClass */
  override var semanticInterpretation: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionSemanticInterpretation = js.native
  /** Gets the result state ( SpeechRecognitionResultStatus ) of a speech recognition session. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus = js.native
  /** Gets the recognized phrase of the speech recognition session. */
  /* CompleteClass */
  override var text: String = js.native
  /**
    * Gets a collection of recognition result alternatives, ordered by RawConfidence from most likely to least likely. The first item in the collection is the recognition result indicated by the parent object.
    * @param maxAlternates The maximum number of speech recognition results to return in the collection.
    * @return A collection of speech recognition results, ordered by confidence from most likely to least likely.
    */
  /* CompleteClass */
  override def getAlternates(maxAlternates: Double): IVectorView[typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult] = js.native
}

