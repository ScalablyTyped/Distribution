package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network registration state change notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandNetworkRegistrationStateChangeTriggerDetails")
@js.native
abstract class MobileBroadbandNetworkRegistrationStateChangeTriggerDetails () extends js.Object {
  /** Gets the collection of network registration state changes associated with this notification. */
  var networkRegistrationStateChanges: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[MobileBroadbandNetworkRegistrationStateChange] = js.native
}

