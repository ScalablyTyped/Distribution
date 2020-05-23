package typings.winrtUwp.global.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a network adapter. */
@JSGlobal("Windows.Networking.Connectivity.NetworkAdapter")
@js.native
abstract class NetworkAdapter ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter {
  /** Gets a value indicating the network interface type as defined by the Internet Assigned Names Authority (IANA) for the NetworkAdapter . */
  /* CompleteClass */
  override var ianaInterfaceType: Double = js.native
  /** Gets a value indicating the maximum inbound data transfer rate in bits per second. */
  /* CompleteClass */
  override var inboundMaxBitsPerSecond: Double = js.native
  /** Gets the network adapter ID. */
  /* CompleteClass */
  override var networkAdapterId: String = js.native
  /** Gets the NetworkItem object that represents the connected network. */
  /* CompleteClass */
  override var networkItem: typings.winrtUwp.Windows.Networking.Connectivity.NetworkItem = js.native
  /** Gets a value indicating the maximum outbound speed in bits per second. */
  /* CompleteClass */
  override var outboundMaxBitsPerSecond: Double = js.native
  /**
    * Gets the connection profile currently associated with the network adapter.
    * @return The connection profile associated with this network adapter.
    */
  /* CompleteClass */
  override def getConnectedProfileAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile] = js.native
}

