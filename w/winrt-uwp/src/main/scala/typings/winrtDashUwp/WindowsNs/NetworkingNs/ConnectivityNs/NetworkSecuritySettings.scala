package typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the current network security settings. */
@JSGlobal("Windows.Networking.Connectivity.NetworkSecuritySettings")
@js.native
abstract class NetworkSecuritySettings () extends js.Object {
  /** Retrieves the type of authentication used by the network. */
  var networkAuthenticationType: NetworkAuthenticationType = js.native
  /** Retrieves the type of encryption used by the network. */
  var networkEncryptionType: NetworkEncryptionType = js.native
}

