package typings.wixUiCore.componentsVideoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDailyMotionConfig extends StObject {
  
  var playerOptions: js.UndefOr[js.Object] = js.undefined
}
object IDailyMotionConfig {
  
  inline def apply(): IDailyMotionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDailyMotionConfig]
  }
  
  extension [Self <: IDailyMotionConfig](x: Self) {
    
    inline def setPlayerOptions(value: js.Object): Self = StObject.set(x, "playerOptions", value.asInstanceOf[js.Any])
    
    inline def setPlayerOptionsUndefined: Self = StObject.set(x, "playerOptions", js.undefined)
  }
}
