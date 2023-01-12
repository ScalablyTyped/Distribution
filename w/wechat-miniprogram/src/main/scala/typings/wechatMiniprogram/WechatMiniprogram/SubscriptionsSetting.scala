package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 订阅消息设置
*
* **示例代码**
*
*
* ```javascript
wx.getSetting({
  withSubscriptions: true,
  success (res) {
  console.log(res.authSetting)
  // res.authSetting = {
  //   "scope.userInfo": true,
  //   "scope.userLocation": true
  // }
  console.log(res.subscriptionsSetting)
  // res.subscriptionsSetting = {
  //   mainSwitch: true, // 订阅消息总开关
  //   itemSettings: {   // 每一项开关
  //     SYS_MSG_TYPE_INTERACTIVE: 'accept', // 小游戏系统订阅消息
  //     SYS_MSG_TYPE_RANK: 'accept'
  //     zun-LzcQyW-edafCVvzPkK4de2Rllr1fFpw2A_x0oXE: 'reject', // 普通一次性订阅消息
  //     ke_OZC_66gZxALLcsuI7ilCJSP2OJ2vWo2ooUPpkWrw: 'ban',
  //   }
  // }
  }
})
``` */
trait SubscriptionsSetting extends StObject {
  
  /** 每一项订阅消息的订阅状态。itemSettings对象的键为**一次性订阅消息的模板id**或**系统订阅消息的类型**，值为'accept'、'reject'、'ban'中的其中一种。'accept'表示用户同意订阅这条消息，'reject'表示用户拒绝订阅这条消息，'ban'表示已被后台封禁。一次性订阅消息使用方法详见 [wx.requestSubscribeMessage](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/subscribe-message/wx.requestSubscribeMessage.html)，永久订阅消息（仅小游戏可用）使用方法详见[wx.requestSubscribeSystemMessage](/minigame/dev/api/open-api/subscribe-message/wx.requestSubscribeSystemMessage.html)
    * ## 注意事项
    *  - itemSettings 只返回用户勾选过订阅面板中的“总是保持以上选择，不再询问”的订阅消息。 */
  var itemSettings: js.UndefOr[IAnyObject] = js.undefined
  
  /** 订阅消息总开关，true为开启，false为关闭 */
  var mainSwitch: Boolean
}
object SubscriptionsSetting {
  
  inline def apply(mainSwitch: Boolean): SubscriptionsSetting = {
    val __obj = js.Dynamic.literal(mainSwitch = mainSwitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionsSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionsSetting] (val x: Self) extends AnyVal {
    
    inline def setItemSettings(value: IAnyObject): Self = StObject.set(x, "itemSettings", value.asInstanceOf[js.Any])
    
    inline def setItemSettingsUndefined: Self = StObject.set(x, "itemSettings", js.undefined)
    
    inline def setMainSwitch(value: Boolean): Self = StObject.set(x, "mainSwitch", value.asInstanceOf[js.Any])
  }
}
