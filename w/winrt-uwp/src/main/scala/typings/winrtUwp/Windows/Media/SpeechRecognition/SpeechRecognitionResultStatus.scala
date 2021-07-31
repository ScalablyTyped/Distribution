package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpeechRecognitionResultStatus extends StObject
/** Specifies the possible result states of a speech recognition session or from the compiling of grammar constraints. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus")
@js.native
object SpeechRecognitionResultStatus extends StObject {
  
  /** Audio problems caused recognition to fail. */
  @js.native
  sealed trait audioQualityFailure
    extends StObject
       with SpeechRecognitionResultStatus
  
  /** A grammar failed to compile. */
  @js.native
  sealed trait grammarCompilationFailure
    extends StObject
       with SpeechRecognitionResultStatus
  
  /** The language of the speech recognizer does not match the language of a grammar. */
  @js.native
  sealed trait grammarLanguageMismatch
    extends StObject
       with SpeechRecognitionResultStatus
  
  /** Lack of a microphone caused recognition to fail. */
  @js.native
  sealed trait microphoneUnavailable
    extends StObject
       with SpeechRecognitionResultStatus
  
  /** Network problems caused recognition to fail. */
  @js.native
  sealed trait networkFailure
    extends StObject
       with SpeechRecognitionResultStatus
  
  /** An extended pause, or excessive processing time, caused recognition to fail. */
  @js.native
  sealed trait pauseLimitExceeded
    extends StObject
       with SpeechRecognitionResultStatus
  
  /** The recognition session or compilation succeeded. */
  @js.native
  sealed trait success
    extends StObject
       with SpeechRecognitionResultStatus
  
  /** A timeout due to extended silence or poor audio caused recognition to fail. */
  @js.native
  sealed trait timeoutExceeded
    extends StObject
       with SpeechRecognitionResultStatus
  
  /** A topic constraint was set for an unsupported language. */
  @js.native
  sealed trait topicLanguageNotSupported
    extends StObject
       with SpeechRecognitionResultStatus
  
  /** An unknown problem caused recognition or compilation to fail. */
  @js.native
  sealed trait unknown
    extends StObject
       with SpeechRecognitionResultStatus
  
  /** User canceled recognition session. */
  @js.native
  sealed trait userCanceled
    extends StObject
       with SpeechRecognitionResultStatus
}
