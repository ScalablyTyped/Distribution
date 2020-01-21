package typings.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides arguments for the PlayReady-ND ProximityDetectionCompleted event. Apps fire this event after they complete the proximity detection process. */
trait INDProximityDetectionCompletedEventArgs extends js.Object {
  /** Gets the number of retries that occurred during a proximity detection operation. */
  var proximityDetectionRetryCount: Double
}

object INDProximityDetectionCompletedEventArgs {
  @scala.inline
  def apply(proximityDetectionRetryCount: Double): INDProximityDetectionCompletedEventArgs = {
    val __obj = js.Dynamic.literal(proximityDetectionRetryCount = proximityDetectionRetryCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INDProximityDetectionCompletedEventArgs]
  }
}

