package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnKeyboardHeightChangeCallbackResult extends StObject {
  
  /** 键盘高度 */
  var height: Double = js.native
}
object OnKeyboardHeightChangeCallbackResult {
  
  @scala.inline
  def apply(height: Double): OnKeyboardHeightChangeCallbackResult = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnKeyboardHeightChangeCallbackResult]
  }
  
  @scala.inline
  implicit class OnKeyboardHeightChangeCallbackResultMutableBuilder[Self <: OnKeyboardHeightChangeCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
