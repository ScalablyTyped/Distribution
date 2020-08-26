package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 微信配置对象
  */
@js.native
trait WxConfig extends js.Object {
  /**
    * 公众号的唯一标识
    */
  var appId: String = js.native
  /**
    * 开启调试模式,调用的所有 api 的返回值会在客户端 alert 出来，若要查看传入的参数，可以在 pc 端打开，参数信息会通过 log 打出，仅在 pc 端时才会打印。
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * 需要使用的JS接口列表
    */
  var jsApiList: js.Array[String] = js.native
  /**
    * 签名的随机串
    */
  var nonceStr: String = js.native
  /**
    * 签名
    */
  var signature: String = js.native
  /**
    * 签名的时间戳
    */
  var timestamp: Double = js.native
}

object WxConfig {
  @scala.inline
  def apply(appId: String, jsApiList: js.Array[String], nonceStr: String, signature: String, timestamp: Double): WxConfig = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], jsApiList = jsApiList.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WxConfig]
  }
  @scala.inline
  implicit class WxConfigOps[Self <: WxConfig] (val x: Self) extends AnyVal {
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
    def setJsApiListVarargs(value: String*): Self = this.set("jsApiList", js.Array(value :_*))
    @scala.inline
    def setJsApiList(value: js.Array[String]): Self = this.set("jsApiList", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonceStr(value: String): Self = this.set("nonceStr", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
  }
  
}

