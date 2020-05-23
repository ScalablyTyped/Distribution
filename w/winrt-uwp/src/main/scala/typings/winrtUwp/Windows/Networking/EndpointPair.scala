package typings.winrtUwp.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the local endpoint and remote endpoint for a network connection used by network apps. */
trait EndpointPair extends js.Object {
  /** Get or set the local hostname for the EndpointPair object. */
  var localHostName: HostName
  /** Get or set the local service name for the EndpointPair object. */
  var localServiceName: String
  /** Get or set the remote hostname for the EndpointPair object. */
  var remoteHostName: HostName
  /** Get or set the remote service name for the EndpointPair object. */
  var remoteServiceName: String
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
}

