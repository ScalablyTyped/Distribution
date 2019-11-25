package typings.uniDashApp

import typings.uniDashApp.uniDashAppStrings.oauth
import typings.uniDashApp.uniDashAppStrings.payment
import typings.uniDashApp.uniDashAppStrings.push
import typings.uniDashApp.uniDashAppStrings.share
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProviderRes extends js.Object {
  /**
    * 得到的服务供应商
    */
  var provider: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 服务类型
    * - oauth: 授权登录
    * - share: 分享
    * - payment: 支付
    * - push: 推送
    */
  var service: js.UndefOr[oauth | share | payment | push] = js.undefined
}

object GetProviderRes {
  @scala.inline
  def apply(provider: js.Array[_] = null, service: oauth | share | payment | push = null): GetProviderRes = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProviderRes]
  }
}

