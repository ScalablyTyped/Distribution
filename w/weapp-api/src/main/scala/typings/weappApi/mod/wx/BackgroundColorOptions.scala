package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorOptions extends CommonCallbackOptions {
  
  // 窗口的背景色，必须为十六进制颜色值
  var backgroundColor: js.UndefOr[String] = js.native
  
  //  底部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
  var backgroundColorBottom: js.UndefOr[String] = js.native
  
  // 顶部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
  var backgroundColorTop: js.UndefOr[String] = js.native
}
object BackgroundColorOptions {
  
  @scala.inline
  def apply(): BackgroundColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorOptions]
  }
  
  @scala.inline
  implicit class BackgroundColorOptionsMutableBuilder[Self <: BackgroundColorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorBottom(value: String): Self = StObject.set(x, "backgroundColorBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorBottomUndefined: Self = StObject.set(x, "backgroundColorBottom", js.undefined)
    
    @scala.inline
    def setBackgroundColorTop(value: String): Self = StObject.set(x, "backgroundColorTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorTopUndefined: Self = StObject.set(x, "backgroundColorTop", js.undefined)
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
  }
}
