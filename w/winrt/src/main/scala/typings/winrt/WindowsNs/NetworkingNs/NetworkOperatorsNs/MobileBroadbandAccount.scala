package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
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
  override var networkAccountId: String = js.native
  /* CompleteClass */
  override var serviceProviderGuid: String = js.native
  /* CompleteClass */
  override var serviceProviderName: String = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
@js.native
object MobileBroadbandAccount extends js.Object {
  var availableNetworkAccountIds: IVectorView[String] = js.native
  def createFromNetworkAccountId(networkAccountId: String): MobileBroadbandAccount = js.native
}

