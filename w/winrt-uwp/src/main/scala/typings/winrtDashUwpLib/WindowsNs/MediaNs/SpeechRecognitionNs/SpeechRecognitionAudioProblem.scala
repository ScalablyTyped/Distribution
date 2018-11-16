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
  
  val noSignal: noSignal with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val tooFast: tooFast with java.lang.String = js.native
  val tooLoud: tooLoud with java.lang.String = js.native
  val tooNoisy: tooNoisy with java.lang.String = js.native
  val tooQuiet: tooQuiet with java.lang.String = js.native
  val tooSlow: tooSlow with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionAudioProblem with java.lang.String
  ] = js.native
}

