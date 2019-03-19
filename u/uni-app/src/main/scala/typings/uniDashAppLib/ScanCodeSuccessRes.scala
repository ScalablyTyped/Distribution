package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanCodeSuccessRes extends js.Object {
  /**
    * 所扫码的字符集
    */
  var charSet: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 当所扫的码为当前应用的合法二维码时，会返回此字段，内容为二维码携带的 path。
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 所扫码的内容
    */
  var result: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 所扫码的类型
    */
  var scanType: js.UndefOr[java.lang.String] = js.undefined
}

object ScanCodeSuccessRes {
  @scala.inline
  def apply(
    charSet: java.lang.String = null,
    path: java.lang.String = null,
    result: java.lang.String = null,
    scanType: java.lang.String = null
  ): ScanCodeSuccessRes = {
    val __obj = js.Dynamic.literal()
    if (charSet != null) __obj.updateDynamic("charSet")(charSet)
    if (path != null) __obj.updateDynamic("path")(path)
    if (result != null) __obj.updateDynamic("result")(result)
    if (scanType != null) __obj.updateDynamic("scanType")(scanType)
    __obj.asInstanceOf[ScanCodeSuccessRes]
  }
}

