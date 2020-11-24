package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a remote app removed from a session. */
@js.native
trait AllJoynSessionMemberRemovedEventArgs extends js.Object {
  
  /** The unique bus name of the remote app removed from the session. */
  var uniqueName: String = js.native
}
object AllJoynSessionMemberRemovedEventArgs {
  
  @scala.inline
  def apply(uniqueName: String): AllJoynSessionMemberRemovedEventArgs = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynSessionMemberRemovedEventArgs]
  }
  
  @scala.inline
  implicit class AllJoynSessionMemberRemovedEventArgsOps[Self <: AllJoynSessionMemberRemovedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
  }
}
