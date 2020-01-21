package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechContinuousRecognitionMode with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object pauseOnRecognition extends TopLevel[pauseOnRecognition with Double]
  
}

