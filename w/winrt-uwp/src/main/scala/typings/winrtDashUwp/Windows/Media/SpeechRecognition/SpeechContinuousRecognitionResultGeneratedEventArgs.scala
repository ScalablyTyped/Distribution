package typings.winrtDashUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the SpeechContinuousRecognitionSession.ResultGenerated event. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechContinuousRecognitionResultGeneratedEventArgs")
@js.native
abstract class SpeechContinuousRecognitionResultGeneratedEventArgs () extends js.Object {
  /** Gets the complete recognition result returned by the speech recognizer at the end of a dictation session ( SpeechRecognitionResultStatus is set to Success). */
  var result: SpeechRecognitionResult = js.native
}

