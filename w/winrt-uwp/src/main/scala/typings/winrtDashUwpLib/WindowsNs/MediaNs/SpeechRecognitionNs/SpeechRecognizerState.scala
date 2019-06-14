package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpeechRecognizerState extends js.Object

/** Specifies the state of the speech recognizer. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizerState")
@js.native
object SpeechRecognizerState extends js.Object {
  /** Indicates that the speech recognizer is capturing (listening for) audio input from the user. */
  @js.native
  sealed trait capturing
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState
  
  /** Indicates that speech recognition is not active and the speech recognizer is not capturing (listening for) audio input. */
  @js.native
  sealed trait idle
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState
  
  /** Only valid for continuous recognition. */
  @js.native
  sealed trait paused
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState
  
  /** Indicates that the speech recognizer is processing (attempting to recognize) audio input from the user. The recognizer is no longer capturing (listening for) audio input from the user. */
  @js.native
  sealed trait processing
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState
  
  /** Indicates that the speech recognizer no longer detects sound on the audio stream. */
  @js.native
  sealed trait soundEnded
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState
  
  /** Indicates that the speech recognizer has detected sound on the audio stream. */
  @js.native
  sealed trait soundStarted
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState
  
  /** Indicates that the speech recognizer has detected speech input on the audio stream. */
  @js.native
  sealed trait speechDetected
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState
  
  /* 1 */ val capturing: capturing with scala.Double = js.native
  /* 0 */ val idle: idle with scala.Double = js.native
  /* 6 */ val paused: paused with scala.Double = js.native
  /* 2 */ val processing: processing with scala.Double = js.native
  /* 4 */ val soundEnded: soundEnded with scala.Double = js.native
  /* 3 */ val soundStarted: soundStarted with scala.Double = js.native
  /* 5 */ val speechDetected: speechDetected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState with scala.Double
  ] = js.native
}

