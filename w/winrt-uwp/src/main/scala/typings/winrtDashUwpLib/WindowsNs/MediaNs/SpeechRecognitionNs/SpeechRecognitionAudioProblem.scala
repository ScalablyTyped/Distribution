package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

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
  sealed trait noSignal
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionAudioProblem
  
  /** No audio problem. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionAudioProblem
  
  /** User spoke too fast. */
  @js.native
  sealed trait tooFast
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionAudioProblem
  
  /** Input volume too high. */
  @js.native
  sealed trait tooLoud
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionAudioProblem
  
  /** Too much background noise interfering with the speech recognition. */
  @js.native
  sealed trait tooNoisy
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionAudioProblem
  
  /** Input volume too quiet. */
  @js.native
  sealed trait tooQuiet
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionAudioProblem
  
  /** User spoke too slowly. */
  @js.native
  sealed trait tooSlow
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionAudioProblem
  
  /* 2 */ val noSignal: noSignal with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 5 */ val tooFast: tooFast with scala.Double = js.native
  /* 3 */ val tooLoud: tooLoud with scala.Double = js.native
  /* 1 */ val tooNoisy: tooNoisy with scala.Double = js.native
  /* 4 */ val tooQuiet: tooQuiet with scala.Double = js.native
  /* 6 */ val tooSlow: tooSlow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionAudioProblem with scala.Double
  ] = js.native
}

