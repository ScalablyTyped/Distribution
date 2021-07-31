package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the ManipulationUpdated event. */
trait ManipulationUpdatedEventArgs extends StObject {
  
  /** Gets values that indicate the accumulated transformation deltas (translation, rotation, scale) for a manipulation from the beginning of the interaction to the ManipulationUpdated event. */
  var cumulative: ManipulationDelta
  
  /** Gets values that indicate the changes in the transformation deltas (translation, rotation, scale) of a manipulation since the last manipulation event. */
  var delta: ManipulationDelta
  
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType
  
  /** Gets the location of the pointer associated with the manipulation for the last manipulation event. */
  var position: Point
  
  /** Gets values that indicate the velocities of the transformation deltas (translation, rotation, scale) for a manipulation at the ManipulationUpdated event. */
  var velocities: ManipulationVelocities
}
object ManipulationUpdatedEventArgs {
  
  @scala.inline
  def apply(
    cumulative: ManipulationDelta,
    delta: ManipulationDelta,
    pointerDeviceType: PointerDeviceType,
    position: Point,
    velocities: ManipulationVelocities
  ): ManipulationUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], velocities = velocities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManipulationUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class ManipulationUpdatedEventArgsMutableBuilder[Self <: ManipulationUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCumulative(value: ManipulationDelta): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelta(value: ManipulationDelta): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocities(value: ManipulationVelocities): Self = StObject.set(x, "velocities", value.asInstanceOf[js.Any])
  }
}
