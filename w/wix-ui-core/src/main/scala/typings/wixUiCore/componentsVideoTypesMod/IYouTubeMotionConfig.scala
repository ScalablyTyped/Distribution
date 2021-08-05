package typings.wixUiCore.componentsVideoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IYouTubeMotionConfig extends StObject {
  
  var playerOptions: js.UndefOr[js.Object] = js.undefined
}
object IYouTubeMotionConfig {
  
  inline def apply(): IYouTubeMotionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IYouTubeMotionConfig]
  }
  
  extension [Self <: IYouTubeMotionConfig](x: Self) {
    
    inline def setPlayerOptions(value: js.Object): Self = StObject.set(x, "playerOptions", value.asInstanceOf[js.Any])
    
    inline def setPlayerOptionsUndefined: Self = StObject.set(x, "playerOptions", js.undefined)
  }
}
