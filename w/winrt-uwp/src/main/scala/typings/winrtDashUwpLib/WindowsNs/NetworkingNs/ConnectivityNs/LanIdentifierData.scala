package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the port specific data that enables LAN locality capabilities. */
@JSGlobal("Windows.Networking.Connectivity.LanIdentifierData")
@js.native
abstract class LanIdentifierData () extends js.Object {
  /** Gets a value indicating the type of data stored in the value field of the LanIdentifierData object according to the Link Layer Discovery Protocol (LLDP) protocol. */
  var `type`: scala.Double = js.native
  /** Gets the serialized value. */
  var value: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[scala.Double] = js.native
}

