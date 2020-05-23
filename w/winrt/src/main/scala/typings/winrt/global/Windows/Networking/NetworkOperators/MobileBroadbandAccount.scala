package typings.winrt.global.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
@js.native
class MobileBroadbandAccount ()
  extends typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccount {
  /* CompleteClass */
  override var currentDeviceInformation: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation = js.native
  /* CompleteClass */
  override var currentNetwork: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandNetwork = js.native
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
  def createFromNetworkAccountId(networkAccountId: String): typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccount = js.native
}

