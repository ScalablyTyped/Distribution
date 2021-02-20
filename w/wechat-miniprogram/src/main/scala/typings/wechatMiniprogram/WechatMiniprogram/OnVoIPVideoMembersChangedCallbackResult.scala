package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnVoIPVideoMembersChangedCallbackResult extends StObject {
  
  /** 错误码 */
  var errCode: Double = js.native
  
  /** 调用结果 */
  var errMsg: String = js.native
  
  /** 开启视频的成员名单 */
  var openIdList: js.Array[String] = js.native
}
object OnVoIPVideoMembersChangedCallbackResult {
  
  @scala.inline
  def apply(errCode: Double, errMsg: String, openIdList: js.Array[String]): OnVoIPVideoMembersChangedCallbackResult = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], openIdList = openIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnVoIPVideoMembersChangedCallbackResult]
  }
  
  @scala.inline
  implicit class OnVoIPVideoMembersChangedCallbackResultMutableBuilder[Self <: OnVoIPVideoMembersChangedCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIdList(value: js.Array[String]): Self = StObject.set(x, "openIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIdListVarargs(value: String*): Self = StObject.set(x, "openIdList", js.Array(value :_*))
  }
}
