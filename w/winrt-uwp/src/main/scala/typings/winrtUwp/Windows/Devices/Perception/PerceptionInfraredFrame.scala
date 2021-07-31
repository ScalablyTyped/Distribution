package typings.winrtUwp.Windows.Devices.Perception

import typings.winrtUwp.Windows.Media.VideoFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a Windows.Media.VideoFrame with the infrared frame data. */
trait PerceptionInfraredFrame extends StObject {
  
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit
  
  /** Gets a Windows.Media.VideoFrame with the infrared frame data. */
  var videoFrame: VideoFrame
}
object PerceptionInfraredFrame {
  
  @scala.inline
  def apply(close: () => Unit, videoFrame: VideoFrame): PerceptionInfraredFrame = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), videoFrame = videoFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionInfraredFrame]
  }
  
  @scala.inline
  implicit class PerceptionInfraredFrameMutableBuilder[Self <: PerceptionInfraredFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVideoFrame(value: VideoFrame): Self = StObject.set(x, "videoFrame", value.asInstanceOf[js.Any])
  }
}
