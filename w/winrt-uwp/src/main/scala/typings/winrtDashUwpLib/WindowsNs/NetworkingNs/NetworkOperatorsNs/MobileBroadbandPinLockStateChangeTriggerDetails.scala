package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network registration state change notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChangeTriggerDetails")
@js.native
abstract class MobileBroadbandPinLockStateChangeTriggerDetails () extends js.Object {
  /** Gets the collection of PIN lock state change details associated with a notification. */
  var pinLockStateChanges: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[MobileBroadbandPinLockStateChange] = js.native
}

