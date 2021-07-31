package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpeechRecognitionAudioProblem extends StObject
/** Specifies the type of audio problem detected. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem")
@js.native
object SpeechRecognitionAudioProblem extends StObject {
  
  /** No audio. For example, the microphone may have been muted. */
  @js.native
  sealed trait noSignal
    extends StObject
       with SpeechRecognitionAudioProblem
  
  /** No audio problem. */
  @js.native
  sealed trait none
    extends StObject
       with SpeechRecognitionAudioProblem
  
  /** User spoke too fast. */
  @js.native
  sealed trait tooFast
    extends StObject
       with SpeechRecognitionAudioProblem
  
  /** Input volume too high. */
  @js.native
  sealed trait tooLoud
    extends StObject
       with SpeechRecognitionAudioProblem
  
  /** Too much background noise interfering with the speech recognition. */
  @js.native
  sealed trait tooNoisy
    extends StObject
       with SpeechRecognitionAudioProblem
  
  /** Input volume too quiet. */
  @js.native
  sealed trait tooQuiet
    extends StObject
       with SpeechRecognitionAudioProblem
  
  /** User spoke too slowly. */
  @js.native
  sealed trait tooSlow
    extends StObject
       with SpeechRecognitionAudioProblem
}
