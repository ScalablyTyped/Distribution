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
  var records: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[WriteNdefMessageSuccessCallback] = js.undefined
  
  /** text 数组 */
  var texts: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /** uri 数组 */
  var uris: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object WriteNdefMessageOption {
  
  @scala.inline
  def apply(): WriteNdefMessageOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteNdefMessageOption]
  }
  
  @scala.inline
  implicit class WriteNdefMessageOptionMutableBuilder[Self <: WriteNdefMessageOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setRecords(value: js.Array[js.Any]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    @scala.inline
    def setRecordsVarargs(value: js.Any*): Self = StObject.set(x, "records", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTexts(value: js.Array[js.Any]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    @scala.inline
    def setTextsVarargs(value: js.Any*): Self = StObject.set(x, "texts", js.Array(value :_*))
    
    @scala.inline
    def setUris(value: js.Array[js.Any]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    @scala.inline
    def setUrisVarargs(value: js.Any*): Self = StObject.set(x, "uris", js.Array(value :_*))
  }
}
