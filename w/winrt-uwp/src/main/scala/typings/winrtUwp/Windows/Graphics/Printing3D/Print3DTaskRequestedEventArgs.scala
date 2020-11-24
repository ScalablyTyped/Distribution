package typings.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TaskRequested event. */
@js.native
trait Print3DTaskRequestedEventArgs extends js.Object {
  
  /** Gets the 3D print job request associated with the Print3DManager . */
  var request: Print3DTaskRequest = js.native
}
object Print3DTaskRequestedEventArgs {
  
  @scala.inline
  def apply(request: Print3DTaskRequest): Print3DTaskRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DTaskRequestedEventArgs]
  }
  
  @scala.inline
  implicit class Print3DTaskRequestedEventArgsOps[Self <: Print3DTaskRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: Print3DTaskRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
}
