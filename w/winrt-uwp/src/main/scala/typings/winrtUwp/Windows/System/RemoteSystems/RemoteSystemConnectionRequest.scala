package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an intent to communicate with a specific remote system (device). */
@js.native
trait RemoteSystemConnectionRequest extends js.Object {
  
  /** Represents the remote system (device) that the app intends to communicate with. */
  var remoteSystem: RemoteSystem = js.native
  
  /** Represents the remote application that the app intends to communicate with. */
  var remoteSystemApp: RemoteSystemApp = js.native
}
object RemoteSystemConnectionRequest {
  
  @scala.inline
  def apply(remoteSystem: RemoteSystem, remoteSystemApp: RemoteSystemApp): RemoteSystemConnectionRequest = {
    val __obj = js.Dynamic.literal(remoteSystem = remoteSystem.asInstanceOf[js.Any], remoteSystemApp = remoteSystemApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemConnectionRequest]
  }
  
  @scala.inline
  implicit class RemoteSystemConnectionRequestOps[Self <: RemoteSystemConnectionRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setRemoteSystemApp(value: RemoteSystemApp): Self = this.set("remoteSystemApp", value.asInstanceOf[js.Any])
  }
}
