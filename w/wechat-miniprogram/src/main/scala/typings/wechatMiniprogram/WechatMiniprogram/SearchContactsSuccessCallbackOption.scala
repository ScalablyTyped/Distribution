package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchContactsSuccessCallbackOption extends StObject {
  
  /** 手机号 */
  var result: js.Array[SearchContactsResult]
}
object SearchContactsSuccessCallbackOption {
  
  inline def apply(result: js.Array[SearchContactsResult]): SearchContactsSuccessCallbackOption = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchContactsSuccessCallbackOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchContactsSuccessCallbackOption] (val x: Self) extends AnyVal {
    
    inline def setResult(value: js.Array[SearchContactsResult]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: SearchContactsResult*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
