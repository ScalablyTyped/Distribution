package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareToWeRunOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShareToWeRunCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShareToWeRunFailCallback] = js.undefined
  
  /** 运动数据列表 */
  var recordList: js.Array[WxaSportRecord]
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShareToWeRunSuccessCallback] = js.undefined
}
object ShareToWeRunOption {
  
  inline def apply(recordList: js.Array[WxaSportRecord]): ShareToWeRunOption = {
    val __obj = js.Dynamic.literal(recordList = recordList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareToWeRunOption]
  }
  
  extension [Self <: ShareToWeRunOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setRecordList(value: js.Array[WxaSportRecord]): Self = StObject.set(x, "recordList", value.asInstanceOf[js.Any])
    
    inline def setRecordListVarargs(value: WxaSportRecord*): Self = StObject.set(x, "recordList", js.Array(value*))
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
