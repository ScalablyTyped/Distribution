package typings.winrtUwp.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the local endpoint and remote endpoint for a network connection used by network apps. */
@js.native
trait EndpointPair extends js.Object {
  /** Get or set the local hostname for the EndpointPair object. */
  var localHostName: HostName = js.native
  /** Get or set the local service name for the EndpointPair object. */
  var localServiceName: String = js.native
  /** Get or set the remote hostname for the EndpointPair object. */
  var remoteHostName: HostName = js.native
  /** Get or set the remote service name for the EndpointPair object. */
  var remoteServiceName: String = js.native
}

object EndpointPair {
  @scala.inline
  def apply(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ): EndpointPair = {
    val __obj = js.Dynamic.literal(localHostName = localHostName.asInstanceOf[js.Any], localServiceName = localServiceName.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any], remoteServiceName = remoteServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointPair]
  }
  @scala.inline
  implicit class EndpointPairOps[Self <: EndpointPair] (val x: Self) extends AnyVal {
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
    def setLocalHostName(value: HostName): Self = this.set("localHostName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalServiceName(value: String): Self = this.set("localServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteHostName(value: HostName): Self = this.set("remoteHostName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteServiceName(value: String): Self = this.set("remoteServiceName", value.asInstanceOf[js.Any])
  }
  
}

