package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpeechRecognitionAudioProblem extends js.Object

/** Specifies the type of audio problem detected. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem")
@js.native
object SpeechRecognitionAudioProblem extends js.Object {
  /** No audio. For example, the microphone may have been muted. */
  @js.native
  sealed trait noSignal extends SpeechRecognitionAudioProblem
  
  /** No audio problem. */
  @js.native
  sealed trait none extends SpeechRecognitionAudioProblem
  
  /** User spoke too fast. */
  @js.native
  sealed trait tooFast extends SpeechRecognitionAudioProblem
  
  /** Input volume too high. */
  @js.native
  sealed trait tooLoud extends SpeechRecognitionAudioProblem
  
  /** Too much background noise interfering with the speech recognition. */
  @js.native
  sealed trait tooNoisy extends SpeechRecognitionAudioProblem
  
  /** Input volume too quiet. */
  @js.native
  sealed trait tooQuiet extends SpeechRecognitionAudioProblem
  
  /** User spoke too slowly. */
  @js.native
  sealed trait tooSlow extends SpeechRecognitionAudioProblem
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechRecognitionAudioProblem with Double] = js.native
  /* 2 */ @js.native
  object noSignal extends TopLevel[noSignal with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 5 */ @js.native
  object tooFast extends TopLevel[tooFast with Double]
  
  /* 3 */ @js.native
  object tooLoud extends TopLevel[tooLoud with Double]
  
  /* 1 */ @js.native
  object tooNoisy extends TopLevel[tooNoisy with Double]
  
  /* 4 */ @js.native
  object tooQuiet extends TopLevel[tooQuiet with Double]
  
  /* 6 */ @js.native
  object tooSlow extends TopLevel[tooSlow with Double]
  
}

