package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerDisplayRotationAbilities extends StObject {
  
  /**
    * Represents the server's ability to set 180° display orientation.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var rotation180: MediaControllerAbilitySupport
  
  /**
    * Represents the server's ability to set 270° display orientation.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var rotation270: MediaControllerAbilitySupport
  
  /**
    * Represents the server's ability to set 90° display orientation.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var rotation90: MediaControllerAbilitySupport
  
  /**
    * Represents the server's ability to set 0° display orientation.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var rotationNone: MediaControllerAbilitySupport
}
object MediaControllerDisplayRotationAbilities {
  
  inline def apply(
    rotation180: MediaControllerAbilitySupport,
    rotation270: MediaControllerAbilitySupport,
    rotation90: MediaControllerAbilitySupport,
    rotationNone: MediaControllerAbilitySupport
  ): MediaControllerDisplayRotationAbilities = {
    val __obj = js.Dynamic.literal(rotation180 = rotation180.asInstanceOf[js.Any], rotation270 = rotation270.asInstanceOf[js.Any], rotation90 = rotation90.asInstanceOf[js.Any], rotationNone = rotationNone.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaControllerDisplayRotationAbilities]
  }
  
  extension [Self <: MediaControllerDisplayRotationAbilities](x: Self) {
    
    inline def setRotation180(value: MediaControllerAbilitySupport): Self = StObject.set(x, "rotation180", value.asInstanceOf[js.Any])
    
    inline def setRotation270(value: MediaControllerAbilitySupport): Self = StObject.set(x, "rotation270", value.asInstanceOf[js.Any])
    
    inline def setRotation90(value: MediaControllerAbilitySupport): Self = StObject.set(x, "rotation90", value.asInstanceOf[js.Any])
    
    inline def setRotationNone(value: MediaControllerAbilitySupport): Self = StObject.set(x, "rotationNone", value.asInstanceOf[js.Any])
  }
}
