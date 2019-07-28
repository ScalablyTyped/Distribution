package typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpeechContinuousRecognitionMode extends js.Object

/** Specifies the behavior of the speech recognizer during a continuous recognition session. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechContinuousRecognitionMode")
@js.native
object SpeechContinuousRecognitionMode extends js.Object {
  /** Speech recognizer continues listening for and processing speech input after a recognition result is generated. */
  @js.native
  sealed trait default extends SpeechContinuousRecognitionMode
  
  /** Speech recognizer pauses and suspends further processing of speech input when a recognition result is generated. */
  @js.native
  sealed trait pauseOnRecognition extends SpeechContinuousRecognitionMode
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechContinuousRecognitionMode.default with Double = js.native
  /* 1 */ val pauseOnRecognition: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechContinuousRecognitionMode.pauseOnRecognition with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechContinuousRecognitionMode with Double] = js.native
}

