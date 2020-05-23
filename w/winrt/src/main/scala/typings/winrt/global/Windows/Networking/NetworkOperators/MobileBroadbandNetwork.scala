package typings.winrt.global.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandNetwork")
@js.native
class MobileBroadbandNetwork ()
  extends typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandNetwork {
  /* CompleteClass */
  override var accessPointName: String = js.native
  /* CompleteClass */
  override var activationNetworkError: Double = js.native
  /* CompleteClass */
  override var networkAdapter: NetworkAdapter = js.native
  /* CompleteClass */
  override var networkRegistrationState: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState = js.native
  /* CompleteClass */
  override var packetAttachNetworkError: Double = js.native
  /* CompleteClass */
  override var registeredDataClass: typings.winrt.Windows.Networking.NetworkOperators.DataClasses = js.native
  /* CompleteClass */
  override var registeredProviderId: String = js.native
  /* CompleteClass */
  override var registeredProviderName: String = js.native
  /* CompleteClass */
  override var registrationNetworkError: Double = js.native
  /* CompleteClass */
  override def showConnectionUI(): Unit = js.native
}

