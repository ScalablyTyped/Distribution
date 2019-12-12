package typings.winrtDashUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.capturing
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.idle
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.paused
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.processing
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.soundEnded
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.soundStarted
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.speechDetected
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechRecognizerState with Double] = js.native
  /* 1 */ @js.native
  object capturing extends TopLevel[capturing with Double]
  
  /* 0 */ @js.native
  object idle extends TopLevel[idle with Double]
  
  /* 6 */ @js.native
  object paused extends TopLevel[paused with Double]
  
  /* 2 */ @js.native
  object processing extends TopLevel[processing with Double]
  
  /* 4 */ @js.native
  object soundEnded extends TopLevel[soundEnded with Double]
  
  /* 3 */ @js.native
  object soundStarted extends TopLevel[soundStarted with Double]
  
  /* 5 */ @js.native
  object speechDetected extends TopLevel[speechDetected with Double]
  
}

