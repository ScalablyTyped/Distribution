package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents physical identification data for a specific NetworkAdapter object. */
@js.native
trait LanIdentifier extends js.Object {
  /** Gets a LanIdentifierData object containing locality identification information for the network adapter's connection. */
  var infrastructureId: LanIdentifierData = js.native
  /** Gets the adapter GUID that identifies the network adapter to associate with the locality information. */
  var networkAdapterId: String = js.native
  /** Gets a LanIdentifierData object containing the port ID from the Link Layer Discovery Protocol (LLDP) locality information for an Ethernet type network adapter. */
  var portId: LanIdentifierData = js.native
}

object LanIdentifier {
  @scala.inline
  def apply(infrastructureId: LanIdentifierData, networkAdapterId: String, portId: LanIdentifierData): LanIdentifier = {
    val __obj = js.Dynamic.literal(infrastructureId = infrastructureId.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanIdentifier]
  }
  @scala.inline
  implicit class LanIdentifierOps[Self <: LanIdentifier] (val x: Self) extends AnyVal {
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
    def setInfrastructureId(value: LanIdentifierData): Self = this.set("infrastructureId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkAdapterId(value: String): Self = this.set("networkAdapterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortId(value: LanIdentifierData): Self = this.set("portId", value.asInstanceOf[js.Any])
  }
  
}

