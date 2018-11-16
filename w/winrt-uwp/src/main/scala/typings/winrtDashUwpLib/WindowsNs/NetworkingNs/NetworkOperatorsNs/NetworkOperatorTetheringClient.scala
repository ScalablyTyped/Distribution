package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about a tethering client. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorTetheringClient")
@js.native
abstract class NetworkOperatorTetheringClient () extends js.Object {
  /** Gets a list of hostnames used by this tethering client. */
  var hostNames: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.NetworkingNs.HostName] = js.native
  /** Gets the MAC address of this tethering client. */
  var macAddress: java.lang.String = js.native
}

