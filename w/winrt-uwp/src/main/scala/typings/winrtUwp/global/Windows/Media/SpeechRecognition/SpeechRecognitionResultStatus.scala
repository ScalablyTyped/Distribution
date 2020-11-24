package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the possible result states of a speech recognition session or from the compiling of grammar constraints. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus")
@js.native
object SpeechRecognitionResultStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus with Double
  ] = js.native
  
  /* 4 */ val audioQualityFailure: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.audioQualityFailure with Double = js.native
  
  /* 3 */ val grammarCompilationFailure: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.grammarCompilationFailure with Double = js.native
  
  /* 2 */ val grammarLanguageMismatch: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.grammarLanguageMismatch with Double = js.native
  
  /* 10 */ val microphoneUnavailable: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.microphoneUnavailable with Double = js.native
  
  /* 9 */ val networkFailure: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.networkFailure with Double = js.native
  
  /* 8 */ val pauseLimitExceeded: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.pauseLimitExceeded with Double = js.native
  
  /* 0 */ val success: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.success with Double = js.native
  
  /* 7 */ val timeoutExceeded: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.timeoutExceeded with Double = js.native
  
  /* 1 */ val topicLanguageNotSupported: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.topicLanguageNotSupported with Double = js.native
  
  /* 6 */ val unknown: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.unknown with Double = js.native
  
  /* 5 */ val userCanceled: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.userCanceled with Double = js.native
}
