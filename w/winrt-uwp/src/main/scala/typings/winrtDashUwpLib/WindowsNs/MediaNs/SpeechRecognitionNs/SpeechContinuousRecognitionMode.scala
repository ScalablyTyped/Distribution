package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

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
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechContinuousRecognitionMode
  
  /** Speech recognizer pauses and suspends further processing of speech input when a recognition result is generated. */
  @js.native
  sealed trait pauseOnRecognition
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechContinuousRecognitionMode
  
  val default: default with java.lang.String = js.native
  val pauseOnRecognition: pauseOnRecognition with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechContinuousRecognitionMode with java.lang.String
  ] = js.native
}

