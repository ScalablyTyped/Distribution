package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Media.VideoFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a Windows.Media.VideoFrame with the infrared frame data. */
@JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrame")
@js.native
abstract class PerceptionInfraredFrame ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrame {
  
  /** Releases system resources that are exposed by a Windows Runtime object. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /** Gets a Windows.Media.VideoFrame with the infrared frame data. */
  /* CompleteClass */
  var videoFrame: VideoFrame = js.native
}
