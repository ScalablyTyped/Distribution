package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents physical identification data for a specific NetworkAdapter object. */
@JSGlobal("Windows.Networking.Connectivity.LanIdentifier")
@js.native
abstract class LanIdentifier () extends js.Object {
  /** Gets a LanIdentifierData object containing locality identification information for the network adapter's connection. */
  var infrastructureId: LanIdentifierData = js.native
  /** Gets the adapter GUID that identifies the network adapter to associate with the locality information. */
  var networkAdapterId: java.lang.String = js.native
  /** Gets a LanIdentifierData object containing the port ID from the Link Layer Discovery Protocol (LLDP) locality information for an Ethernet type network adapter. */
  var portId: LanIdentifierData = js.native
}

