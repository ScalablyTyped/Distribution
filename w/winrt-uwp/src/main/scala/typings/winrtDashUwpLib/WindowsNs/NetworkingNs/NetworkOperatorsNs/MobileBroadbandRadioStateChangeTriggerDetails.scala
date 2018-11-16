package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a radio state change notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChangeTriggerDetails")
@js.native
abstract class MobileBroadbandRadioStateChangeTriggerDetails () extends js.Object {
  /** Gets the collection of radio state change details associated with a notification. */
  var radioStateChanges: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[MobileBroadbandRadioStateChange] = js.native
}

