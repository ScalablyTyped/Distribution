package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayControlManager extends StObject {
  
  /**
    * Gets the current 3D effect mode.
    *
    * @returns Display3DEffectMode The current mode of 3D effect.
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * This type of error is deprecated since Tizen 5.0.
    * @throws WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throws WebAPIException with error type UnknownError in an unspecified error case.
    *
    * @privilegeLevel 5.0 public
    * @privilegeName 5.0 http://tizen.org/privilege/tv.display
    * @warning 5.0 http://tizen.org/privilege/tv.display (public level) has been deprecated since 5.0.
    */
  def get3DEffectMode(): Display3DEffectMode = js.native
  
  /**
    * Gets the supported 3D effects.
    *
    * @param successCallback The method to invoke when a list of supported 3D modes is retrieved successfully.
    * @param errorCallback The method to invoke when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * This type of error is deprecated since Tizen 5.0.
    * @throws WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @privilegeLevel 5.0 public
    * @privilegeName 5.0 http://tizen.org/privilege/tv.display
    * @warning 5.0 http://tizen.org/privilege/tv.display (public level) has been deprecated since 5.0.
    */
  def getSupported3DEffectModeList(successCallback: Mode3DEffectListSupportCallback): Unit = js.native
  def getSupported3DEffectModeList(successCallback: Mode3DEffectListSupportCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Checks whether playing 3D mode is available or not.
    *
    * @returns Display3DModeState The current state to display 3D contents.
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * This type of error is deprecated since Tizen 5.0.
    * @throws WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throws WebAPIException with error type UnknownError in an unspecified error case.
    *
    * @privilegeLevel 5.0 public
    * @privilegeName 5.0 http://tizen.org/privilege/tv.display
    * @warning 5.0 http://tizen.org/privilege/tv.display (public level) has been deprecated since 5.0.
    */
  def is3DModeEnabled(): Display3DModeState = js.native
}
