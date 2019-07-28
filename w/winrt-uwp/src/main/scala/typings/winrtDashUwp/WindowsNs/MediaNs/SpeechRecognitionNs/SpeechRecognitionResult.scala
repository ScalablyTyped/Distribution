package typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The result of a speech recognition session. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionResult")
@js.native
abstract class SpeechRecognitionResult () extends js.Object {
  /** Gets a value that indicates the confidence of the speech recognizer in the recognition result. */
  var confidence: SpeechRecognitionConfidence = js.native
  /** Gets the constraint that was triggered to return the recognized phrase. */
  var constraint: ISpeechRecognitionConstraint = js.native
  /** Gets the amount of time required for the utterance. */
  var phraseDuration: Double = js.native
  /** Gets the start time of the utterance. */
  var phraseStartTime: Date = js.native
  /** Gets a value that indicates the relative confidence of the SpeechRecognitionResult when compared with a collection of alternatives returned with the recognition result. */
  var rawConfidence: Double = js.native
  /** Gets the hierarchy of rule elements that were triggered to return the recognized phrase. */
  var rulePath: IVectorView[String] = js.native
  /** Gets an interpretation object containing the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
  var semanticInterpretation: SpeechRecognitionSemanticInterpretation = js.native
  /** Gets the result state ( SpeechRecognitionResultStatus ) of a speech recognition session. */
  var status: SpeechRecognitionResultStatus = js.native
  /** Gets the recognized phrase of the speech recognition session. */
  var text: String = js.native
  /**
    * Gets a collection of recognition result alternatives, ordered by RawConfidence from most likely to least likely. The first item in the collection is the recognition result indicated by the parent object.
    * @param maxAlternates The maximum number of speech recognition results to return in the collection.
    * @return A collection of speech recognition results, ordered by confidence from most likely to least likely.
    */
  def getAlternates(maxAlternates: Double): IVectorView[SpeechRecognitionResult] = js.native
}

