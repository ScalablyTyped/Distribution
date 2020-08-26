package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network registration state change notification. */
@js.native
trait MobileBroadbandPinLockStateChangeTriggerDetails extends js.Object {
  /** Gets the collection of PIN lock state change details associated with a notification. */
  var pinLockStateChanges: IVectorView[MobileBroadbandPinLockStateChange] = js.native
}

object MobileBroadbandPinLockStateChangeTriggerDetails {
  @scala.inline
  def apply(pinLockStateChanges: IVectorView[MobileBroadbandPinLockStateChange]): MobileBroadbandPinLockStateChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(pinLockStateChanges = pinLockStateChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPinLockStateChangeTriggerDetails]
  }
  @scala.inline
  implicit class MobileBroadbandPinLockStateChangeTriggerDetailsOps[Self <: MobileBroadbandPinLockStateChangeTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPinLockStateChanges(value: IVectorView[MobileBroadbandPinLockStateChange]): Self = this.set("pinLockStateChanges", value.asInstanceOf[js.Any])
  }
  
}

