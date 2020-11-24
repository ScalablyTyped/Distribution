package typings.uniApp.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferrerInfo extends js.Object {
  
  /**
    * 来源小程序或公众号或App的 appId
    *
    * 以下场景支持返回 referrerInfo.appId：
    * - 1020（公众号 profile 页相关小程序列表）： appId
    * - 1035（公众号自定义菜单）：来源公众号 appId
    * - 1036（App 分享消息卡片）：来源应用 appId
    * - 1037（小程序打开小程序）：来源小程序 appId
    * - 1038（从另一个小程序返回）：来源小程序 appId
    * - 1043（公众号模板消息）：来源公众号 appId
    */
  var appId: String = js.native
  
  /**
    * 来源小程序传过来的数据，scene=1037或1038时支持
    */
  var extraData: js.UndefOr[js.Any] = js.native
}
object ReferrerInfo {
  
  @scala.inline
  def apply(appId: String): ReferrerInfo = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferrerInfo]
  }
  
  @scala.inline
  implicit class ReferrerInfoOps[Self <: ReferrerInfo] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraData(value: js.Any): Self = this.set("extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraData: Self = this.set("extraData", js.undefined)
  }
}
