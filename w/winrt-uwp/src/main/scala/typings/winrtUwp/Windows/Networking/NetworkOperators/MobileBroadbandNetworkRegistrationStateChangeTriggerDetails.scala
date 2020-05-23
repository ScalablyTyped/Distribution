package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network registration state change notification. */
trait MobileBroadbandNetworkRegistrationStateChangeTriggerDetails extends js.Object {
  /** Gets the collection of network registration state changes associated with this notification. */
  var networkRegistrationStateChanges: IVectorView[MobileBroadbandNetworkRegistrationStateChange]
}

object MobileBroadbandNetworkRegistrationStateChangeTriggerDetails {
  @scala.inline
  def apply(networkRegistrationStateChanges: IVectorView[MobileBroadbandNetworkRegistrationStateChange]): MobileBroadbandNetworkRegistrationStateChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(networkRegistrationStateChanges = networkRegistrationStateChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandNetworkRegistrationStateChangeTriggerDetails]
  }
}

