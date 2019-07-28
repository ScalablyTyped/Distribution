package typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs

import typings.winrtDashUwp.WindowsNs.MediaNs.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a Windows.Media.VideoFrame with the depth frame data. */
@JSGlobal("Windows.Devices.Perception.PerceptionDepthFrame")
@js.native
abstract class PerceptionDepthFrame () extends js.Object {
  /** Gets a Windows.Media.VideoFrame with the depth frame data. */
  var videoFrame: VideoFrame = js.native
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit = js.native
}

