package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChooseWXPayConfig extends js.Object {
  /**
           * 支付签名随机串，不长于 32 位
           */
  var nonceStr: java.lang.String
  /**
           * 统一支付接口返回的 prepay_id 参数值，提交格式如：prepay_id=***
           */
  var `package`: java.lang.String
  /**
           * 支付签名
           */
  var paySign: java.lang.String
  /**
           * 签名方式，默认为'SHA1'，使用新版支付需传入'MD5'
           */
  var signType: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 支付签名时间戳，注意微信jssdk中的所有使用 timestamp 字段均为小写。但最新版的支付后台生成签名使用的 timeStamp 字段名需大写其中的S字符
           */
  var timestamp: scala.Double
  /**
           * 支付成功后的回调函数
           */
  def success(res: js.Any): scala.Unit
}

