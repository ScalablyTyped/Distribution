package typings.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the association between an IP address and an adapter on the network. */
@JSGlobal("Windows.Networking.Connectivity.IPInformation")
@js.native
abstract class IPInformation ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.IPInformation {
  /** Retrieves the network adapter associated with the IP address. */
  /* CompleteClass */
  override var networkAdapter: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter = js.native
  /** Retrieves the length of the prefix, or network part of the IP address. */
  /* CompleteClass */
  override var prefixLength: Double = js.native
}

