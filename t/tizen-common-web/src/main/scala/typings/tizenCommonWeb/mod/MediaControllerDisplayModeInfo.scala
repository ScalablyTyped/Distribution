package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerDisplayModeInfo extends StObject {
  
  /**
    * Adds the listener for changes of a media controller display mode of a media controller server.
    *
    * @param listener Display mode change listener to add.
    *
    * @returns The identifier used to clear the watch subscription.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addModeChangeListener(listener: MediaControllerDisplayModeChangeCallback): Double
  
  /**
    * Removes the listener, so stop receiving notifications about media controller server display mode changes.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param watchId Watcher identifier.
    *
    * @throws WebAPIException with error type UnknownError, if any error occurs.
    */
  def removeModeChangeListener(watchId: Double): Unit
  
  /**
    * Allows to send change requests for display mode to media controller server.
    *
    * @remark See [addChangeRequestListener()](#MediaControllerDisplayMode::addChangeRequestListener) method to check how to receive
    * and respond to commands.
    *
    * @param type Type of display mode, which is requested by a media controller client.
    * @param replyCallback The method to invoke when server responded to change request.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type NotSupportedError, if related ability is not supported by the media controller server.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendRequest(`type`: MediaControllerDisplayModeType, replyCallback: MediaControllerSendCommandSuccessCallback): Unit
  
  /**
    * Type of display mode on the server represented by this object.
    *
    * @throws WebAPIException with error type UnknownError, if any error occurs.
    */
  val `type`: MediaControllerDisplayModeType
}
object MediaControllerDisplayModeInfo {
  
  inline def apply(
    addModeChangeListener: MediaControllerDisplayModeChangeCallback => Double,
    removeModeChangeListener: Double => Unit,
    sendRequest: (MediaControllerDisplayModeType, MediaControllerSendCommandSuccessCallback) => Unit,
    `type`: MediaControllerDisplayModeType
  ): MediaControllerDisplayModeInfo = {
    val __obj = js.Dynamic.literal(addModeChangeListener = js.Any.fromFunction1(addModeChangeListener), removeModeChangeListener = js.Any.fromFunction1(removeModeChangeListener), sendRequest = js.Any.fromFunction2(sendRequest))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaControllerDisplayModeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaControllerDisplayModeInfo] (val x: Self) extends AnyVal {
    
    inline def setAddModeChangeListener(value: MediaControllerDisplayModeChangeCallback => Double): Self = StObject.set(x, "addModeChangeListener", js.Any.fromFunction1(value))
    
    inline def setRemoveModeChangeListener(value: Double => Unit): Self = StObject.set(x, "removeModeChangeListener", js.Any.fromFunction1(value))
    
    inline def setSendRequest(value: (MediaControllerDisplayModeType, MediaControllerSendCommandSuccessCallback) => Unit): Self = StObject.set(x, "sendRequest", js.Any.fromFunction2(value))
    
    inline def setType(value: MediaControllerDisplayModeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
