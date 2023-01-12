package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteNdefMessageOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[WriteNdefMessageCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[WriteNdefMessageFailCallback] = js.undefined
  
  /** 二进制对象数组, 需要指明 id, type 以及 payload (均为 ArrayBuffer 类型) */
  var records: js.UndefOr[js.Array[Any]] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[WriteNdefMessageSuccessCallback] = js.undefined
  
  /** text 数组 */
  var texts: js.UndefOr[js.Array[Any]] = js.undefined
  
  /** uri 数组 */
  var uris: js.UndefOr[js.Array[Any]] = js.undefined
}
object WriteNdefMessageOption {
  
  inline def apply(): WriteNdefMessageOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteNdefMessageOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteNdefMessageOption] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* res */ Nfcrwerror => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ Nfcrwerror => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setRecords(value: js.Array[Any]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    inline def setRecordsVarargs(value: Any*): Self = StObject.set(x, "records", js.Array(value*))
    
    inline def setSuccess(value: /* res */ Nfcrwerror => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTexts(value: js.Array[Any]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setTextsVarargs(value: Any*): Self = StObject.set(x, "texts", js.Array(value*))
    
    inline def setUris(value: js.Array[Any]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    inline def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    inline def setUrisVarargs(value: Any*): Self = StObject.set(x, "uris", js.Array(value*))
  }
}
