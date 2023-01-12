package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerDisplayRotationInfo extends StObject {
  
  /**
    * Adds the listener for changes of a display rotation of a media controller server.
    *
    * @param listener Display rotation change listener to add.
    *
    * @returns The identifier used to clear the watch subscription.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addDisplayRotationChangeListener(listener: MediaControllerDisplayRotationChangeCallback): Double
  
  /**
    * State of display rotation on the server represented by this object.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val displayRotation: MediaControllerDisplayRotationType
  
  /**
    * Removes the listener, so stop receiving notifications about media controller server display rotation changes.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param watchId Watcher identifier.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def removeDisplayRotationChangeListener(watchId: Double): Unit
  
  /**
    * Allows to send change requests for display rotation change to a media controller server.
    *
    * @remark See [addChangeRequestListener()](#MediaControllerDisplayRotation::addChangeRequestListener) method to check how to receive
    * and respond to commands.
    *
    * @param displayRotation Display rotation, which is requested by client.
    * @param replyCallback The method to invoke when server responded to change request.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type NotSupportedError, if related ability is not supported by server.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendRequest(
    displayRotation: MediaControllerDisplayRotationType,
    replyCallback: MediaControllerSendCommandSuccessCallback
  ): Unit
}
object MediaControllerDisplayRotationInfo {
  
  inline def apply(
    addDisplayRotationChangeListener: MediaControllerDisplayRotationChangeCallback => Double,
    displayRotation: MediaControllerDisplayRotationType,
    removeDisplayRotationChangeListener: Double => Unit,
    sendRequest: (MediaControllerDisplayRotationType, MediaControllerSendCommandSuccessCallback) => Unit
  ): MediaControllerDisplayRotationInfo = {
    val __obj = js.Dynamic.literal(addDisplayRotationChangeListener = js.Any.fromFunction1(addDisplayRotationChangeListener), displayRotation = displayRotation.asInstanceOf[js.Any], removeDisplayRotationChangeListener = js.Any.fromFunction1(removeDisplayRotationChangeListener), sendRequest = js.Any.fromFunction2(sendRequest))
    __obj.asInstanceOf[MediaControllerDisplayRotationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaControllerDisplayRotationInfo] (val x: Self) extends AnyVal {
    
    inline def setAddDisplayRotationChangeListener(value: MediaControllerDisplayRotationChangeCallback => Double): Self = StObject.set(x, "addDisplayRotationChangeListener", js.Any.fromFunction1(value))
    
    inline def setDisplayRotation(value: MediaControllerDisplayRotationType): Self = StObject.set(x, "displayRotation", value.asInstanceOf[js.Any])
    
    inline def setRemoveDisplayRotationChangeListener(value: Double => Unit): Self = StObject.set(x, "removeDisplayRotationChangeListener", js.Any.fromFunction1(value))
    
    inline def setSendRequest(value: (MediaControllerDisplayRotationType, MediaControllerSendCommandSuccessCallback) => Unit): Self = StObject.set(x, "sendRequest", js.Any.fromFunction2(value))
  }
}
