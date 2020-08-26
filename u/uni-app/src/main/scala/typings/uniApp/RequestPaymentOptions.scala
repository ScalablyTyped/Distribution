package typings.uniApp

import typings.uniApp.uniAppStrings.alipay
import typings.uniApp.uniAppStrings.appleiap
import typings.uniApp.uniAppStrings.baidu
import typings.uniApp.uniAppStrings.wxpay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPaymentOptions extends js.Object {
  /**
    * 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=xx，微信小程序独有
    */
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 随机字符串，长度为32个字符以下，微信小程序独有 。
    */
  var nonceStr: js.UndefOr[String] = js.native
  /**
    * 订单数据
    */
  var orderInfo: js.UndefOr[String] = js.native
  /**
    * 签名，具体签名方案参见小程序支付接口文档，微信小程序独有
    */
  var paySign: js.UndefOr[String] = js.native
  /**
    * 支付服务提供商，通过 uni.getProvider 获取
    * - alipay: 支付宝支付
    * - wxpay: 微信支付
    * - baidu: 百度收银台
    * - appleiap: 苹果应用内支付
    */
  var provider: js.UndefOr[alipay | wxpay | baidu | appleiap] = js.native
  /**
    * 签名算法，暂支持 MD5 ，微信小程序独有
    */
  var signType: js.UndefOr[String] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 时间戳从1970年1月1日至今的秒数，即当前的时间，微信小程序独有
    */
  var timeStamp: js.UndefOr[String] = js.native
}

object RequestPaymentOptions {
  @scala.inline
  def apply(): RequestPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestPaymentOptions]
  }
  @scala.inline
  implicit class RequestPaymentOptionsOps[Self <: RequestPaymentOptions] (val x: Self) extends AnyVal {
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
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setNonceStr(value: String): Self = this.set("nonceStr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonceStr: Self = this.set("nonceStr", js.undefined)
    @scala.inline
    def setOrderInfo(value: String): Self = this.set("orderInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderInfo: Self = this.set("orderInfo", js.undefined)
    @scala.inline
    def setPaySign(value: String): Self = this.set("paySign", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaySign: Self = this.set("paySign", js.undefined)
    @scala.inline
    def setProvider(value: alipay | wxpay | baidu | appleiap): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setSignType(value: String): Self = this.set("signType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignType: Self = this.set("signType", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTimeStamp(value: String): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeStamp: Self = this.set("timeStamp", js.undefined)
  }
  
}

