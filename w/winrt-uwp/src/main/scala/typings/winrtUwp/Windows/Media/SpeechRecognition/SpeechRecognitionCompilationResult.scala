package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The result of compiling the constraints set for a SpeechRecognizer object. */
trait SpeechRecognitionCompilationResult extends js.Object {
  /** Gets the result state ( SpeechRecognitionResultStatus ) from the compiling of grammar constraints. */
  var status: SpeechRecognitionResultStatus
}

object SpeechRecognitionCompilationResult {
  @scala.inline
  def apply(status: SpeechRecognitionResultStatus): SpeechRecognitionCompilationResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionCompilationResult]
  }
}

