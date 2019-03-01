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
    showConnectionUI: js.Function0[scala.Unit]
  ): IMobileBroadbandNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessPointName")(accessPointName)
    __obj.updateDynamic("activationNetworkError")(activationNetworkError)
    __obj.updateDynamic("networkAdapter")(networkAdapter)
    __obj.updateDynamic("networkRegistrationState")(networkRegistrationState)
    __obj.updateDynamic("packetAttachNetworkError")(packetAttachNetworkError)
    __obj.updateDynamic("registeredDataClass")(registeredDataClass)
    __obj.updateDynamic("registeredProviderId")(registeredProviderId)
    __obj.updateDynamic("registeredProviderName")(registeredProviderName)
    __obj.updateDynamic("registrationNetworkError")(registrationNetworkError)
    __obj.updateDynamic("showConnectionUI")(showConnectionUI)
    __obj.asInstanceOf[IMobileBroadbandNetwork]
  }
}

