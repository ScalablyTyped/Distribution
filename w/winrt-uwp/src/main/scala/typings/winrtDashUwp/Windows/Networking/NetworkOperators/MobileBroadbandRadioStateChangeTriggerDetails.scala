package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a radio state change notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChangeTriggerDetails")
@js.native
abstract class MobileBroadbandRadioStateChangeTriggerDetails () extends js.Object {
  /** Gets the collection of radio state change details associated with a notification. */
  var radioStateChanges: IVectorView[MobileBroadbandRadioStateChange] = js.native
}

