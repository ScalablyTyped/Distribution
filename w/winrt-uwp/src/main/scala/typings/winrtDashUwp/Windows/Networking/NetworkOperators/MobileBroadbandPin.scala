package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the properties and methods associated with a mobile broadband PIN. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPin")
@js.native
abstract class MobileBroadbandPin () extends js.Object {
  /** Gets the number of attempts remaining before the mobile broadband PIN is blocked. */
  var attemptsRemaining: Double = js.native
  /** Gets a boolean value that indicates if the mobile broadband PIN is enabled. */
  var enabled: Boolean = js.native
  /** Gets the format for a mobile broadband PIN. */
  var format: MobileBroadbandPinFormat = js.native
  /** Gets the lock state for a mobile broadband PIN. */
  var lockState: MobileBroadbandPinLockState = js.native
  /** Gets the maximum length, in bytes, of the mobile broadband PIN. */
  var maxLength: Double = js.native
  /** Gets the minimum length, in bytes, of the mobile broadband PIN. */
  var minLength: Double = js.native
  /** Gets the PIN type for a mobile broadband PIN. */
  var `type`: MobileBroadbandPinType = js.native
  /**
    * Starts an asynchronous operation to change an already-enabled mobile broadband PIN.
    * @param currentPin The current mobile broadband PIN.
    * @param newPin The new mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def changeAsync(currentPin: String, newPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult] = js.native
  /**
    * Starts an asynchronous operation to disable a previously-enabled mobile broadband PIN.
    * @param currentPin The current mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def disableAsync(currentPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult] = js.native
  /**
    * Starts an asynchronous operation to enable a previously-disabled mobile broadband PIN.
    * @param currentPin The current mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def enableAsync(currentPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult] = js.native
  /**
    * Starts an asynchronous operation to get the current mobile broadband PIN from the user.
    * @param currentPin The current mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def enterAsync(currentPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult] = js.native
  /**
    * Starts an asynchronous operation to unblock a previously-blocked mobile broadband PIN using a PIN unlock key (PUK).
    * @param pinUnblockKey The PIN unblock key.
    * @param newPin The new mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def unblockAsync(pinUnblockKey: String, newPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult] = js.native
}

