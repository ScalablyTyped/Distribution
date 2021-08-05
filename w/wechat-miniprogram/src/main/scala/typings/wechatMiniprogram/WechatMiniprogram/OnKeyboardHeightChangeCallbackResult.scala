package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnKeyboardHeightChangeCallbackResult extends StObject {
  
  /** 键盘高度 */
  var height: Double
}
object OnKeyboardHeightChangeCallbackResult {
  
  inline def apply(height: Double): OnKeyboardHeightChangeCallbackResult = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnKeyboardHeightChangeCallbackResult]
  }
  
  extension [Self <: OnKeyboardHeightChangeCallbackResult](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
