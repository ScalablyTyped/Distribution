package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerDisplayModeAbilitiesInfo extends StObject {
  
  /**
    * Represents server's ability to set croppedFull mode.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  val croppedFull: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to set fullScreen mode.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  val fullScreen: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to set letterBox mode.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  val letterBox: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to set originSize mode.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  val originSize: MediaControllerAbilitySupport
}
object MediaControllerDisplayModeAbilitiesInfo {
  
  inline def apply(
    croppedFull: MediaControllerAbilitySupport,
    fullScreen: MediaControllerAbilitySupport,
    letterBox: MediaControllerAbilitySupport,
    originSize: MediaControllerAbilitySupport
  ): MediaControllerDisplayModeAbilitiesInfo = {
    val __obj = js.Dynamic.literal(croppedFull = croppedFull.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], letterBox = letterBox.asInstanceOf[js.Any], originSize = originSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaControllerDisplayModeAbilitiesInfo]
  }
  
  extension [Self <: MediaControllerDisplayModeAbilitiesInfo](x: Self) {
    
    inline def setCroppedFull(value: MediaControllerAbilitySupport): Self = StObject.set(x, "croppedFull", value.asInstanceOf[js.Any])
    
    inline def setFullScreen(value: MediaControllerAbilitySupport): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setLetterBox(value: MediaControllerAbilitySupport): Self = StObject.set(x, "letterBox", value.asInstanceOf[js.Any])
    
    inline def setOriginSize(value: MediaControllerAbilitySupport): Self = StObject.set(x, "originSize", value.asInstanceOf[js.Any])
  }
}
