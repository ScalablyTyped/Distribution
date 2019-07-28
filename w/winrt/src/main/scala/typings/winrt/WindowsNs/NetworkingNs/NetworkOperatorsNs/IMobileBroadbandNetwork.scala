package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter
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
    val __obj = js.Dynamic.literal(accessPointName = accessPointName, activationNetworkError = activationNetworkError, networkAdapter = networkAdapter, networkRegistrationState = networkRegistrationState, packetAttachNetworkError = packetAttachNetworkError, registeredDataClass = registeredDataClass, registeredProviderId = registeredProviderId, registeredProviderName = registeredProviderName, registrationNetworkError = registrationNetworkError, showConnectionUI = js.Any.fromFunction0(showConnectionUI))
  
    __obj.asInstanceOf[IMobileBroadbandNetwork]
  }
}

