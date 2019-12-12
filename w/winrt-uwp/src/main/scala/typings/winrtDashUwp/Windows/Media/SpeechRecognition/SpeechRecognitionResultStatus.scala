package typings.winrtDashUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.audioQualityFailure
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.grammarCompilationFailure
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.grammarLanguageMismatch
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.microphoneUnavailable
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.networkFailure
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.pauseLimitExceeded
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.success
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.timeoutExceeded
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.topicLanguageNotSupported
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.unknown
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.userCanceled
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechRecognitionResultStatus with Double] = js.native
  /* 4 */ @js.native
  object audioQualityFailure extends TopLevel[audioQualityFailure with Double]
  
  /* 3 */ @js.native
  object grammarCompilationFailure extends TopLevel[grammarCompilationFailure with Double]
  
  /* 2 */ @js.native
  object grammarLanguageMismatch extends TopLevel[grammarLanguageMismatch with Double]
  
  /* 10 */ @js.native
  object microphoneUnavailable extends TopLevel[microphoneUnavailable with Double]
  
  /* 9 */ @js.native
  object networkFailure extends TopLevel[networkFailure with Double]
  
  /* 8 */ @js.native
  object pauseLimitExceeded extends TopLevel[pauseLimitExceeded with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 7 */ @js.native
  object timeoutExceeded extends TopLevel[timeoutExceeded with Double]
  
  /* 1 */ @js.native
  object topicLanguageNotSupported extends TopLevel[topicLanguageNotSupported with Double]
  
  /* 6 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 5 */ @js.native
  object userCanceled extends TopLevel[userCanceled with Double]
  
}

