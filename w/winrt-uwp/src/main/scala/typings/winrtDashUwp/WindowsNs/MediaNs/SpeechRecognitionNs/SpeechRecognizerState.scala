package typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs

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
  sealed trait capturing extends SpeechRecognizerState
  
  /** Indicates that speech recognition is not active and the speech recognizer is not capturing (listening for) audio input. */
  @js.native
  sealed trait idle extends SpeechRecognizerState
  
  /** Only valid for continuous recognition. */
  @js.native
  sealed trait paused extends SpeechRecognizerState
  
  /** Indicates that the speech recognizer is processing (attempting to recognize) audio input from the user. The recognizer is no longer capturing (listening for) audio input from the user. */
  @js.native
  sealed trait processing extends SpeechRecognizerState
  
  /** Indicates that the speech recognizer no longer detects sound on the audio stream. */
  @js.native
  sealed trait soundEnded extends SpeechRecognizerState
  
  /** Indicates that the speech recognizer has detected sound on the audio stream. */
  @js.native
  sealed trait soundStarted extends SpeechRecognizerState
  
  /** Indicates that the speech recognizer has detected speech input on the audio stream. */
  @js.native
  sealed trait speechDetected extends SpeechRecognizerState
  
  /* 1 */ val capturing: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState.capturing with Double = js.native
  /* 0 */ val idle: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState.idle with Double = js.native
  /* 6 */ val paused: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState.paused with Double = js.native
  /* 2 */ val processing: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState.processing with Double = js.native
  /* 4 */ val soundEnded: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState.soundEnded with Double = js.native
  /* 3 */ val soundStarted: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState.soundStarted with Double = js.native
  /* 5 */ val speechDetected: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognizerState.speechDetected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechRecognizerState with Double] = js.native
}

