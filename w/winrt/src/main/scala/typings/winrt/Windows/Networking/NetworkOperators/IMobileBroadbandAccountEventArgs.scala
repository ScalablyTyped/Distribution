package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandAccountEventArgs extends js.Object {
  var networkAccountId: String
}

object IMobileBroadbandAccountEventArgs {
  @scala.inline
  def apply(networkAccountId: String): IMobileBroadbandAccountEventArgs = {
    val __obj = js.Dynamic.literal(networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMobileBroadbandAccountEventArgs]
  }
}

