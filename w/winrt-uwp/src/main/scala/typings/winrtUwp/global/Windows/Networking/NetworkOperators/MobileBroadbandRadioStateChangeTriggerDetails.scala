package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a radio state change notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChangeTriggerDetails")
@js.native
abstract class MobileBroadbandRadioStateChangeTriggerDetails ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChangeTriggerDetails {
  /** Gets the collection of radio state change details associated with a notification. */
  /* CompleteClass */
  override var radioStateChanges: IVectorView[
    typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChange
  ] = js.native
}

