package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the properties and methods associated with a mobile broadband PIN. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPin")
@js.native
abstract class MobileBroadbandPin ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPin {
  
  /** Gets the number of attempts remaining before the mobile broadband PIN is blocked. */
  /* CompleteClass */
  var attemptsRemaining: Double = js.native
  
  /**
    * Starts an asynchronous operation to change an already-enabled mobile broadband PIN.
    * @param currentPin The current mobile broadband PIN.
    * @param newPin The new mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  /* CompleteClass */
  override def changeAsync(currentPin: String, newPin: String): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinOperationResult
  ] = js.native
  
  /**
    * Starts an asynchronous operation to disable a previously-enabled mobile broadband PIN.
    * @param currentPin The current mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  /* CompleteClass */
  override def disableAsync(currentPin: String): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinOperationResult
  ] = js.native
  
  /**
    * Starts an asynchronous operation to enable a previously-disabled mobile broadband PIN.
    * @param currentPin The current mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  /* CompleteClass */
  override def enableAsync(currentPin: String): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinOperationResult
  ] = js.native
  
  /** Gets a boolean value that indicates if the mobile broadband PIN is enabled. */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /**
    * Starts an asynchronous operation to get the current mobile broadband PIN from the user.
    * @param currentPin The current mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  /* CompleteClass */
  override def enterAsync(currentPin: String): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinOperationResult
  ] = js.native
  
  /** Gets the format for a mobile broadband PIN. */
  /* CompleteClass */
  var format: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinFormat = js.native
  
  /** Gets the lock state for a mobile broadband PIN. */
  /* CompleteClass */
  var lockState: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockState = js.native
  
  /** Gets the maximum length, in bytes, of the mobile broadband PIN. */
  /* CompleteClass */
  var maxLength: Double = js.native
  
  /** Gets the minimum length, in bytes, of the mobile broadband PIN. */
  /* CompleteClass */
  var minLength: Double = js.native
  
  /** Gets the PIN type for a mobile broadband PIN. */
  /* CompleteClass */
  var `type`: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType = js.native
  
  /**
    * Starts an asynchronous operation to unblock a previously-blocked mobile broadband PIN using a PIN unlock key (PUK).
    * @param pinUnblockKey The PIN unblock key.
    * @param newPin The new mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  /* CompleteClass */
  override def unblockAsync(pinUnblockKey: String, newPin: String): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinOperationResult
  ] = js.native
}
