package typings.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a depth frame arrived event. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameArrivedEventArgs")
@js.native
open class PerceptionDepthFrameArrivedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameArrivedEventArgs {
  
  /** Gets the relative time of this frame. */
  /* CompleteClass */
  var relativeTime: Double = js.native
  
  /**
    * Attempts to open the depth frame that has arrived. Existing frames should be closed before opening new frames. If an app has three or more frames still open when this method is called, TryOpenFrame will fail.
    * @return If the attempt is successful, this method returns the newly-arrived depth frame. If the attempt is unsuccessful, this value is unchanged.
    */
  /* CompleteClass */
  override def tryOpenFrame(): typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrame = js.native
}
