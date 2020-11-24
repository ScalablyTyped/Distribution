package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the velocities of the accumulated transformations for the current interaction. */
@js.native
trait ManipulationVelocities extends js.Object {
  
  /** The rotational velocity in degrees per millisecond. */
  var angular: Double = js.native
  
  /** The expansion, or scaling, velocity in DIPs per millisecond. */
  var expansion: Double = js.native
  
  /** The straight line velocity in DIPs per millisecond. */
  var linear: Point = js.native
}
object ManipulationVelocities {
  
  @scala.inline
  def apply(angular: Double, expansion: Double, linear: Point): ManipulationVelocities = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any], expansion = expansion.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManipulationVelocities]
  }
  
  @scala.inline
  implicit class ManipulationVelocitiesOps[Self <: ManipulationVelocities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAngular(value: Double): Self = this.set("angular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpansion(value: Double): Self = this.set("expansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinear(value: Point): Self = this.set("linear", value.asInstanceOf[js.Any])
  }
}
