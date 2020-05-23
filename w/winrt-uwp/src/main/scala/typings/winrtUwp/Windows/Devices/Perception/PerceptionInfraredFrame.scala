package typings.winrtUwp.Windows.Devices.Perception

import typings.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a Windows.Media.VideoFrame with the infrared frame data. */
trait PerceptionInfraredFrame extends js.Object {
  /** Gets a Windows.Media.VideoFrame with the infrared frame data. */
  var videoFrame: VideoFrame
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit
}

object PerceptionInfraredFrame {
  @scala.inline
  def apply(close: () => Unit, videoFrame: VideoFrame): PerceptionInfraredFrame = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), videoFrame = videoFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionInfraredFrame]
  }
}

