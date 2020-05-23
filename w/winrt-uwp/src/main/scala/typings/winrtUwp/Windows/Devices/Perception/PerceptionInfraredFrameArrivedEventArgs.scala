package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a infrared frame arrived event. */
trait PerceptionInfraredFrameArrivedEventArgs extends js.Object {
  /** Gets the relative time of this frame. */
  var relativeTime: Double
  /**
    * Attempts to open the infrared frame that has arrived.
    * @return If the attempt is successful, this method returns the newly-arrived infrared frame. If the attempt is unsuccessful, this value is unchanged.
    */
  def tryOpenFrame(): PerceptionInfraredFrame
}

object PerceptionInfraredFrameArrivedEventArgs {
  @scala.inline
  def apply(relativeTime: Double, tryOpenFrame: () => PerceptionInfraredFrame): PerceptionInfraredFrameArrivedEventArgs = {
    val __obj = js.Dynamic.literal(relativeTime = relativeTime.asInstanceOf[js.Any], tryOpenFrame = js.Any.fromFunction0(tryOpenFrame))
    __obj.asInstanceOf[PerceptionInfraredFrameArrivedEventArgs]
  }
}

