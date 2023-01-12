package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerDisplayRotationAbilitiesInfo extends StObject {
  
  /**
    * Represents the server's ability to set 180° display orientation.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val rotation180: MediaControllerAbilitySupport
  
  /**
    * Represents the server's ability to set 270° display orientation.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val rotation270: MediaControllerAbilitySupport
  
  /**
    * Represents the server's ability to set 90° display orientation.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val rotation90: MediaControllerAbilitySupport
  
  /**
    * Represents the server's ability to set 0° display orientation.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val rotationNone: MediaControllerAbilitySupport
}
object MediaControllerDisplayRotationAbilitiesInfo {
  
  inline def apply(
    rotation180: MediaControllerAbilitySupport,
    rotation270: MediaControllerAbilitySupport,
    rotation90: MediaControllerAbilitySupport,
    rotationNone: MediaControllerAbilitySupport
  ): MediaControllerDisplayRotationAbilitiesInfo = {
    val __obj = js.Dynamic.literal(rotation180 = rotation180.asInstanceOf[js.Any], rotation270 = rotation270.asInstanceOf[js.Any], rotation90 = rotation90.asInstanceOf[js.Any], rotationNone = rotationNone.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaControllerDisplayRotationAbilitiesInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaControllerDisplayRotationAbilitiesInfo] (val x: Self) extends AnyVal {
    
    inline def setRotation180(value: MediaControllerAbilitySupport): Self = StObject.set(x, "rotation180", value.asInstanceOf[js.Any])
    
    inline def setRotation270(value: MediaControllerAbilitySupport): Self = StObject.set(x, "rotation270", value.asInstanceOf[js.Any])
    
    inline def setRotation90(value: MediaControllerAbilitySupport): Self = StObject.set(x, "rotation90", value.asInstanceOf[js.Any])
    
    inline def setRotationNone(value: MediaControllerAbilitySupport): Self = StObject.set(x, "rotationNone", value.asInstanceOf[js.Any])
  }
}
