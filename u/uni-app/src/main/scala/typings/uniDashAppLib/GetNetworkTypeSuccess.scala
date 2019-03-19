package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkTypeSuccess extends js.Object {
  /**
    * 网络类型
    */
  var networkType: js.UndefOr[java.lang.String] = js.undefined
}

object GetNetworkTypeSuccess {
  @scala.inline
  def apply(networkType: java.lang.String = null): GetNetworkTypeSuccess = {
    val __obj = js.Dynamic.literal()
    if (networkType != null) __obj.updateDynamic("networkType")(networkType)
    __obj.asInstanceOf[GetNetworkTypeSuccess]
  }
}

