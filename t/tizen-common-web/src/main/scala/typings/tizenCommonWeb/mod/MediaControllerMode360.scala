package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerMode360 extends StObject {
  
  /**
    * Adds the listener for change requests of a media controller spherical (360°) mode.
    *
    * @remark Remember to set corresponding server's [MediaControllerAbilities.mode360](#MediaControllerAbilities) ability
    * to "YES" to let clients send change requests to the server.
    *
    * @param listener Change request listener to add.
    *
    * @returns The identifier used to remove the listener.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addChangeRequestListener(listener: MediaControllerEnabledChangeRequestCallback): Double
  
  /**
    * State of spherical (360°) mode on the server. Default value for a newly created server is false.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  var enabled: Boolean
  
  /**
    * Removes the listener and stops receiving change requests of media controller spherical (360°) mode.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param watchId Watcher identifier.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def removeChangeRequestListener(watchId: Double): Unit
}
object MediaControllerMode360 {
  
  inline def apply(
    addChangeRequestListener: MediaControllerEnabledChangeRequestCallback => Double,
    enabled: Boolean,
    removeChangeRequestListener: Double => Unit
  ): MediaControllerMode360 = {
    val __obj = js.Dynamic.literal(addChangeRequestListener = js.Any.fromFunction1(addChangeRequestListener), enabled = enabled.asInstanceOf[js.Any], removeChangeRequestListener = js.Any.fromFunction1(removeChangeRequestListener))
    __obj.asInstanceOf[MediaControllerMode360]
  }
  
  extension [Self <: MediaControllerMode360](x: Self) {
    
    inline def setAddChangeRequestListener(value: MediaControllerEnabledChangeRequestCallback => Double): Self = StObject.set(x, "addChangeRequestListener", js.Any.fromFunction1(value))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setRemoveChangeRequestListener(value: Double => Unit): Self = StObject.set(x, "removeChangeRequestListener", js.Any.fromFunction1(value))
  }
}
