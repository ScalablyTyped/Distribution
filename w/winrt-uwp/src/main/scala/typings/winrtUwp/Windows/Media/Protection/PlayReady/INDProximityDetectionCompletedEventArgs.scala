package typings.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides arguments for the PlayReady-ND ProximityDetectionCompleted event. Apps fire this event after they complete the proximity detection process. */
@js.native
trait INDProximityDetectionCompletedEventArgs extends js.Object {
  /** Gets the number of retries that occurred during a proximity detection operation. */
  var proximityDetectionRetryCount: Double = js.native
}

object INDProximityDetectionCompletedEventArgs {
  @scala.inline
  def apply(proximityDetectionRetryCount: Double): INDProximityDetectionCompletedEventArgs = {
    val __obj = js.Dynamic.literal(proximityDetectionRetryCount = proximityDetectionRetryCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDProximityDetectionCompletedEventArgs]
  }
  @scala.inline
  implicit class INDProximityDetectionCompletedEventArgsOps[Self <: INDProximityDetectionCompletedEventArgs] (val x: Self) extends AnyVal {
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
    def setProximityDetectionRetryCount(value: Double): Self = this.set("proximityDetectionRetryCount", value.asInstanceOf[js.Any])
  }
  
}

