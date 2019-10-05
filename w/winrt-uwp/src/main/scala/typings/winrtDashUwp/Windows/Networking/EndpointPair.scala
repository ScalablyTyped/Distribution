package typings.winrtDashUwp.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the local endpoint and remote endpoint for a network connection used by network apps. */
@JSGlobal("Windows.Networking.EndpointPair")
@js.native
class EndpointPair protected () extends js.Object {
  /**
    * Creates a new EndpointPair object.
    * @param localHostName The local hostname or IP address for the EndpointPair object.
    * @param localServiceName The local service name or the local TCP or UDP port number for the EndpointPair object.
    * @param remoteHostName The remote hostname or IP address for the EndpointPair object.
    * @param remoteServiceName The remote service name or the remote TCP or UDP port number for the EndpointPair object.
    */
  def this(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ) = this()
  /** Get or set the local hostname for the EndpointPair object. */
  var localHostName: HostName = js.native
  /** Get or set the local service name for the EndpointPair object. */
  var localServiceName: String = js.native
  /** Get or set the remote hostname for the EndpointPair object. */
  var remoteHostName: HostName = js.native
  /** Get or set the remote service name for the EndpointPair object. */
  var remoteServiceName: String = js.native
}

