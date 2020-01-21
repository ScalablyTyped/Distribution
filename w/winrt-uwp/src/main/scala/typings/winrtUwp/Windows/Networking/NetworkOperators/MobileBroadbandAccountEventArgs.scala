package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for the AccountAdded and AccountRemoved events. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountEventArgs")
@js.native
abstract class MobileBroadbandAccountEventArgs () extends js.Object {
  /** Gets the network account Id that was added or removed. */
  var networkAccountId: String = js.native
}

