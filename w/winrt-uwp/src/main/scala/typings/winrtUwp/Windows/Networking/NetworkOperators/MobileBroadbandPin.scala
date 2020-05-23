package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the properties and methods associated with a mobile broadband PIN. */
trait MobileBroadbandPin extends js.Object {
  /** Gets the number of attempts remaining before the mobile broadband PIN is blocked. */
  var attemptsRemaining: Double
  /** Gets a boolean value that indicates if the mobile broadband PIN is enabled. */
  var enabled: Boolean
  /** Gets the format for a mobile broadband PIN. */
  var format: MobileBroadbandPinFormat
  /** Gets the lock state for a mobile broadband PIN. */
  var lockState: MobileBroadbandPinLockState
  /** Gets the maximum length, in bytes, of the mobile broadband PIN. */
  var maxLength: Double
  /** Gets the minimum length, in bytes, of the mobile broadband PIN. */
  var minLength: Double
  /** Gets the PIN type for a mobile broadband PIN. */
  var `type`: MobileBroadbandPinType
  /**
    * Starts an asynchronous operation to change an already-enabled mobile broadband PIN.
    * @param currentPin The current mobile broadband PIN.
    * @param newPin The new mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def changeAsync(currentPin: String, newPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult]
  /**
    * Starts an asynchronous operation to disable a previously-enabled mobile broadband PIN.
    * @param currentPin The current mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def disableAsync(currentPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult]
  /**
    * Starts an asynchronous operation to enable a previously-disabled mobile broadband PIN.
    * @param currentPin The current mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def enableAsync(currentPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult]
  /**
    * Starts an asynchronous operation to get the current mobile broadband PIN from the user.
    * @param currentPin The current mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def enterAsync(currentPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult]
  /**
    * Starts an asynchronous operation to unblock a previously-blocked mobile broadband PIN using a PIN unlock key (PUK).
    * @param pinUnblockKey The PIN unblock key.
    * @param newPin The new mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def unblockAsync(pinUnblockKey: String, newPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult]
}

object MobileBroadbandPin {
  @scala.inline
  def apply(
    attemptsRemaining: Double,
    changeAsync: (String, String) => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult],
    disableAsync: String => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult],
    enableAsync: String => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult],
    enabled: Boolean,
    enterAsync: String => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult],
    format: MobileBroadbandPinFormat,
    lockState: MobileBroadbandPinLockState,
    maxLength: Double,
    minLength: Double,
    `type`: MobileBroadbandPinType,
    unblockAsync: (String, String) => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult]
  ): MobileBroadbandPin = {
    val __obj = js.Dynamic.literal(attemptsRemaining = attemptsRemaining.asInstanceOf[js.Any], changeAsync = js.Any.fromFunction2(changeAsync), disableAsync = js.Any.fromFunction1(disableAsync), enableAsync = js.Any.fromFunction1(enableAsync), enabled = enabled.asInstanceOf[js.Any], enterAsync = js.Any.fromFunction1(enterAsync), format = format.asInstanceOf[js.Any], lockState = lockState.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], unblockAsync = js.Any.fromFunction2(unblockAsync))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPin]
  }
}

