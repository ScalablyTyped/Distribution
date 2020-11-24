package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The ConnectionSession class is used to represent a connection to an access point established with AcquireConnectionAsync . */
@js.native
trait ConnectionSession extends js.Object {
  
  /** Closes the connection to the access point. */
  def close(): Unit = js.native
  
  /** Retrieves the ConnectionProfile associated with the connection session. */
  var connectionProfile: ConnectionProfile = js.native
}
object ConnectionSession {
  
  @scala.inline
  def apply(close: () => Unit, connectionProfile: ConnectionProfile): ConnectionSession = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connectionProfile = connectionProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionSession]
  }
  
  @scala.inline
  implicit class ConnectionSessionOps[Self <: ConnectionSession] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnectionProfile(value: ConnectionProfile): Self = this.set("connectionProfile", value.asInstanceOf[js.Any])
  }
}
