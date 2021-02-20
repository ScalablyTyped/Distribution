package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateBackMiniProgramOptions extends CommonCallbackOptions {
  
  //  需要返回给上一个小程序的数据，上一个小程序可在 App.onShow 中获取到这份数据。
  var extraData: js.Object = js.native
}
object NavigateBackMiniProgramOptions {
  
  @scala.inline
  def apply(extraData: js.Object): NavigateBackMiniProgramOptions = {
    val __obj = js.Dynamic.literal(extraData = extraData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateBackMiniProgramOptions]
  }
  
  @scala.inline
  implicit class NavigateBackMiniProgramOptionsMutableBuilder[Self <: NavigateBackMiniProgramOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraData(value: js.Object): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
  }
}
