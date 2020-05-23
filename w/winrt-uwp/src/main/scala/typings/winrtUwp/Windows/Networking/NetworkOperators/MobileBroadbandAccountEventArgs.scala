package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for the AccountAdded and AccountRemoved events. */
trait MobileBroadbandAccountEventArgs extends js.Object {
  /** Gets the network account Id that was added or removed. */
  var networkAccountId: String
}

object MobileBroadbandAccountEventArgs {
  @scala.inline
  def apply(networkAccountId: String): MobileBroadbandAccountEventArgs = {
    val __obj = js.Dynamic.literal(networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandAccountEventArgs]
  }
}

