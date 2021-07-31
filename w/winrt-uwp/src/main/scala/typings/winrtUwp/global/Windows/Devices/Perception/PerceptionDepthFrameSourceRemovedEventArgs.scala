package typings.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event data for depth frame source removed events. */
@JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSourceRemovedEventArgs")
@js.native
abstract class PerceptionDepthFrameSourceRemovedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSourceRemovedEventArgs {
  
  /** Gets the depth frame source that was removed. */
  /* CompleteClass */
  var frameSource: typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSource = js.native
}
