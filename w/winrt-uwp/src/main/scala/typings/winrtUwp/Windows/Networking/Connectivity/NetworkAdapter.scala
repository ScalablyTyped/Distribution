package typings.winrtUwp.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a network adapter. */
trait NetworkAdapter extends js.Object {
  /** Gets a value indicating the network interface type as defined by the Internet Assigned Names Authority (IANA) for the NetworkAdapter . */
  var ianaInterfaceType: Double
  /** Gets a value indicating the maximum inbound data transfer rate in bits per second. */
  var inboundMaxBitsPerSecond: Double
  /** Gets the network adapter ID. */
  var networkAdapterId: String
  /** Gets the NetworkItem object that represents the connected network. */
  var networkItem: NetworkItem
  /** Gets a value indicating the maximum outbound speed in bits per second. */
  var outboundMaxBitsPerSecond: Double
  /**
    * Gets the connection profile currently associated with the network adapter.
    * @return The connection profile associated with this network adapter.
    */
  def getConnectedProfileAsync(): IPromiseWithIAsyncOperation[ConnectionProfile]
}

object NetworkAdapter {
  @scala.inline
  def apply(
    getConnectedProfileAsync: () => IPromiseWithIAsyncOperation[ConnectionProfile],
    ianaInterfaceType: Double,
    inboundMaxBitsPerSecond: Double,
    networkAdapterId: String,
    networkItem: NetworkItem,
    outboundMaxBitsPerSecond: Double
  ): NetworkAdapter = {
    val __obj = js.Dynamic.literal(getConnectedProfileAsync = js.Any.fromFunction0(getConnectedProfileAsync), ianaInterfaceType = ianaInterfaceType.asInstanceOf[js.Any], inboundMaxBitsPerSecond = inboundMaxBitsPerSecond.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], networkItem = networkItem.asInstanceOf[js.Any], outboundMaxBitsPerSecond = outboundMaxBitsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAdapter]
  }
}

