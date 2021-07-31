package typings.wixUiCore.videoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDailyMotionConfig extends StObject {
  
  var playerOptions: js.UndefOr[js.Object] = js.undefined
}
object IDailyMotionConfig {
  
  @scala.inline
  def apply(): IDailyMotionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDailyMotionConfig]
  }
  
  @scala.inline
  implicit class IDailyMotionConfigMutableBuilder[Self <: IDailyMotionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayerOptions(value: js.Object): Self = StObject.set(x, "playerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerOptionsUndefined: Self = StObject.set(x, "playerOptions", js.undefined)
  }
}
