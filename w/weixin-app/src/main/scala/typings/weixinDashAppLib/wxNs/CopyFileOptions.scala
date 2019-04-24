package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyFileOptions
  extends BaseOptions[js.Any, js.Any] {
   // 源文件路径，只可以是普通文件
  var destPath: java.lang.String
  var srcPath: java.lang.String
}

object CopyFileOptions {
  @scala.inline
  def apply(
    destPath: java.lang.String,
    srcPath: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): CopyFileOptions = {
    val __obj = js.Dynamic.literal(destPath = destPath, srcPath = srcPath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CopyFileOptions]
  }
}

