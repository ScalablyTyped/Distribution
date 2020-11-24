package typings.winrtUwp.Windows.Devices.Bluetooth.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information for RFCOMM outbound connections. If an app wants the system to create outbound connections on its behalf, the app must create this object and attach it to the RfcommConnectionTrigger . */
@js.native
trait RfcommOutboundConnectionInformation extends js.Object {
  
  /** Gets or sets the service UUID of the remote service to which the system will connect on behalf of the app. */
  var remoteServiceId: RfcommServiceId = js.native
}
object RfcommOutboundConnectionInformation {
  
  @scala.inline
  def apply(remoteServiceId: RfcommServiceId): RfcommOutboundConnectionInformation = {
    val __obj = js.Dynamic.literal(remoteServiceId = remoteServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RfcommOutboundConnectionInformation]
  }
  
  @scala.inline
  implicit class RfcommOutboundConnectionInformationOps[Self <: RfcommOutboundConnectionInformation] (val x: Self) extends AnyVal {
    
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
    def setRemoteServiceId(value: RfcommServiceId): Self = this.set("remoteServiceId", value.asInstanceOf[js.Any])
  }
}
