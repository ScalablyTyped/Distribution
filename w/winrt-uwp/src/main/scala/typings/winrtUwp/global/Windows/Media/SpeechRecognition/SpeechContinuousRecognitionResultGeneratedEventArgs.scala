package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the SpeechContinuousRecognitionSession.ResultGenerated event. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechContinuousRecognitionResultGeneratedEventArgs")
@js.native
abstract class SpeechContinuousRecognitionResultGeneratedEventArgs ()
  extends typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionResultGeneratedEventArgs {
  /** Gets the complete recognition result returned by the speech recognizer at the end of a dictation session ( SpeechRecognitionResultStatus is set to Success). */
  /* CompleteClass */
  override var result: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult = js.native
}

