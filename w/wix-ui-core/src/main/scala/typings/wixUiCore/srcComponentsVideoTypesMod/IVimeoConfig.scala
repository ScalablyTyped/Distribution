package typings.wixUiCore.srcComponentsVideoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVimeoConfig extends StObject {
  
  var playerOptions: js.UndefOr[js.Object] = js.undefined
}
object IVimeoConfig {
  
  @scala.inline
  def apply(): IVimeoConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVimeoConfig]
  }
  
  @scala.inline
  implicit class IVimeoConfigMutableBuilder[Self <: IVimeoConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayerOptions(value: js.Object): Self = StObject.set(x, "playerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerOptionsUndefined: Self = StObject.set(x, "playerOptions", js.undefined)
  }
}
