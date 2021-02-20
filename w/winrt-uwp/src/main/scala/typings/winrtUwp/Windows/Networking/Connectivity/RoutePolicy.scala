package typings.winrtUwp.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Networking.DomainNameType
import typings.winrtUwp.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The RoutePolicy class is used to represent the traffic routing policy for a special PDP Context/APN. */
@js.native
trait RoutePolicy extends StObject {
  
  /** Retrieves the connection profile for an access point connection. */
  var connectionProfile: ConnectionProfile = js.native
  
  /** Provides the host name for the route policy to the special PDP context. */
  var hostName: HostName = js.native
  
  /** Indicates if the HostName is a suffix or a fully qualified domain name reference. Possible values are defined by DomainNameType . */
  var hostNameType: DomainNameType = js.native
}
object RoutePolicy {
  
  @scala.inline
  def apply(connectionProfile: ConnectionProfile, hostName: HostName, hostNameType: DomainNameType): RoutePolicy = {
    val __obj = js.Dynamic.literal(connectionProfile = connectionProfile.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], hostNameType = hostNameType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutePolicy]
  }
  
  @scala.inline
  implicit class RoutePolicyMutableBuilder[Self <: RoutePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionProfile(value: ConnectionProfile): Self = StObject.set(x, "connectionProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostName(value: HostName): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNameType(value: DomainNameType): Self = StObject.set(x, "hostNameType", value.asInstanceOf[js.Any])
  }
}
