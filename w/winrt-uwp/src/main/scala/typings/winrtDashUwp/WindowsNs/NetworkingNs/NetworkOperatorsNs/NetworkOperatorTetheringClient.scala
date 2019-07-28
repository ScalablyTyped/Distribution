package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.NetworkingNs.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about a tethering client. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorTetheringClient")
@js.native
abstract class NetworkOperatorTetheringClient () extends js.Object {
  /** Gets a list of hostnames used by this tethering client. */
  var hostNames: IVectorView[HostName] = js.native
  /** Gets the MAC address of this tethering client. */
  var macAddress: String = js.native
}

