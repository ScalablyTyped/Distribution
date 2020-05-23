package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network registration state change notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChangeTriggerDetails")
@js.native
abstract class MobileBroadbandPinLockStateChangeTriggerDetails ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChangeTriggerDetails {
  /** Gets the collection of PIN lock state change details associated with a notification. */
  /* CompleteClass */
  override var pinLockStateChanges: IVectorView[
    typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChange
  ] = js.native
}

