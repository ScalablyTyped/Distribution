package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a Windows.Media.VideoFrame with the color frame data. */
@JSGlobal("Windows.Devices.Perception.PerceptionColorFrame")
@js.native
abstract class PerceptionColorFrame ()
  extends typings.winrtUwp.Windows.Devices.Perception.PerceptionColorFrame {
  /** Gets a Windows.Media.VideoFrame with the color frame data. */
  /* CompleteClass */
  override var videoFrame: VideoFrame = js.native
  /** Releases system resources that are exposed by a Windows Runtime object. */
  /* CompleteClass */
  override def close(): Unit = js.native
}

