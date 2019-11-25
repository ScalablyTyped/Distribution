package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkTypeSuccess extends js.Object {
  /**
    * 网络类型
    */
  var networkType: js.UndefOr[String] = js.undefined
}

object GetNetworkTypeSuccess {
  @scala.inline
  def apply(networkType: String = null): GetNetworkTypeSuccess = {
    val __obj = js.Dynamic.literal()
    if (networkType != null) __obj.updateDynamic("networkType")(networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkTypeSuccess]
  }
}

