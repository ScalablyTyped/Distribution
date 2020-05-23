package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about a tethering client. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorTetheringClient")
@js.native
abstract class NetworkOperatorTetheringClient ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringClient {
  /** Gets a list of hostnames used by this tethering client. */
  /* CompleteClass */
  override var hostNames: IVectorView[HostName] = js.native
  /** Gets the MAC address of this tethering client. */
  /* CompleteClass */
  override var macAddress: String = js.native
}

