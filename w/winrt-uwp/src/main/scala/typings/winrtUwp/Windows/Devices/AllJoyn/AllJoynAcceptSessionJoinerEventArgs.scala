package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a join session request that is used to determine if the request will be accepted and initiate the session connection. */
@js.native
trait AllJoynAcceptSessionJoinerEventArgs extends js.Object {
  
  /** Called to accept the session connection. */
  def accept(): Unit = js.native
  
  /** Indicates if the app joining the session is on the same network. */
  var sameNetwork: Boolean = js.native
  
  /** The app joining the session is on the same physical node. */
  var samePhysicalNode: Boolean = js.native
  
  /** The session port being used to connect to the session. */
  var sessionPort: Double = js.native
  
  /** The traffic type supported during the session. */
  var trafficType: AllJoynTrafficType = js.native
  
  /** The unique bus name of the app requesting a session connection. */
  var uniqueName: String = js.native
}
object AllJoynAcceptSessionJoinerEventArgs {
  
  @scala.inline
  def apply(
    accept: () => Unit,
    sameNetwork: Boolean,
    samePhysicalNode: Boolean,
    sessionPort: Double,
    trafficType: AllJoynTrafficType,
    uniqueName: String
  ): AllJoynAcceptSessionJoinerEventArgs = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), sameNetwork = sameNetwork.asInstanceOf[js.Any], samePhysicalNode = samePhysicalNode.asInstanceOf[js.Any], sessionPort = sessionPort.asInstanceOf[js.Any], trafficType = trafficType.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynAcceptSessionJoinerEventArgs]
  }
  
  @scala.inline
  implicit class AllJoynAcceptSessionJoinerEventArgsOps[Self <: AllJoynAcceptSessionJoinerEventArgs] (val x: Self) extends AnyVal {
    
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
    def setAccept(value: () => Unit): Self = this.set("accept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSameNetwork(value: Boolean): Self = this.set("sameNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamePhysicalNode(value: Boolean): Self = this.set("samePhysicalNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionPort(value: Double): Self = this.set("sessionPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficType(value: AllJoynTrafficType): Self = this.set("trafficType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
  }
}
