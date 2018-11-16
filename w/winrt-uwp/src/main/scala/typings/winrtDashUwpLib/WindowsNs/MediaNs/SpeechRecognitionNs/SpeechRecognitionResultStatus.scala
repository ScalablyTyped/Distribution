package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpeechRecognitionResultStatus extends js.Object

/** Specifies the possible result states of a speech recognition session or from the compiling of grammar constraints. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus")
@js.native
object SpeechRecognitionResultStatus extends js.Object {
  /** Audio problems caused recognition to fail. */
  @js.native
  sealed trait audioQualityFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus
  
  /** A grammar failed to compile. */
  @js.native
  sealed trait grammarCompilationFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus
  
  /** The language of the speech recognizer does not match the language of a grammar. */
  @js.native
  sealed trait grammarLanguageMismatch
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus
  
  /** Lack of a microphone caused recognition to fail. */
  @js.native
  sealed trait microphoneUnavailable
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus
  
  /** Network problems caused recognition to fail. */
  @js.native
  sealed trait networkFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus
  
  /** An extended pause, or excessive processing time, caused recognition to fail. */
  @js.native
  sealed trait pauseLimitExceeded
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus
  
  /** The recognition session or compilation succeeded. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus
  
  /** A timeout due to extended silence or poor audio caused recognition to fail. */
  @js.native
  sealed trait timeoutExceeded
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus
  
  /** A topic constraint was set for an unsupported language. */
  @js.native
  sealed trait topicLanguageNotSupported
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus
  
  /** An unknown problem caused recognition or compilation to fail. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus
  
  /** User canceled recognition session. */
  @js.native
  sealed trait userCanceled
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus
  
  val audioQualityFailure: audioQualityFailure with java.lang.String = js.native
  val grammarCompilationFailure: grammarCompilationFailure with java.lang.String = js.native
  val grammarLanguageMismatch: grammarLanguageMismatch with java.lang.String = js.native
  val microphoneUnavailable: microphoneUnavailable with java.lang.String = js.native
  val networkFailure: networkFailure with java.lang.String = js.native
  val pauseLimitExceeded: pauseLimitExceeded with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val timeoutExceeded: timeoutExceeded with java.lang.String = js.native
  val topicLanguageNotSupported: topicLanguageNotSupported with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val userCanceled: userCanceled with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus with java.lang.String
  ] = js.native
}

