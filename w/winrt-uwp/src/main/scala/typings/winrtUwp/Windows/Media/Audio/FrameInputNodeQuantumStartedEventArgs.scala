package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AudioFrameInputNode::QuantumStarted event. This event is raised when the audio graph containing the audio frame input node is ready to begin processing a new quantum of data. */
@js.native
trait FrameInputNodeQuantumStartedEventArgs extends js.Object {
  /** Gets the number of samples that the audio graph requires to fill the quantum with data. */
  var requiredSamples: Double = js.native
}

object FrameInputNodeQuantumStartedEventArgs {
  @scala.inline
  def apply(requiredSamples: Double): FrameInputNodeQuantumStartedEventArgs = {
    val __obj = js.Dynamic.literal(requiredSamples = requiredSamples.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameInputNodeQuantumStartedEventArgs]
  }
  @scala.inline
  implicit class FrameInputNodeQuantumStartedEventArgsOps[Self <: FrameInputNodeQuantumStartedEventArgs] (val x: Self) extends AnyVal {
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
    def setRequiredSamples(value: Double): Self = this.set("requiredSamples", value.asInstanceOf[js.Any])
  }
  
}

