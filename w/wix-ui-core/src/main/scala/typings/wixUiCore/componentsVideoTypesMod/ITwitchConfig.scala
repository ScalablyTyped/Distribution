package typings.wixUiCore.componentsVideoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITwitchConfig extends StObject {
  
  var playerOptions: js.UndefOr[js.Object] = js.undefined
}
object ITwitchConfig {
  
  inline def apply(): ITwitchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITwitchConfig]
  }
  
  extension [Self <: ITwitchConfig](x: Self) {
    
    inline def setPlayerOptions(value: js.Object): Self = StObject.set(x, "playerOptions", value.asInstanceOf[js.Any])
    
    inline def setPlayerOptionsUndefined: Self = StObject.set(x, "playerOptions", js.undefined)
  }
}
