package typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs

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
  sealed trait audioQualityFailure extends SpeechRecognitionResultStatus
  
  /** A grammar failed to compile. */
  @js.native
  sealed trait grammarCompilationFailure extends SpeechRecognitionResultStatus
  
  /** The language of the speech recognizer does not match the language of a grammar. */
  @js.native
  sealed trait grammarLanguageMismatch extends SpeechRecognitionResultStatus
  
  /** Lack of a microphone caused recognition to fail. */
  @js.native
  sealed trait microphoneUnavailable extends SpeechRecognitionResultStatus
  
  /** Network problems caused recognition to fail. */
  @js.native
  sealed trait networkFailure extends SpeechRecognitionResultStatus
  
  /** An extended pause, or excessive processing time, caused recognition to fail. */
  @js.native
  sealed trait pauseLimitExceeded extends SpeechRecognitionResultStatus
  
  /** The recognition session or compilation succeeded. */
  @js.native
  sealed trait success extends SpeechRecognitionResultStatus
  
  /** A timeout due to extended silence or poor audio caused recognition to fail. */
  @js.native
  sealed trait timeoutExceeded extends SpeechRecognitionResultStatus
  
  /** A topic constraint was set for an unsupported language. */
  @js.native
  sealed trait topicLanguageNotSupported extends SpeechRecognitionResultStatus
  
  /** An unknown problem caused recognition or compilation to fail. */
  @js.native
  sealed trait unknown extends SpeechRecognitionResultStatus
  
  /** User canceled recognition session. */
  @js.native
  sealed trait userCanceled extends SpeechRecognitionResultStatus
  
  /* 4 */ val audioQualityFailure: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus.audioQualityFailure with Double = js.native
  /* 3 */ val grammarCompilationFailure: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus.grammarCompilationFailure with Double = js.native
  /* 2 */ val grammarLanguageMismatch: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus.grammarLanguageMismatch with Double = js.native
  /* 10 */ val microphoneUnavailable: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus.microphoneUnavailable with Double = js.native
  /* 9 */ val networkFailure: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus.networkFailure with Double = js.native
  /* 8 */ val pauseLimitExceeded: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus.pauseLimitExceeded with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus.success with Double = js.native
  /* 7 */ val timeoutExceeded: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus.timeoutExceeded with Double = js.native
  /* 1 */ val topicLanguageNotSupported: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus.topicLanguageNotSupported with Double = js.native
  /* 6 */ val unknown: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus.unknown with Double = js.native
  /* 5 */ val userCanceled: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResultStatus.userCanceled with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechRecognitionResultStatus with Double] = js.native
}

