package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a Windows.Media.VideoFrame with the depth frame data. */
@JSGlobal("Windows.Devices.Perception.PerceptionDepthFrame")
@js.native
abstract class PerceptionDepthFrame ()
  extends typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrame {
  /** Gets a Windows.Media.VideoFrame with the depth frame data. */
  /* CompleteClass */
  override var videoFrame: VideoFrame = js.native
  /** Releases system resources that are exposed by a Windows Runtime object. */
  /* CompleteClass */
  override def close(): Unit = js.native
}

