package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeOptions extends CommonCallbackOptions {
  //  需要获取权限的 scope，详见 scope 列表
  var scope: Scope
}

object AuthorizeOptions {
  @scala.inline
  def apply(
    scope: Scope,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ js.Any => Unit = null
  ): AuthorizeOptions = {
    val __obj = js.Dynamic.literal(scope = scope)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AuthorizeOptions]
  }
}

