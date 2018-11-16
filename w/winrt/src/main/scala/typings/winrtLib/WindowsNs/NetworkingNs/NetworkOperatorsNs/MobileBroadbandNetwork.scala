package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandNetwork")
@js.native
class MobileBroadbandNetwork () extends IMobileBroadbandNetwork {
  /* CompleteClass */
  override var accessPointName: java.lang.String = js.native
  /* CompleteClass */
  override var activationNetworkError: scala.Double = js.native
  /* CompleteClass */
  override var networkAdapter: winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter = js.native
  /* CompleteClass */
  override var networkRegistrationState: NetworkRegistrationState = js.native
  /* CompleteClass */
  override var packetAttachNetworkError: scala.Double = js.native
  /* CompleteClass */
  override var registeredDataClass: DataClasses = js.native
  /* CompleteClass */
  override var registeredProviderId: java.lang.String = js.native
  /* CompleteClass */
  override var registeredProviderName: java.lang.String = js.native
  /* CompleteClass */
  override var registrationNetworkError: scala.Double = js.native
  /* CompleteClass */
  override def showConnectionUI(): scala.Unit = js.native
}

