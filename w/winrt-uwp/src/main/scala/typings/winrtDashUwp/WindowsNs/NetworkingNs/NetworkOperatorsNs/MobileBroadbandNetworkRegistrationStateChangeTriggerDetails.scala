package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network registration state change notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandNetworkRegistrationStateChangeTriggerDetails")
@js.native
abstract class MobileBroadbandNetworkRegistrationStateChangeTriggerDetails () extends js.Object {
  /** Gets the collection of network registration state changes associated with this notification. */
  var networkRegistrationStateChanges: IVectorView[MobileBroadbandNetworkRegistrationStateChange] = js.native
}

