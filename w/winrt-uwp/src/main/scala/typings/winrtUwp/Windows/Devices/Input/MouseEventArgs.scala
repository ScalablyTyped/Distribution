package typings.winrtUwp.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the MouseMoved event. */
@js.native
trait MouseEventArgs extends js.Object {
  
  /** Gets a value that indicates the change in the screen location of the mouse pointer since the last mouse event. */
  var mouseDelta: MouseDelta = js.native
}
object MouseEventArgs {
  
  @scala.inline
  def apply(mouseDelta: MouseDelta): MouseEventArgs = {
    val __obj = js.Dynamic.literal(mouseDelta = mouseDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEventArgs]
  }
  
  @scala.inline
  implicit class MouseEventArgsOps[Self <: MouseEventArgs] (val x: Self) extends AnyVal {
    
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
    def setMouseDelta(value: MouseDelta): Self = this.set("mouseDelta", value.asInstanceOf[js.Any])
  }
}
