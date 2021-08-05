package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cursor extends StObject {
  
  /** 光标位置 */
  var cursor: Double
  
  /** keyCode 为键值 (目前工具还不支持返回keyCode参数) `2.1.0` 起支持 */
  var keyCode: js.UndefOr[Double] = js.undefined
  
  /** 输入框内容 */
  var value: String
}
object Cursor {
  
  inline def apply(cursor: Double, value: String): Cursor = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursor]
  }
  
  extension [Self <: Cursor](x: Self) {
    
    inline def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
