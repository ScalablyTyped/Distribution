package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceControlClient extends StObject {
  
  /**
    * Registers a callback function to be called when current language is changed.
    *
    * @param listener Callback function to register.
    *
    * @returns Identifier used to clear the watch subscription.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not
    * compatible with the expected type.
    * @throws WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throws WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def addLanguageChangeListener(listener: VoiceControlLanguageChangeCallback): Double = js.native
  
  /**
    * Registers a listener for getting recognition result.
    *
    * @param listener Callback function to register.
    *
    * @returns Identifier used to clear the watch subscription.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not
    * compatible with the expected type.
    * @throws WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throws WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def addResultListener(listener: VoiceControlResultCallback): Double = js.native
  
  /**
    * Gets current language.
    *
    * A language is specified as an ISO 3166 alpha-2 two letter country-code followed by ISO 639-1 for the two-letter language code.
    * For example, "ko\_KR" for Korean, "en\_US" for American English.
    *
    * @returns Currently set language.
    *
    * @throws WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throws WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def getCurrentLanguage(): String = js.native
  
  /**
    * Releases all resources.
    *
    * Releases listeners and disconnects voice control service.
    * You should call this method when you do not want to use voice control client instance any more.
    * It is necessary to create new voice control client instance, if you want to use more after release.
    *
    * @remark If you call this method, all other VoiceControlClient objects are also released.
    *
    * @throws WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def release(): Unit = js.native
  
  /**
    * Unregisters the callback function.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param id Identifier used to clear the watch subscription.
    *
    * @throws WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throws WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def removeLanguageChangeListener(id: Double): Unit = js.native
  
  /**
    * Unregisters the listener.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param id Identifier used to clear the watch subscription.
    *
    * @throws WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throws WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def removeResultListener(id: Double): Unit = js.native
  
  /**
    * Sets command list.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/recorder
    *
    * @param list Command list handle.
    * @param type Type of registered commands. The default value is "FOREGROUND"
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not
    * compatible with the expected type.
    * @throws WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throws WebAPIException with error type InvalidValuesError, if any of the input
    * parameters contain an invalid value.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def setCommandList(list: js.Array[VoiceControlCommand]): Unit = js.native
  def setCommandList(list: js.Array[VoiceControlCommand], `type`: VoiceControlCommandType): Unit = js.native
  
  /**
    * Unsets command list.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/recorder
    *
    * @param type Type of commands that should be unset. The default value is "FOREGROUND"
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not
    * compatible with the expected type.
    * @throws WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def unsetCommandList(): Unit = js.native
  def unsetCommandList(`type`: VoiceControlCommandType): Unit = js.native
}
