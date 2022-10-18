package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.UI.Input.ManipulationDelta
import typings.winrtUwp.Windows.UI.Input.ManipulationVelocities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the GestureRecognizer.ManipulationInertiaStartingEvent . */
/* note: abstract class */ @JSGlobal("Windows.UI.Input.ManipulationInertiaStartingEventArgs")
@js.native
open class ManipulationInertiaStartingEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.Input.ManipulationInertiaStartingEventArgs {
  
  /** Gets values that indicate the accumulated transformation deltas (translation, rotation, scale) for a manipulation before inertia begins. */
  /* CompleteClass */
  var cumulative: ManipulationDelta = js.native
  
  /** Gets values that indicate the changes in the transformation deltas (translation, rotation, scale) of a manipulation since the last manipulation event. */
  /* CompleteClass */
  var delta: ManipulationDelta = js.native
  
  /** Gets the device type of the input source. */
  /* CompleteClass */
  var pointerDeviceType: PointerDeviceType = js.native
  
  /** Gets the location of the pointer associated with the manipulation for the last manipulation event. */
  /* CompleteClass */
  var position: Point = js.native
  
  /** Gets values that indicate the velocities of the transformation deltas (translation, rotation, scale) for a manipulation at the ManipulationInertiaStarting event. */
  /* CompleteClass */
  var velocities: ManipulationVelocities = js.native
}
