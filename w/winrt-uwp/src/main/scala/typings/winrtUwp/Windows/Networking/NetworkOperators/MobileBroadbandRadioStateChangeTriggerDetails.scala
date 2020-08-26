package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a radio state change notification. */
@js.native
trait MobileBroadbandRadioStateChangeTriggerDetails extends js.Object {
  /** Gets the collection of radio state change details associated with a notification. */
  var radioStateChanges: IVectorView[MobileBroadbandRadioStateChange] = js.native
}

object MobileBroadbandRadioStateChangeTriggerDetails {
  @scala.inline
  def apply(radioStateChanges: IVectorView[MobileBroadbandRadioStateChange]): MobileBroadbandRadioStateChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(radioStateChanges = radioStateChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandRadioStateChangeTriggerDetails]
  }
  @scala.inline
  implicit class MobileBroadbandRadioStateChangeTriggerDetailsOps[Self <: MobileBroadbandRadioStateChangeTriggerDetails] (val x: Self) extends AnyVal {
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
    def setRadioStateChanges(value: IVectorView[MobileBroadbandRadioStateChange]): Self = this.set("radioStateChanges", value.asInstanceOf[js.Any])
  }
  
}

