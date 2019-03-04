package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandAccountStatics extends js.Object {
  var availableNetworkAccountIds: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  def createFromNetworkAccountId(networkAccountId: java.lang.String): MobileBroadbandAccount
}

object IMobileBroadbandAccountStatics {
  @scala.inline
  def apply(
    availableNetworkAccountIds: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    createFromNetworkAccountId: js.Function1[java.lang.String, MobileBroadbandAccount]
  ): IMobileBroadbandAccountStatics = {
    val __obj = js.Dynamic.literal(availableNetworkAccountIds = availableNetworkAccountIds, createFromNetworkAccountId = createFromNetworkAccountId)
  
    __obj.asInstanceOf[IMobileBroadbandAccountStatics]
  }
}

