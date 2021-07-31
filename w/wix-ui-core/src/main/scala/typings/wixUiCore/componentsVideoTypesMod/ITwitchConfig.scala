package typings.wixUiCore.componentsVideoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITwitchConfig extends StObject {
  
  var playerOptions: js.UndefOr[js.Object] = js.undefined
}
object ITwitchConfig {
  
  @scala.inline
  def apply(): ITwitchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITwitchConfig]
  }
  
  @scala.inline
  implicit class ITwitchConfigMutableBuilder[Self <: ITwitchConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayerOptions(value: js.Object): Self = StObject.set(x, "playerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerOptionsUndefined: Self = StObject.set(x, "playerOptions", js.undefined)
  }
}
