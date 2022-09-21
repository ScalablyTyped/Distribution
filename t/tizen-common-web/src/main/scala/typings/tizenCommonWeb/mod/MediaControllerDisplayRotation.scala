package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerDisplayRotation extends StObject {
  
  /**
    * Adds the listener for change requests of a media controller display rotation.
    *
    * @remark Remember to set corresponding server's [display rotation ability](#MediaControllerDisplayRotationAbilities) to
    * "YES" to let clients send change requests to the server.
    *
    * @param listener Change request listener to add.
    *
    * @returns The identifier used to remove the listener.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addChangeRequestListener(listener: MediaControllerDisplayRotationChangeRequestCallback): Double
  
  /**
    * State of display rotation on the server. Default value for a newly created server is "ROTATION\_NONE".
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var displayRotation: MediaControllerDisplayRotationType
  
  /**
    * Removes the listener and stops receiving change requests of media controller display rotation.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param watchId Watcher identifier.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def removeChangeRequestListener(watchId: Double): Unit
}
object MediaControllerDisplayRotation {
  
  inline def apply(
    addChangeRequestListener: MediaControllerDisplayRotationChangeRequestCallback => Double,
    displayRotation: MediaControllerDisplayRotationType,
    removeChangeRequestListener: Double => Unit
  ): MediaControllerDisplayRotation = {
    val __obj = js.Dynamic.literal(addChangeRequestListener = js.Any.fromFunction1(addChangeRequestListener), displayRotation = displayRotation.asInstanceOf[js.Any], removeChangeRequestListener = js.Any.fromFunction1(removeChangeRequestListener))
    __obj.asInstanceOf[MediaControllerDisplayRotation]
  }
  
  extension [Self <: MediaControllerDisplayRotation](x: Self) {
    
    inline def setAddChangeRequestListener(value: MediaControllerDisplayRotationChangeRequestCallback => Double): Self = StObject.set(x, "addChangeRequestListener", js.Any.fromFunction1(value))
    
    inline def setDisplayRotation(value: MediaControllerDisplayRotationType): Self = StObject.set(x, "displayRotation", value.asInstanceOf[js.Any])
    
    inline def setRemoveChangeRequestListener(value: Double => Unit): Self = StObject.set(x, "removeChangeRequestListener", js.Any.fromFunction1(value))
  }
}
