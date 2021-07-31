package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeVoIPVideoMembersOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SubscribeVoIPVideoMembersCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SubscribeVoIPVideoMembersFailCallback] = js.undefined
  
  /** 订阅的成员列表 */
  var openIdList: js.Array[String]
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SubscribeVoIPVideoMembersSuccessCallback] = js.undefined
}
object SubscribeVoIPVideoMembersOption {
  
  @scala.inline
  def apply(openIdList: js.Array[String]): SubscribeVoIPVideoMembersOption = {
    val __obj = js.Dynamic.literal(openIdList = openIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeVoIPVideoMembersOption]
  }
  
  @scala.inline
  implicit class SubscribeVoIPVideoMembersOptionMutableBuilder[Self <: SubscribeVoIPVideoMembersOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setOpenIdList(value: js.Array[String]): Self = StObject.set(x, "openIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIdListVarargs(value: String*): Self = StObject.set(x, "openIdList", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
