package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a network adapter. */
@JSGlobal("Windows.Networking.Connectivity.NetworkAdapter")
@js.native
abstract class NetworkAdapter () extends js.Object {
  /** Gets a value indicating the network interface type as defined by the Internet Assigned Names Authority (IANA) for the NetworkAdapter . */
  var ianaInterfaceType: scala.Double = js.native
  /** Gets a value indicating the maximum inbound data transfer rate in bits per second. */
  var inboundMaxBitsPerSecond: scala.Double = js.native
  /** Gets the network adapter ID. */
  var networkAdapterId: java.lang.String = js.native
  /** Gets the NetworkItem object that represents the connected network. */
  var networkItem: NetworkItem = js.native
  /** Gets a value indicating the maximum outbound speed in bits per second. */
  var outboundMaxBitsPerSecond: scala.Double = js.native
  /**
                   * Gets the connection profile currently associated with the network adapter.
                   * @return The connection profile associated with this network adapter.
                   */
  def getConnectedProfileAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ConnectionProfile] = js.native
}

