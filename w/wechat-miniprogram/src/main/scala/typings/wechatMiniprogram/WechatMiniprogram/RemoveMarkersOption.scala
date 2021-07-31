package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveMarkersOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RemoveMarkersCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RemoveMarkersFailCallback] = js.undefined
  
  /** marker 的 id 集合。 */
  var markerIds: js.Array[js.Any]
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RemoveMarkersSuccessCallback] = js.undefined
}
object RemoveMarkersOption {
  
  @scala.inline
  def apply(markerIds: js.Array[js.Any]): RemoveMarkersOption = {
    val __obj = js.Dynamic.literal(markerIds = markerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveMarkersOption]
  }
  
  @scala.inline
  implicit class RemoveMarkersOptionMutableBuilder[Self <: RemoveMarkersOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMarkerIds(value: js.Array[js.Any]): Self = StObject.set(x, "markerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerIdsVarargs(value: js.Any*): Self = StObject.set(x, "markerIds", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
