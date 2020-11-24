package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IManipulationInertiaStartingEventArgs extends js.Object {
  
  var cumulative: ManipulationDelta = js.native
  
  var delta: ManipulationDelta = js.native
  
  var pointerDeviceType: PointerDeviceType = js.native
  
  var position: Point = js.native
  
  var velocities: ManipulationVelocities = js.native
}
object IManipulationInertiaStartingEventArgs {
  
  @scala.inline
  def apply(
    cumulative: ManipulationDelta,
    delta: ManipulationDelta,
    pointerDeviceType: PointerDeviceType,
    position: Point,
    velocities: ManipulationVelocities
  ): IManipulationInertiaStartingEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], velocities = velocities.asInstanceOf[js.Any])
    __obj.asInstanceOf[IManipulationInertiaStartingEventArgs]
  }
  
  @scala.inline
  implicit class IManipulationInertiaStartingEventArgsOps[Self <: IManipulationInertiaStartingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCumulative(value: ManipulationDelta): Self = this.set("cumulative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelta(value: ManipulationDelta): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = this.set("pointerDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocities(value: ManipulationVelocities): Self = this.set("velocities", value.asInstanceOf[js.Any])
  }
}
