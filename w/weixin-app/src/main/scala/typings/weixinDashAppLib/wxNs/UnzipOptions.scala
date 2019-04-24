package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnzipOptions
  extends BaseOptions[js.Any, js.Any] {
   // 源文件路径，只可以是 zip 压缩文件
  var targetPath: java.lang.String
  var zipFilePath: java.lang.String
}

object UnzipOptions {
  @scala.inline
  def apply(
    targetPath: java.lang.String,
    zipFilePath: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): UnzipOptions = {
    val __obj = js.Dynamic.literal(targetPath = targetPath, zipFilePath = zipFilePath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[UnzipOptions]
  }
}

