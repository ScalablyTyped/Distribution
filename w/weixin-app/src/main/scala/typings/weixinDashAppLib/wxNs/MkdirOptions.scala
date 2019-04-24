package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MkdirOptions
  extends BaseOptions[js.Any, js.Any] {
  var dirPath: java.lang.String
   // 创建的目录路径
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
}

object MkdirOptions {
  @scala.inline
  def apply(
    dirPath: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    recursive: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Any => scala.Unit = null
  ): MkdirOptions = {
    val __obj = js.Dynamic.literal(dirPath = dirPath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[MkdirOptions]
  }
}

