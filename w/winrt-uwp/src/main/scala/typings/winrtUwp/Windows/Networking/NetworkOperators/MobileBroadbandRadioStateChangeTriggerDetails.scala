package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a radio state change notification. */
trait MobileBroadbandRadioStateChangeTriggerDetails extends js.Object {
  /** Gets the collection of radio state change details associated with a notification. */
  var radioStateChanges: IVectorView[MobileBroadbandRadioStateChange]
}

object MobileBroadbandRadioStateChangeTriggerDetails {
  @scala.inline
  def apply(radioStateChanges: IVectorView[MobileBroadbandRadioStateChange]): MobileBroadbandRadioStateChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(radioStateChanges = radioStateChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandRadioStateChangeTriggerDetails]
  }
}

