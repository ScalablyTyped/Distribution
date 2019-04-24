package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameOptions
  extends BaseOptions[js.Any, js.Any] {
   // 源文件路径，可以是普通文件或目录
  var newPath: java.lang.String
  var oldPath: java.lang.String
}

object RenameOptions {
  @scala.inline
  def apply(
    newPath: java.lang.String,
    oldPath: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): RenameOptions = {
    val __obj = js.Dynamic.literal(newPath = newPath, oldPath = oldPath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[RenameOptions]
  }
}

