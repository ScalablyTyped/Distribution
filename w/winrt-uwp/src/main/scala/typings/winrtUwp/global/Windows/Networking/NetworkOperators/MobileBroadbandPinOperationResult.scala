package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a mobile broadband PIN operation. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinOperationResult")
@js.native
abstract class MobileBroadbandPinOperationResult ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinOperationResult {
  /** Gets the number of PIN entry attempts remaining until the mobile broadband PIN is blocked. */
  /* CompleteClass */
  override var attemptsRemaining: Double = js.native
  /** Gets a value indicating whether the PIN operation was successful. */
  /* CompleteClass */
  override var isSuccessful: Boolean = js.native
}

