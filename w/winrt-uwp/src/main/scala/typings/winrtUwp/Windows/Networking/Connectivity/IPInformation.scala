package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the association between an IP address and an adapter on the network. */
@JSGlobal("Windows.Networking.Connectivity.IPInformation")
@js.native
abstract class IPInformation () extends js.Object {
  /** Retrieves the network adapter associated with the IP address. */
  var networkAdapter: NetworkAdapter = js.native
  /** Retrieves the length of the prefix, or network part of the IP address. */
  var prefixLength: Double = js.native
}

