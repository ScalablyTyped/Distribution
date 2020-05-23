package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network registration state change notification. */
trait MobileBroadbandPinLockStateChangeTriggerDetails extends js.Object {
  /** Gets the collection of PIN lock state change details associated with a notification. */
  var pinLockStateChanges: IVectorView[MobileBroadbandPinLockStateChange]
}

object MobileBroadbandPinLockStateChangeTriggerDetails {
  @scala.inline
  def apply(pinLockStateChanges: IVectorView[MobileBroadbandPinLockStateChange]): MobileBroadbandPinLockStateChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(pinLockStateChanges = pinLockStateChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPinLockStateChangeTriggerDetails]
  }
}

