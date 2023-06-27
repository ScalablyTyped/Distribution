package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerDisplayMode extends StObject {
  
  /**
    * Adds the listener for change requests of the media controller display mode.
    *
    * @remark Remember to set corresponding server's [display mode ability](#MediaControllerDisplayModeAbilities) to
    * "YES" to let clients send change requests to the server.
    *
    * @param listener Change request listener to add.
    *
    * @returns The identifier used to remove the listener.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addChangeRequestListener(listener: MediaControllerDisplayModeChangeRequestCallback): Double
  
  /**
    * Removes the listener and stops receiving change requests of media controller display mode.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param watchId Watcher identifier.
    *
    * @throws WebAPIException with error type UnknownError, if any error occurs.
    */
  def removeChangeRequestListener(watchId: Double): Unit
  
  /**
    * Type of display mode on the server. Default value for a newly created server is "FULL\_SCREEN".
    *
    * @throws WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  var `type`: MediaControllerDisplayModeType
}
object MediaControllerDisplayMode {
  
  inline def apply(
    addChangeRequestListener: MediaControllerDisplayModeChangeRequestCallback => Double,
    removeChangeRequestListener: Double => Unit,
    `type`: MediaControllerDisplayModeType
  ): MediaControllerDisplayMode = {
    val __obj = js.Dynamic.literal(addChangeRequestListener = js.Any.fromFunction1(addChangeRequestListener), removeChangeRequestListener = js.Any.fromFunction1(removeChangeRequestListener))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaControllerDisplayMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaControllerDisplayMode] (val x: Self) extends AnyVal {
    
    inline def setAddChangeRequestListener(value: MediaControllerDisplayModeChangeRequestCallback => Double): Self = StObject.set(x, "addChangeRequestListener", js.Any.fromFunction1(value))
    
    inline def setRemoveChangeRequestListener(value: Double => Unit): Self = StObject.set(x, "removeChangeRequestListener", js.Any.fromFunction1(value))
    
    inline def setType(value: MediaControllerDisplayModeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
