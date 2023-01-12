package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.dark
import typings.wechatMiniprogram.wechatMiniprogramStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnThemeChangeCallbackResult extends StObject {
  
  /** 系统当前的主题，取值为`light`或`dark`
    *
    * 可选值：
    * - 'dark': 深色主题;
    * - 'light': 浅色主题; */
  var theme: dark | light
}
object OnThemeChangeCallbackResult {
  
  inline def apply(theme: dark | light): OnThemeChangeCallbackResult = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnThemeChangeCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnThemeChangeCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setTheme(value: dark | light): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
