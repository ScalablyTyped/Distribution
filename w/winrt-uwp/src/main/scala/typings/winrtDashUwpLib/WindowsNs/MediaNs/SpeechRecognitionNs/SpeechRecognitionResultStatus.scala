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
  
  /* 4 */ val audioQualityFailure: audioQualityFailure with scala.Double = js.native
  /* 3 */ val grammarCompilationFailure: grammarCompilationFailure with scala.Double = js.native
  /* 2 */ val grammarLanguageMismatch: grammarLanguageMismatch with scala.Double = js.native
  /* 10 */ val microphoneUnavailable: microphoneUnavailable with scala.Double = js.native
  /* 9 */ val networkFailure: networkFailure with scala.Double = js.native
  /* 8 */ val pauseLimitExceeded: pauseLimitExceeded with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 7 */ val timeoutExceeded: timeoutExceeded with scala.Double = js.native
  /* 1 */ val topicLanguageNotSupported: topicLanguageNotSupported with scala.Double = js.native
  /* 6 */ val unknown: unknown with scala.Double = js.native
  /* 5 */ val userCanceled: userCanceled with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus with scala.Double
  ] = js.native
}

