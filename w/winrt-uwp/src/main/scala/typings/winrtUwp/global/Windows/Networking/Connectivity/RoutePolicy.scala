package typings.winrtUwp.global.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Networking.DomainNameType
import typings.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The RoutePolicy class is used to represent the traffic routing policy for a special PDP Context/APN. */
@JSGlobal("Windows.Networking.Connectivity.RoutePolicy")
@js.native
class RoutePolicy protected ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.RoutePolicy {
  /**
    * Creates an instance of RoutePolicy using the defined connection profile and host name values.
    * @param connectionProfile The connection profile
    * @param hostName The host name for the route policy to the special PDP context.
    * @param type The domain type of hostName when the HostNameType value indicates a domain name.
    */
  def this(
    connectionProfile: typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile,
    hostName: HostName,
    `type`: DomainNameType
  ) = this()
}
