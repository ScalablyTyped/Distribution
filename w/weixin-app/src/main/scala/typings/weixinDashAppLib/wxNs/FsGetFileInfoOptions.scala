package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsGetFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: java.lang.String
   // 要读取的文件路径
  @JSName("success")
  var success_FsGetFileInfoOptions: js.UndefOr[js.Function1[/* res */ weixinDashAppLib.Anon_Size, scala.Unit]] = js.undefined
}

object FsGetFileInfoOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: /* res */ weixinDashAppLib.Anon_Size => scala.Unit = null
  ): FsGetFileInfoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[FsGetFileInfoOptions]
  }
}

