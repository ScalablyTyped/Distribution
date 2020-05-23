package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MkdirOptions
  extends BaseOptions[js.Any, js.Any] {
  var dirPath: String
   // 创建的目录路径
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object MkdirOptions {
  @scala.inline
  def apply(
    dirPath: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    success: js.Any => Unit = null
  ): MkdirOptions = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[MkdirOptions]
  }
}

