package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_LoginOptions: js.UndefOr[js.Function1[/* res */ LoginResponse, scala.Unit]] = js.undefined
}

object LoginOptions {
  @scala.inline
  def apply(
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ LoginResponse, scala.Unit] = null
  ): LoginOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[LoginOptions]
  }
}

