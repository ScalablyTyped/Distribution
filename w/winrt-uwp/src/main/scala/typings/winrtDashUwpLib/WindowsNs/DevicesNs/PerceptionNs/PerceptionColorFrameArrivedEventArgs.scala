package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a color frame arrived event. */
@JSGlobal("Windows.Devices.Perception.PerceptionColorFrameArrivedEventArgs")
@js.native
abstract class PerceptionColorFrameArrivedEventArgs () extends js.Object {
  /** Gets the relative time of this frame. */
  var relativeTime: scala.Double = js.native
  /**
    * Attempts to open the color frame that has arrived.
    * @return If the attempt is successful, this method returns the newly-arrived color frame. If the attempt is unsuccessful, this value is unchanged.
    */
  def tryOpenFrame(): PerceptionColorFrame = js.native
}

