package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a infrared frame arrived event. */
@JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameArrivedEventArgs")
@js.native
abstract class PerceptionInfraredFrameArrivedEventArgs () extends js.Object {
  /** Gets the relative time of this frame. */
  var relativeTime: Double = js.native
  /**
    * Attempts to open the infrared frame that has arrived.
    * @return If the attempt is successful, this method returns the newly-arrived infrared frame. If the attempt is unsuccessful, this value is unchanged.
    */
  def tryOpenFrame(): PerceptionInfraredFrame = js.native
}

