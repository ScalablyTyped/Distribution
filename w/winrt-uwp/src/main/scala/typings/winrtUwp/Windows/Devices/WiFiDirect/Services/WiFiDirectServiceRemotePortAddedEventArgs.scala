package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.EndpointPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned when a WiFiDirectServiceSession.RemotePortAdded event is raised. Your event handler should use this information to establish new socket connections to the new port. */
@js.native
trait WiFiDirectServiceRemotePortAddedEventArgs extends js.Object {
  /** Gets the endpoint pairs associated with the new remote port. */
  var endpointPairs: IVectorView[EndpointPair] = js.native
  /** Gets the protocol used to communicate with the new remote port. */
  var protocol: WiFiDirectServiceIPProtocol = js.native
}

object WiFiDirectServiceRemotePortAddedEventArgs {
  @scala.inline
  def apply(endpointPairs: IVectorView[EndpointPair], protocol: WiFiDirectServiceIPProtocol): WiFiDirectServiceRemotePortAddedEventArgs = {
    val __obj = js.Dynamic.literal(endpointPairs = endpointPairs.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceRemotePortAddedEventArgs]
  }
  @scala.inline
  implicit class WiFiDirectServiceRemotePortAddedEventArgsOps[Self <: WiFiDirectServiceRemotePortAddedEventArgs] (val x: Self) extends AnyVal {
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
    def setEndpointPairs(value: IVectorView[EndpointPair]): Self = this.set("endpointPairs", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: WiFiDirectServiceIPProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
  }
  
}

