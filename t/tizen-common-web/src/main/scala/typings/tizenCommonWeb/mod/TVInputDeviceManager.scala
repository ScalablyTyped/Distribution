package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TVInputDeviceManager extends StObject {
  
  /**
    * Returns information about the key which has the given name.
    *
    * @param keyName The name of the key to retrieve.
    *
    * @returns InputDeviceKey InputDeviceKey object for the given key name, or null if the key is not supported.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type InvalidValuesError if the given keyName is invalid (e.g. name is empty string).
    * @throw WebAPIException with error type UnknownError in any other error case.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.inputdevice
    */
  def getKey(keyName: InputDeviceKeyName): InputDeviceKey | Null = js.native
  
  /**
    * Retrieves the list of keys can be registered with the _registerKey()_ method.
    *
    * Mandatory keys will not be retrieved by this method.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError in case of any error.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.inputdevice
    */
  def getSupportedKeys(): js.Array[InputDeviceKey] = js.native
  
  /**
    * Registers an input device key to receive DOM keyboard event when it is pressed or released.
    *
    * When an application wants to react to the Input Device keys being pressed, it should register this key.
    *
    * An application cannot register the mandatory keys (ArrowLeft, ArrowRight, ArrowUp, ArrowDown, Enter, Back).
    *
    * @param keyName The name of the key which should generate DOM key events when pressed.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type InvalidValuesError, if the given keyName is invalid or not supported (e.g. name is empty string).
    * @throw WebAPIException with error type UnknownError in any other error case.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.inputdevice
    */
  def registerKey(keyName: InputDeviceKeyName): Unit = js.native
  
  /**
    * Registers a batch of input device keys to receive DOM keyboard events when any of them is pressed or released.
    *
    * When an application wants to react to the input device key presses, it should register those keys.
    *
    * An application cannot register the mandatory keys (ArrowLeft, ArrowRight, ArrowUp, ArrowDown, Enter, Back).
    *
    * The errorCallback is launched with this error type:
    *
    * *   InvalidValuesError: If any of the given keyNames is invalid or not supported.
    * *   UnknownError: In case of any other error.
    *
    *
    * @since 2.4
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.inputdevice
    *
    * @param keyNames The array with the names of the keys which will generate DOM key events when they are pressed.
    * @param successCallback Callback method to be invoked when keys are registered.
    * @param errorCallback Callback method to be invoked when an error has occurred.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type InvalidValuesError, if any of the given keyNames is invalid or not supported (e.g. name is empty string).
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError in any other error case.
    */
  def registerKeyBatch(keyNames: js.Array[InputDeviceKeyName]): Unit = js.native
  def registerKeyBatch(keyNames: js.Array[InputDeviceKeyName], successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def registerKeyBatch(keyNames: js.Array[InputDeviceKeyName], successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def registerKeyBatch(keyNames: js.Array[InputDeviceKeyName], successCallback: SuccessCallback): Unit = js.native
  def registerKeyBatch(
    keyNames: js.Array[InputDeviceKeyName],
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Unregisters an input device key.
    *
    * @param keyName The name of the key which should not be monitored any longer.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type InvalidValuesError, if the given keyName is invalid or not supported (e.g. name is empty string).
    * @throw WebAPIException with error type UnknownError in any error case.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.inputdevice
    */
  def unregisterKey(keyName: InputDeviceKeyName): Unit = js.native
  
  /**
    * Unregisters a batch of input device keys.
    *
    * The errorCallback is launched with this error type:
    *
    * *   InvalidValuesError: If any of the given keyNames is invalid or not supported.
    * *   UnknownError: In case of any other error.
    *
    *
    * @param keyNames The array with the names of the keys to unregister.
    * @param successCallback Callback method to be invoked when keys are unregistered.
    * @param errorCallback Callback method to be invoked when an error has occurred.
    *
    * @since 2.4
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.inputdevice
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type InvalidValuesError, if any of the given keyNames is invalid or not supported (e.g. name is empty string).
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError in any error case.
    */
  def unregisterKeyBatch(keyNames: js.Array[InputDeviceKeyName]): Unit = js.native
  def unregisterKeyBatch(keyNames: js.Array[InputDeviceKeyName], successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def unregisterKeyBatch(keyNames: js.Array[InputDeviceKeyName], successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def unregisterKeyBatch(keyNames: js.Array[InputDeviceKeyName], successCallback: SuccessCallback): Unit = js.native
  def unregisterKeyBatch(
    keyNames: js.Array[InputDeviceKeyName],
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
}
