package typings.weixinApp.wx

import typings.weixinApp.AnonSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsGetFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: String
   // 要读取的文件路径
  @JSName("success")
  var success_FsGetFileInfoOptions: js.UndefOr[js.Function1[/* res */ AnonSize, Unit]] = js.undefined
}

object FsGetFileInfoOptions {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ AnonSize => Unit = null
  ): FsGetFileInfoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[FsGetFileInfoOptions]
  }
}

