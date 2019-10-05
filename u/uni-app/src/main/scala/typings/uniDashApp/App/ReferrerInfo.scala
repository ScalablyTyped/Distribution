package typings.uniDashApp.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var appId: String
  /**
    * 来源小程序传过来的数据，scene=1037或1038时支持
    */
  var extraData: js.UndefOr[js.Any] = js.undefined
}

object ReferrerInfo {
  @scala.inline
  def apply(appId: String, extraData: js.Any = null): ReferrerInfo = {
    val __obj = js.Dynamic.literal(appId = appId)
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    __obj.asInstanceOf[ReferrerInfo]
  }
}

