package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a Windows.Media.VideoFrame with the color frame data. */
@JSGlobal("Windows.Devices.Perception.PerceptionColorFrame")
@js.native
abstract class PerceptionColorFrame () extends js.Object {
  /** Gets a Windows.Media.VideoFrame with the color frame data. */
  var videoFrame: winrtDashUwpLib.WindowsNs.MediaNs.VideoFrame = js.native
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): scala.Unit = js.native
}

