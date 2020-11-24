package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a successful or unsuccessful completion of an authentication operation. */
@js.native
trait AllJoynAuthenticationCompleteEventArgs extends js.Object {
  
  /** The mechanism used during authentication. */
  var authenticationMechanism: AllJoynAuthenticationMechanism = js.native
  
  /** The unique bus name of the Consumer being authenticated. On the initiating side this will be the unique bus name of the remote app being authenticated. On the accepting side this will be the unique bus name for the remote app. */
  var peerUniqueName: String = js.native
  
  /** Indicates if the remote app was authenticated. */
  var succeeded: Boolean = js.native
}
object AllJoynAuthenticationCompleteEventArgs {
  
  @scala.inline
  def apply(
    authenticationMechanism: AllJoynAuthenticationMechanism,
    peerUniqueName: String,
    succeeded: Boolean
  ): AllJoynAuthenticationCompleteEventArgs = {
    val __obj = js.Dynamic.literal(authenticationMechanism = authenticationMechanism.asInstanceOf[js.Any], peerUniqueName = peerUniqueName.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynAuthenticationCompleteEventArgs]
  }
  
  @scala.inline
  implicit class AllJoynAuthenticationCompleteEventArgsOps[Self <: AllJoynAuthenticationCompleteEventArgs] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationMechanism(value: AllJoynAuthenticationMechanism): Self = this.set("authenticationMechanism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerUniqueName(value: String): Self = this.set("peerUniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: Boolean): Self = this.set("succeeded", value.asInstanceOf[js.Any])
  }
}
