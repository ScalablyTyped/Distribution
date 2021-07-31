package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpeechRecognizerState extends StObject
/** Specifies the state of the speech recognizer. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizerState")
@js.native
object SpeechRecognizerState extends StObject {
  
  /** Indicates that the speech recognizer is capturing (listening for) audio input from the user. */
  @js.native
  sealed trait capturing
    extends StObject
       with SpeechRecognizerState
  
  /** Indicates that speech recognition is not active and the speech recognizer is not capturing (listening for) audio input. */
  @js.native
  sealed trait idle
    extends StObject
       with SpeechRecognizerState
  
  /** Only valid for continuous recognition. */
  @js.native
  sealed trait paused
    extends StObject
       with SpeechRecognizerState
  
  /** Indicates that the speech recognizer is processing (attempting to recognize) audio input from the user. The recognizer is no longer capturing (listening for) audio input from the user. */
  @js.native
  sealed trait processing
    extends StObject
       with SpeechRecognizerState
  
  /** Indicates that the speech recognizer no longer detects sound on the audio stream. */
  @js.native
  sealed trait soundEnded
    extends StObject
       with SpeechRecognizerState
  
  /** Indicates that the speech recognizer has detected sound on the audio stream. */
  @js.native
  sealed trait soundStarted
    extends StObject
       with SpeechRecognizerState
  
  /** Indicates that the speech recognizer has detected speech input on the audio stream. */
  @js.native
  sealed trait speechDetected
    extends StObject
       with SpeechRecognizerState
}
