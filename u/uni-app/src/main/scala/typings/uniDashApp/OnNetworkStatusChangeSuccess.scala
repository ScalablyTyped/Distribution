package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnNetworkStatusChangeSuccess extends js.Object {
  /**
    * 当前是否有网络连接
    */
  var isConnected: js.UndefOr[Double] = js.undefined
  /**
    * 网络类型
    */
  var networkType: js.UndefOr[String] = js.undefined
}

object OnNetworkStatusChangeSuccess {
  @scala.inline
  def apply(isConnected: Int | Double = null, networkType: String = null): OnNetworkStatusChangeSuccess = {
    val __obj = js.Dynamic.literal()
    if (isConnected != null) __obj.updateDynamic("isConnected")(isConnected.asInstanceOf[js.Any])
    if (networkType != null) __obj.updateDynamic("networkType")(networkType)
    __obj.asInstanceOf[OnNetworkStatusChangeSuccess]
  }
}

