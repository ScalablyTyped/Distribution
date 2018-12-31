package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanQRCodeConfig extends js.Object {
  /**
    * 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
    */
  var needResult: js.UndefOr[scala.Double] = js.undefined
  /**
    * ["qrCode","barCode"], 可以指定扫二维码还是一维码，默认二者都有
    */
  var scanType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * resultStr 是当 needResult 为 1 时，扫码返回的结果
    */
  var success: js.UndefOr[js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_ResultStr, scala.Unit]] = js.undefined
}

