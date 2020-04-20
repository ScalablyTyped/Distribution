package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandNetwork extends js.Object {
  var accessPointName: String
  var activationNetworkError: Double
  var networkAdapter: NetworkAdapter
  var networkRegistrationState: NetworkRegistrationState
  var packetAttachNetworkError: Double
  var registeredDataClass: DataClasses
  var registeredProviderId: String
  var registeredProviderName: String
  var registrationNetworkError: Double
  def showConnectionUI(): Unit
}

object IMobileBroadbandNetwork {
  @scala.inline
  def apply(
    accessPointName: String,
    activationNetworkError: Double,
    networkAdapter: NetworkAdapter,
    networkRegistrationState: NetworkRegistrationState,
    packetAttachNetworkError: Double,
    registeredDataClass: DataClasses,
    registeredProviderId: String,
    registeredProviderName: String,
    registrationNetworkError: Double,
    showConnectionUI: () => Unit
  ): IMobileBroadbandNetwork = {
    val __obj = js.Dynamic.literal(accessPointName = accessPointName.asInstanceOf[js.Any], activationNetworkError = activationNetworkError.asInstanceOf[js.Any], networkAdapter = networkAdapter.asInstanceOf[js.Any], networkRegistrationState = networkRegistrationState.asInstanceOf[js.Any], packetAttachNetworkError = packetAttachNetworkError.asInstanceOf[js.Any], registeredDataClass = registeredDataClass.asInstanceOf[js.Any], registeredProviderId = registeredProviderId.asInstanceOf[js.Any], registeredProviderName = registeredProviderName.asInstanceOf[js.Any], registrationNetworkError = registrationNetworkError.asInstanceOf[js.Any], showConnectionUI = js.Any.fromFunction0(showConnectionUI))
    __obj.asInstanceOf[IMobileBroadbandNetwork]
  }
}

