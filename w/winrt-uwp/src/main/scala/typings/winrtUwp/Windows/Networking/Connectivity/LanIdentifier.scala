package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents physical identification data for a specific NetworkAdapter object. */
trait LanIdentifier extends js.Object {
  /** Gets a LanIdentifierData object containing locality identification information for the network adapter's connection. */
  var infrastructureId: LanIdentifierData
  /** Gets the adapter GUID that identifies the network adapter to associate with the locality information. */
  var networkAdapterId: String
  /** Gets a LanIdentifierData object containing the port ID from the Link Layer Discovery Protocol (LLDP) locality information for an Ethernet type network adapter. */
  var portId: LanIdentifierData
}

object LanIdentifier {
  @scala.inline
  def apply(infrastructureId: LanIdentifierData, networkAdapterId: String, portId: LanIdentifierData): LanIdentifier = {
    val __obj = js.Dynamic.literal(infrastructureId = infrastructureId.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanIdentifier]
  }
}

