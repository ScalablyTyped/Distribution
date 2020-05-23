package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a mobile broadband PIN operation. */
trait MobileBroadbandPinOperationResult extends js.Object {
  /** Gets the number of PIN entry attempts remaining until the mobile broadband PIN is blocked. */
  var attemptsRemaining: Double
  /** Gets a value indicating whether the PIN operation was successful. */
  var isSuccessful: Boolean
}

object MobileBroadbandPinOperationResult {
  @scala.inline
  def apply(attemptsRemaining: Double, isSuccessful: Boolean): MobileBroadbandPinOperationResult = {
    val __obj = js.Dynamic.literal(attemptsRemaining = attemptsRemaining.asInstanceOf[js.Any], isSuccessful = isSuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPinOperationResult]
  }
}

