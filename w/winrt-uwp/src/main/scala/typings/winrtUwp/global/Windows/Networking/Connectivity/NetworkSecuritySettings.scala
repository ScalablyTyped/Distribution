package typings.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the current network security settings. */
@JSGlobal("Windows.Networking.Connectivity.NetworkSecuritySettings")
@js.native
abstract class NetworkSecuritySettings ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.NetworkSecuritySettings {
  /** Retrieves the type of authentication used by the network. */
  /* CompleteClass */
  override var networkAuthenticationType: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType = js.native
  /** Retrieves the type of encryption used by the network. */
  /* CompleteClass */
  override var networkEncryptionType: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType = js.native
}

