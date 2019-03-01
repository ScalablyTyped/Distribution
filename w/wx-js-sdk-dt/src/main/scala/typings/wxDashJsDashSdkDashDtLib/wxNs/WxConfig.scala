package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 微信配置对象
  */
trait WxConfig extends js.Object {
  /**
    * 公众号的唯一标识
    */
  var appId: java.lang.String
  /**
    * 开启调试模式,调用的所有 api 的返回值会在客户端 alert 出来，若要查看传入的参数，可以在 pc 端打开，参数信息会通过 log 打出，仅在 pc 端时才会打印。
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 需要使用的JS接口列表
    */
  var jsApiList: js.Array[java.lang.String]
  /**
    * 签名的随机串
    */
  var nonceStr: java.lang.String
  /**
    * 签名
    */
  var signature: java.lang.String
  /**
    * 签名的时间戳
    */
  var timestamp: scala.Double
}

object WxConfig {
  @scala.inline
  def apply(
    appId: java.lang.String,
    jsApiList: js.Array[java.lang.String],
    nonceStr: java.lang.String,
    signature: java.lang.String,
    timestamp: scala.Double,
    debug: js.UndefOr[scala.Boolean] = js.undefined
  ): WxConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appId")(appId)
    __obj.updateDynamic("jsApiList")(jsApiList)
    __obj.updateDynamic("nonceStr")(nonceStr)
    __obj.updateDynamic("signature")(signature)
    __obj.updateDynamic("timestamp")(timestamp)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[WxConfig]
  }
}

