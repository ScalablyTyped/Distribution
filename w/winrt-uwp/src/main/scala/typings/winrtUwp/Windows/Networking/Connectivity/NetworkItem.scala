package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connected network. */
@js.native
trait NetworkItem extends js.Object {
  /** Gets the network ID. */
  var networkId: String = js.native
  /**
    * Gets a NetworkTypes value indicating the network type for a NetworkItem .
    * @return The type of a network.
    */
  def getNetworkTypes(): NetworkTypes = js.native
}

object NetworkItem {
  @scala.inline
  def apply(getNetworkTypes: () => NetworkTypes, networkId: String): NetworkItem = {
    val __obj = js.Dynamic.literal(getNetworkTypes = js.Any.fromFunction0(getNetworkTypes), networkId = networkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkItem]
  }
  @scala.inline
  implicit class NetworkItemOps[Self <: NetworkItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetNetworkTypes(value: () => NetworkTypes): Self = this.set("getNetworkTypes", js.Any.fromFunction0(value))
    @scala.inline
    def setNetworkId(value: String): Self = this.set("networkId", value.asInstanceOf[js.Any])
  }
  
}

