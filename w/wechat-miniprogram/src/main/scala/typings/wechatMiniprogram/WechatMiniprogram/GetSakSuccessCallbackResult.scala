package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSakSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 返回 SAK/SEL_RES 数据 */
  var sak: Double
}
object GetSakSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, sak: Double): GetSakSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], sak = sak.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSakSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetSakSuccessCallbackResultMutableBuilder[Self <: GetSakSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSak(value: Double): Self = StObject.set(x, "sak", value.asInstanceOf[js.Any])
  }
}
