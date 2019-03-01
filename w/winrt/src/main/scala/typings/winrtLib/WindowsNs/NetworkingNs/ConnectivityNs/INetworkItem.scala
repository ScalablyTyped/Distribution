package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkItem extends js.Object {
  var networkId: java.lang.String
  def getNetworkTypes(): NetworkTypes
}

object INetworkItem {
  @scala.inline
  def apply(getNetworkTypes: js.Function0[NetworkTypes], networkId: java.lang.String): INetworkItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getNetworkTypes")(getNetworkTypes)
    __obj.updateDynamic("networkId")(networkId)
    __obj.asInstanceOf[INetworkItem]
  }
}

