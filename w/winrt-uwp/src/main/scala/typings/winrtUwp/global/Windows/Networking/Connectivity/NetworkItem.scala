package typings.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connected network. */
@JSGlobal("Windows.Networking.Connectivity.NetworkItem")
@js.native
abstract class NetworkItem ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.NetworkItem {
  /** Gets the network ID. */
  /* CompleteClass */
  override var networkId: String = js.native
  /**
    * Gets a NetworkTypes value indicating the network type for a NetworkItem .
    * @return The type of a network.
    */
  /* CompleteClass */
  override def getNetworkTypes(): typings.winrtUwp.Windows.Networking.Connectivity.NetworkTypes = js.native
}

