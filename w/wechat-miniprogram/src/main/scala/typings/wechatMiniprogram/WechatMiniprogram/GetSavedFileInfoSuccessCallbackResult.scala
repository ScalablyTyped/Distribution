package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavedFileInfoSuccessCallbackResult extends StObject {
  
  /** 文件保存时的时间戳，从1970/01/01 08:00:00 到该时刻的秒数 */
  var createTime: Double
  
  var errMsg: String
  
  /** 文件大小，单位 B */
  var size: Double
}
object GetSavedFileInfoSuccessCallbackResult {
  
  @scala.inline
  def apply(createTime: Double, errMsg: String, size: Double): GetSavedFileInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileInfoSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetSavedFileInfoSuccessCallbackResultMutableBuilder[Self <: GetSavedFileInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: Double): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
