package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The result of compiling the constraints set for a SpeechRecognizer object. */
@js.native
trait SpeechRecognitionCompilationResult extends js.Object {
  /** Gets the result state ( SpeechRecognitionResultStatus ) from the compiling of grammar constraints. */
  var status: SpeechRecognitionResultStatus = js.native
}

object SpeechRecognitionCompilationResult {
  @scala.inline
  def apply(status: SpeechRecognitionResultStatus): SpeechRecognitionCompilationResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionCompilationResult]
  }
  @scala.inline
  implicit class SpeechRecognitionCompilationResultOps[Self <: SpeechRecognitionCompilationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatus(value: SpeechRecognitionResultStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

