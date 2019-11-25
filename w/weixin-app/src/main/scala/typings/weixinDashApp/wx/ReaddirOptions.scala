package typings.weixinDashApp.wx

import typings.weixinDashApp.Anon_Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirOptions
  extends BaseOptions[js.Any, js.Any] {
  var dirPath: String
   // 要读取的目录路径
  @JSName("success")
  var success_ReaddirOptions: js.UndefOr[js.Function1[/* res */ Anon_Files, Unit]] = js.undefined
}

object ReaddirOptions {
  @scala.inline
  def apply(
    dirPath: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ Anon_Files => Unit = null
  ): ReaddirOptions = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ReaddirOptions]
  }
}

