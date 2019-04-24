package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirOptions
  extends BaseOptions[js.Any, js.Any] {
  var dirPath: java.lang.String
   // 要读取的目录路径
  @JSName("success")
  var success_ReaddirOptions: js.UndefOr[js.Function1[/* res */ weixinDashAppLib.Anon_Files, scala.Unit]] = js.undefined
}

object ReaddirOptions {
  @scala.inline
  def apply(
    dirPath: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: /* res */ weixinDashAppLib.Anon_Files => scala.Unit = null
  ): ReaddirOptions = {
    val __obj = js.Dynamic.literal(dirPath = dirPath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ReaddirOptions]
  }
}

