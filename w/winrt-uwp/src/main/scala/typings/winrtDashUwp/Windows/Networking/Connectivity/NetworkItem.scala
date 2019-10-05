package typings.winrtDashUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connected network. */
@JSGlobal("Windows.Networking.Connectivity.NetworkItem")
@js.native
abstract class NetworkItem () extends js.Object {
  /** Gets the network ID. */
  var networkId: String = js.native
  /**
    * Gets a NetworkTypes value indicating the network type for a NetworkItem .
    * @return The type of a network.
    */
  def getNetworkTypes(): NetworkTypes = js.native
}

