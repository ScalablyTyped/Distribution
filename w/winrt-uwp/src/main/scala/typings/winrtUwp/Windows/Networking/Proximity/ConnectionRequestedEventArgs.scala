package typings.winrtUwp.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains properties that are passed to an application with the ConnectionRequested event. */
@js.native
trait ConnectionRequestedEventArgs extends js.Object {
  
  /** Gets the information for a peer that's requesting a connection. */
  var peerInformation: PeerInformation = js.native
}
object ConnectionRequestedEventArgs {
  
  @scala.inline
  def apply(peerInformation: PeerInformation): ConnectionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(peerInformation = peerInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionRequestedEventArgs]
  }
  
  @scala.inline
  implicit class ConnectionRequestedEventArgsOps[Self <: ConnectionRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setPeerInformation(value: PeerInformation): Self = this.set("peerInformation", value.asInstanceOf[js.Any])
  }
}
