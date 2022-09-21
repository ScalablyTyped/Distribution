package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerDisplayModeAbilities extends StObject {
  
  /**
    * Represents server's ability to set croppedFull mode.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var croppedFull: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to set fullScreen mode.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var fullScreen: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to set letterBox mode.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var letterBox: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to set originSize mode.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var originSize: MediaControllerAbilitySupport
}
object MediaControllerDisplayModeAbilities {
  
  inline def apply(
    croppedFull: MediaControllerAbilitySupport,
    fullScreen: MediaControllerAbilitySupport,
    letterBox: MediaControllerAbilitySupport,
    originSize: MediaControllerAbilitySupport
  ): MediaControllerDisplayModeAbilities = {
    val __obj = js.Dynamic.literal(croppedFull = croppedFull.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], letterBox = letterBox.asInstanceOf[js.Any], originSize = originSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaControllerDisplayModeAbilities]
  }
  
  extension [Self <: MediaControllerDisplayModeAbilities](x: Self) {
    
    inline def setCroppedFull(value: MediaControllerAbilitySupport): Self = StObject.set(x, "croppedFull", value.asInstanceOf[js.Any])
    
    inline def setFullScreen(value: MediaControllerAbilitySupport): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setLetterBox(value: MediaControllerAbilitySupport): Self = StObject.set(x, "letterBox", value.asInstanceOf[js.Any])
    
    inline def setOriginSize(value: MediaControllerAbilitySupport): Self = StObject.set(x, "originSize", value.asInstanceOf[js.Any])
  }
}
