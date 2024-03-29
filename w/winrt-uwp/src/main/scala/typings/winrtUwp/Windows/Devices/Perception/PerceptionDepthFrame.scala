package typings.winrtUwp.Windows.Devices.Perception

import typings.winrtUwp.Windows.Media.VideoFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a Windows.Media.VideoFrame with the depth frame data. */
trait PerceptionDepthFrame extends StObject {
  
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit
  
  /** Gets a Windows.Media.VideoFrame with the depth frame data. */
  var videoFrame: VideoFrame
}
object PerceptionDepthFrame {
  
  inline def apply(close: () => Unit, videoFrame: VideoFrame): PerceptionDepthFrame = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), videoFrame = videoFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionDepthFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerceptionDepthFrame] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setVideoFrame(value: VideoFrame): Self = StObject.set(x, "videoFrame", value.asInstanceOf[js.Any])
  }
}
