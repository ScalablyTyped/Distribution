package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a mobile broadband PIN operation. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinOperationResult")
@js.native
abstract class MobileBroadbandPinOperationResult () extends js.Object {
  /** Gets the number of PIN entry attempts remaining until the mobile broadband PIN is blocked. */
  var attemptsRemaining: Double = js.native
  /** Gets a value indicating whether the PIN operation was successful. */
  var isSuccessful: Boolean = js.native
}

