package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SpeechRecognitionQualityDegradingEvent event. */
@js.native
trait SpeechRecognitionQualityDegradingEventArgs extends js.Object {
  /** Gets the audio problem that occurred. */
  var problem: SpeechRecognitionAudioProblem = js.native
}

object SpeechRecognitionQualityDegradingEventArgs {
  @scala.inline
  def apply(problem: SpeechRecognitionAudioProblem): SpeechRecognitionQualityDegradingEventArgs = {
    val __obj = js.Dynamic.literal(problem = problem.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionQualityDegradingEventArgs]
  }
  @scala.inline
  implicit class SpeechRecognitionQualityDegradingEventArgsOps[Self <: SpeechRecognitionQualityDegradingEventArgs] (val x: Self) extends AnyVal {
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
    def setProblem(value: SpeechRecognitionAudioProblem): Self = this.set("problem", value.asInstanceOf[js.Any])
  }
  
}

