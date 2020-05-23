package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a depth frame arrived event. */
trait PerceptionDepthFrameArrivedEventArgs extends js.Object {
  /** Gets the relative time of this frame. */
  var relativeTime: Double
  /**
    * Attempts to open the depth frame that has arrived. Existing frames should be closed before opening new frames. If an app has three or more frames still open when this method is called, TryOpenFrame will fail.
    * @return If the attempt is successful, this method returns the newly-arrived depth frame. If the attempt is unsuccessful, this value is unchanged.
    */
  def tryOpenFrame(): PerceptionDepthFrame
}

object PerceptionDepthFrameArrivedEventArgs {
  @scala.inline
  def apply(relativeTime: Double, tryOpenFrame: () => PerceptionDepthFrame): PerceptionDepthFrameArrivedEventArgs = {
    val __obj = js.Dynamic.literal(relativeTime = relativeTime.asInstanceOf[js.Any], tryOpenFrame = js.Any.fromFunction0(tryOpenFrame))
    __obj.asInstanceOf[PerceptionDepthFrameArrivedEventArgs]
  }
}

