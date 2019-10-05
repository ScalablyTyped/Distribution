package typings.winrtDashUwp.Windows.Networking.Connectivity

import typings.winrtDashUwp.Windows.Networking.DomainNameType
import typings.winrtDashUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The RoutePolicy class is used to represent the traffic routing policy for a special PDP Context/APN. */
@JSGlobal("Windows.Networking.Connectivity.RoutePolicy")
@js.native
class RoutePolicy protected () extends js.Object {
  /**
    * Creates an instance of RoutePolicy using the defined connection profile and host name values.
    * @param connectionProfile The connection profile
    * @param hostName The host name for the route policy to the special PDP context.
    * @param type The domain type of hostName when the HostNameType value indicates a domain name.
    */
  def this(connectionProfile: ConnectionProfile, hostName: HostName, `type`: DomainNameType) = this()
  /** Retrieves the connection profile for an access point connection. */
  var connectionProfile: ConnectionProfile = js.native
  /** Provides the host name for the route policy to the special PDP context. */
  var hostName: HostName = js.native
  /** Indicates if the HostName is a suffix or a fully qualified domain name reference. Possible values are defined by DomainNameType . */
  var hostNameType: DomainNameType = js.native
}

