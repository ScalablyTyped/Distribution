package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the association between an IP address and an adapter on the network. */
trait IPInformation extends js.Object {
  /** Retrieves the network adapter associated with the IP address. */
  var networkAdapter: NetworkAdapter
  /** Retrieves the length of the prefix, or network part of the IP address. */
  var prefixLength: Double
}

object IPInformation {
  @scala.inline
  def apply(networkAdapter: NetworkAdapter, prefixLength: Double): IPInformation = {
    val __obj = js.Dynamic.literal(networkAdapter = networkAdapter.asInstanceOf[js.Any], prefixLength = prefixLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPInformation]
  }
}

