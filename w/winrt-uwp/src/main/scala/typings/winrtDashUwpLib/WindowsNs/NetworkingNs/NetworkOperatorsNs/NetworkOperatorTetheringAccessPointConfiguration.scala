package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability to configure and create a NetworkOperatorTetheringAccessPointConfiguration object that contains a specific network account ID (SSID) and specifies the passphrase used to authenticate clients trying to establish a network connection to the tethering network. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorTetheringAccessPointConfiguration")
@js.native
class NetworkOperatorTetheringAccessPointConfiguration () extends js.Object {
  /** Gets or sets the passphrase used to authenticate the connection. */
  var passphrase: java.lang.String = js.native
  /** Gets or sets the network account ID. */
  var ssid: java.lang.String = js.native
}

