package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandNetwork extends js.Object {
  var accessPointName: java.lang.String
  var activationNetworkError: scala.Double
  var networkAdapter: winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter
  var networkRegistrationState: NetworkRegistrationState
  var packetAttachNetworkError: scala.Double
  var registeredDataClass: DataClasses
  var registeredProviderId: java.lang.String
  var registeredProviderName: java.lang.String
  var registrationNetworkError: scala.Double
  def showConnectionUI(): scala.Unit
}

object IMobileBroadbandNetwork {
  @scala.inline
  def apply(
    accessPointName: java.lang.String,
    activationNetworkError: scala.Double,
    networkAdapter: winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter,
    networkRegistrationState: NetworkRegistrationState,
    packetAttachNetworkError: scala.Double,
    registeredDataClass: DataClasses,
    registeredProviderId: java.lang.String,
    registeredProviderName: java.lang.String,
    registrationNetworkError: scala.Double,
    showConnectionUI: () => scala.Unit
  ): IMobileBroadbandNetwork = {
    val __obj = js.Dynamic.literal(accessPointName = accessPointName, activationNetworkError = activationNetworkError, networkAdapter = networkAdapter, networkRegistrationState = networkRegistrationState, packetAttachNetworkError = packetAttachNetworkError, registeredDataClass = registeredDataClass, registeredProviderId = registeredProviderId, registeredProviderName = registeredProviderName, registrationNetworkError = registrationNetworkError, showConnectionUI = js.Any.fromFunction0(showConnectionUI))
  
    __obj.asInstanceOf[IMobileBroadbandNetwork]
  }
}

