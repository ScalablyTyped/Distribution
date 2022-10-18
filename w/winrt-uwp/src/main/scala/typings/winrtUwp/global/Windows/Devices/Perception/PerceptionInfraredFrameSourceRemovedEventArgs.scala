package typings.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event data for infrared frame source removed events. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameSourceRemovedEventArgs")
@js.native
open class PerceptionInfraredFrameSourceRemovedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrameSourceRemovedEventArgs {
  
  /** Gets the infrared frame source that was removed. */
  /* CompleteClass */
  var frameSource: typings.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrameSource = js.native
}
