package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----设置
trait AuthorizeOption extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var scope: Scope
  var success: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, scala.Unit]] = js.undefined
}

object AuthorizeOption {
  @scala.inline
  def apply(
    scope: Scope,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    success: /* res */ ErrMsgResponse => scala.Unit = null
  ): AuthorizeOption = {
    val __obj = js.Dynamic.literal(scope = scope)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AuthorizeOption]
  }
}

