package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageOptions extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  
  /** 本地缓存中的指定的 key */
  var key: String
  
  /** 接口调用的回调函数,res = {data: key对应的内容} */
  def success(res: DataResponse): Unit
  /** 接口调用的回调函数,res = {data: key对应的内容} */
  @JSName("success")
  var success_Original: DataResponseCallback
}
object GetStorageOptions {
  
  @scala.inline
  def apply(key: String, success: /* res */ DataResponse => Unit): GetStorageOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetStorageOptions]
  }
  
  @scala.inline
  implicit class GetStorageOptionsMutableBuilder[Self <: GetStorageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ DataResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
