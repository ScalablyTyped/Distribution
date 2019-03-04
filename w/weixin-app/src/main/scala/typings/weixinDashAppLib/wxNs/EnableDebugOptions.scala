package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #endregion
trait EnableDebugOptions
  extends BaseOptions[js.Any, js.Any] {
  var enableDebug: scala.Boolean
}

object EnableDebugOptions {
  @scala.inline
  def apply(
    enableDebug: scala.Boolean,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): EnableDebugOptions = {
    val __obj = js.Dynamic.literal(enableDebug = enableDebug)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[EnableDebugOptions]
  }
}

