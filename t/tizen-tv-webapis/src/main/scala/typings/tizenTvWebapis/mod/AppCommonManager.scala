package typings.tizenTvWebapis.mod

import typings.tizenTvWebapis.anon.SCREENSAVEROFF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppCommonManager extends StObject {
  
  /**
    * Defines constants for screensaver states.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var AppCommonScreenSaverState: SCREENSAVEROFF = js.native
  
  /**
    * Retrieves the plugin version number.
    *
    * @returns DOMString Plugin version
    *
    * @throws None N/A
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getVersion(): String = js.native
  
  /**
    * Sets the screensaver.
    *
    * @param state Screensaver state
    *
    * @param onsuccess Callback method to invoke when the screensaver is set successfully
    *
    * @param onerror Callback method to invoke if an error occurs
    *
    * @returns void
    *
    * @throws WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
    *
    */
  def setScreenSaver(state: AppCommonScreenSaverState): Unit = js.native
  def setScreenSaver(state: AppCommonScreenSaverState, onsuccess: Unit, onerror: ErrorCallback): Unit = js.native
  def setScreenSaver(state: AppCommonScreenSaverState, onsuccess: SuccessCallback): Unit = js.native
  def setScreenSaver(state: AppCommonScreenSaverState, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
}
