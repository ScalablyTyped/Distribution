package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
@js.native
class MobileBroadbandAccount () extends IMobileBroadbandAccount {
  /* CompleteClass */
  override var currentDeviceInformation: MobileBroadbandDeviceInformation = js.native
  /* CompleteClass */
  override var currentNetwork: MobileBroadbandNetwork = js.native
  /* CompleteClass */
  override var networkAccountId: java.lang.String = js.native
  /* CompleteClass */
  override var serviceProviderGuid: java.lang.String = js.native
  /* CompleteClass */
  override var serviceProviderName: java.lang.String = js.native
}

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
@js.native
object MobileBroadbandAccount extends js.Object {
  var availableNetworkAccountIds: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  def createFromNetworkAccountId(networkAccountId: java.lang.String): winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccount = js.native
}

