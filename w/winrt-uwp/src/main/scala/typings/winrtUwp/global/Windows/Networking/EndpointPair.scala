package typings.winrtUwp.global.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the local endpoint and remote endpoint for a network connection used by network apps. */
@JSGlobal("Windows.Networking.EndpointPair")
@js.native
class EndpointPair protected ()
  extends typings.winrtUwp.Windows.Networking.EndpointPair {
  /**
    * Creates a new EndpointPair object.
    * @param localHostName The local hostname or IP address for the EndpointPair object.
    * @param localServiceName The local service name or the local TCP or UDP port number for the EndpointPair object.
    * @param remoteHostName The remote hostname or IP address for the EndpointPair object.
    * @param remoteServiceName The remote service name or the remote TCP or UDP port number for the EndpointPair object.
    */
  def this(
    localHostName: typings.winrtUwp.Windows.Networking.HostName,
    localServiceName: String,
    remoteHostName: typings.winrtUwp.Windows.Networking.HostName,
    remoteServiceName: String
  ) = this()
}
