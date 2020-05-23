package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkItem extends INetworkItem

object NetworkItem {
  @scala.inline
  def apply(getNetworkTypes: () => NetworkTypes, networkId: String): NetworkItem = {
    val __obj = js.Dynamic.literal(getNetworkTypes = js.Any.fromFunction0(getNetworkTypes), networkId = networkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkItem]
  }
}

