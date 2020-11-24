package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 订阅消息设置 */
@js.native
trait SubscriptionsSetting extends js.Object {
  
  /** 每一项订阅消息的订阅状态。itemSettings对象的键为**一次性订阅消息的模板id**或**系统订阅消息的类型**，值为'accept'、'reject'、'ban'中的其中一种。'accept'表示用户同意订阅这条消息，'reject'表示用户拒绝订阅这条消息，'ban'表示已被后台封禁。一次性订阅消息使用方法详见 [wx.requestSubscribeMessage](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/subscribe-message/wx.requestSubscribeMessage.html)，永久订阅消息（仅小游戏可用）使用方法详见[wx.requestSubscribeSystemMessage](/minigame/dev/api/open-api/subscribe-message/wx.requestSubscribeSystemMessage.html) */
  var itemSettings: IAnyObject = js.native
  
  /** 订阅消息总开关，true为开启，false为关闭 */
  var mainSwitch: Boolean = js.native
}
object SubscriptionsSetting {
  
  @scala.inline
  def apply(itemSettings: IAnyObject, mainSwitch: Boolean): SubscriptionsSetting = {
    val __obj = js.Dynamic.literal(itemSettings = itemSettings.asInstanceOf[js.Any], mainSwitch = mainSwitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionsSetting]
  }
  
  @scala.inline
  implicit class SubscriptionsSettingOps[Self <: SubscriptionsSetting] (val x: Self) extends AnyVal {
    
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
    def setItemSettings(value: IAnyObject): Self = this.set("itemSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainSwitch(value: Boolean): Self = this.set("mainSwitch", value.asInstanceOf[js.Any])
  }
}
