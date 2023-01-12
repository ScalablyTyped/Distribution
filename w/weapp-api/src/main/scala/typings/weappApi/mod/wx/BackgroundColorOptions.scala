package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorOptions
  extends StObject
     with CommonCallbackOptions {
  
  // 窗口的背景色，必须为十六进制颜色值
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  //  底部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
  var backgroundColorBottom: js.UndefOr[String] = js.undefined
  
  // 顶部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
  var backgroundColorTop: js.UndefOr[String] = js.undefined
}
object BackgroundColorOptions {
  
  inline def apply(): BackgroundColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundColorOptions] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorBottom(value: String): Self = StObject.set(x, "backgroundColorBottom", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorBottomUndefined: Self = StObject.set(x, "backgroundColorBottom", js.undefined)
    
    inline def setBackgroundColorTop(value: String): Self = StObject.set(x, "backgroundColorTop", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorTopUndefined: Self = StObject.set(x, "backgroundColorTop", js.undefined)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
  }
}
