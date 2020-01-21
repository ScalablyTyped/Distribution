package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.AnonNetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getNetworkType")
@js.native
object getNetworkType extends js.Object {
  /**
    * 获取网络状态, var networkType = res.networkType; 返回网络类型 2g，3g，4g，wifi
    */
  def apply(success: js.Function1[/* res */ AnonNetworkType, Unit]): Unit = js.native
}

