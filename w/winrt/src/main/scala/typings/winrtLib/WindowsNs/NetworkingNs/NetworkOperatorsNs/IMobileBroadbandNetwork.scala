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

