package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets information about a RemoteSystemAdded event, namely the RemoteSystem that was added. */
@js.native
trait RemoteSystemAddedEventArgs extends js.Object {
  
  /** The RemoteSystem object representing the device that was added to the set of discoverable devices, causing the containing RemoteSystemAdded event to be raised. */
  var remoteSystem: RemoteSystem = js.native
}
object RemoteSystemAddedEventArgs {
  
  @scala.inline
  def apply(remoteSystem: RemoteSystem): RemoteSystemAddedEventArgs = {
    val __obj = js.Dynamic.literal(remoteSystem = remoteSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemAddedEventArgs]
  }
  
  @scala.inline
  implicit class RemoteSystemAddedEventArgsOps[Self <: RemoteSystemAddedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setRemoteSystem(value: RemoteSystem): Self = this.set("remoteSystem", value.asInstanceOf[js.Any])
  }
}
