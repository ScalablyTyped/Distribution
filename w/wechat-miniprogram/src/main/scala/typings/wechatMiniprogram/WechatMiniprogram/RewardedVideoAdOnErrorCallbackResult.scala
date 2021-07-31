package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1000`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1001`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1002`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1003`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1004`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1005`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1006`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1007`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1008`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RewardedVideoAdOnErrorCallbackResult extends StObject {
  
  /** 错误码
    *
    * 可选值：
    * - 1000: 后端接口调用失败;
    * - 1001: 参数错误;
    * - 1002: 广告单元无效;
    * - 1003: 内部错误;
    * - 1004: 无合适的广告;
    * - 1005: 广告组件审核中;
    * - 1006: 广告组件被驳回;
    * - 1007: 广告组件被封禁;
    * - 1008: 广告单元已关闭;
    *
    * 最低基础库： `2.2.2` */
  var errCode: `1000` | `1001` | `1002` | `1003` | `1004` | `1005` | `1006` | `1007` | `1008`
  
  /** 错误信息 */
  var errMsg: String
}
object RewardedVideoAdOnErrorCallbackResult {
  
  @scala.inline
  def apply(
    errCode: `1000` | `1001` | `1002` | `1003` | `1004` | `1005` | `1006` | `1007` | `1008`,
    errMsg: String
  ): RewardedVideoAdOnErrorCallbackResult = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[RewardedVideoAdOnErrorCallbackResult]
  }
  
  @scala.inline
  implicit class RewardedVideoAdOnErrorCallbackResultMutableBuilder[Self <: RewardedVideoAdOnErrorCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrCode(value: `1000` | `1001` | `1002` | `1003` | `1004` | `1005` | `1006` | `1007` | `1008`): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
