package typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs

import typings.winrtDashUwp.WindowsNs.MediaNs.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a Windows.Media.VideoFrame with the color frame data. */
@JSGlobal("Windows.Devices.Perception.PerceptionColorFrame")
@js.native
abstract class PerceptionColorFrame () extends js.Object {
  /** Gets a Windows.Media.VideoFrame with the color frame data. */
  var videoFrame: VideoFrame = js.native
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit = js.native
}

