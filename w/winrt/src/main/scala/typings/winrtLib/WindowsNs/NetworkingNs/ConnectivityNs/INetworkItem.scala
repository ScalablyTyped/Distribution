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
  def apply(getNetworkTypes: () => NetworkTypes, networkId: java.lang.String): INetworkItem = {
    val __obj = js.Dynamic.literal(getNetworkTypes = js.Any.fromFunction0(getNetworkTypes), networkId = networkId)
  
    __obj.asInstanceOf[INetworkItem]
  }
}

