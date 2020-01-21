package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanCodeSuccessRes extends js.Object {
  /**
    * 所扫码的字符集
    */
  var charSet: js.UndefOr[String] = js.undefined
  /**
    * 当所扫的码为当前应用的合法二维码时，会返回此字段，内容为二维码携带的 path。
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * 所扫码的内容
    */
  var result: js.UndefOr[String] = js.undefined
  /**
    * 所扫码的类型
    */
  var scanType: js.UndefOr[String] = js.undefined
}

object ScanCodeSuccessRes {
  @scala.inline
  def apply(charSet: String = null, path: String = null, result: String = null, scanType: String = null): ScanCodeSuccessRes = {
    val __obj = js.Dynamic.literal()
    if (charSet != null) __obj.updateDynamic("charSet")(charSet.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (scanType != null) __obj.updateDynamic("scanType")(scanType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanCodeSuccessRes]
  }
}

