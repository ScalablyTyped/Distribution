package typings.winrtUwp.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Networking.DomainNameType
import typings.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The RoutePolicy class is used to represent the traffic routing policy for a special PDP Context/APN. */
trait RoutePolicy extends js.Object {
  /** Retrieves the connection profile for an access point connection. */
  var connectionProfile: ConnectionProfile
  /** Provides the host name for the route policy to the special PDP context. */
  var hostName: HostName
  /** Indicates if the HostName is a suffix or a fully qualified domain name reference. Possible values are defined by DomainNameType . */
  var hostNameType: DomainNameType
}

object RoutePolicy {
  @scala.inline
  def apply(connectionProfile: ConnectionProfile, hostName: HostName, hostNameType: DomainNameType): RoutePolicy = {
    val __obj = js.Dynamic.literal(connectionProfile = connectionProfile.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], hostNameType = hostNameType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutePolicy]
  }
}

