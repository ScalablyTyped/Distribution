package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenSettingSuccessCallbackResult extends js.Object {
  
  /** [AuthSetting](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/setting/AuthSetting.html)
    *
    * 用户授权结果 */
  var authSetting: AuthSetting = js.native
  
  var errMsg: String = js.native
  
  /** [SubscriptionsSetting](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/setting/SubscriptionsSetting.html)
    *
    * 用户订阅消息设置，接口参数`withSubscriptions`值为`true`时才会返回。
    *
    * 最低基础库： `2.10.3` */
  var subscriptionsSetting: SubscriptionsSetting = js.native
}
object OpenSettingSuccessCallbackResult {
  
  @scala.inline
  def apply(authSetting: AuthSetting, errMsg: String, subscriptionsSetting: SubscriptionsSetting): OpenSettingSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], subscriptionsSetting = subscriptionsSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenSettingSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class OpenSettingSuccessCallbackResultOps[Self <: OpenSettingSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthSetting(value: AuthSetting): Self = this.set("authSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsSetting(value: SubscriptionsSetting): Self = this.set("subscriptionsSetting", value.asInstanceOf[js.Any])
  }
}
