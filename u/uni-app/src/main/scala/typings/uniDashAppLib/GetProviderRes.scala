package typings
package uniDashAppLib

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
  var service: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.oauth | uniDashAppLib.uniDashAppLibStrings.share | uniDashAppLib.uniDashAppLibStrings.payment | uniDashAppLib.uniDashAppLibStrings.push
  ] = js.undefined
}

object GetProviderRes {
  @scala.inline
  def apply(
    provider: js.Array[_] = null,
    service: uniDashAppLib.uniDashAppLibStrings.oauth | uniDashAppLib.uniDashAppLibStrings.share | uniDashAppLib.uniDashAppLibStrings.payment | uniDashAppLib.uniDashAppLibStrings.push = null
  ): GetProviderRes = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProviderRes]
  }
}

