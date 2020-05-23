package typings.yandexMetrikaTag.ym

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotBounceOptions[CTX] extends js.Object {
  var callback: js.UndefOr[js.ThisFunction0[/* this */ CTX, Unit]] = js.undefined
  var ctx: js.UndefOr[CTX] = js.undefined
}

object NotBounceOptions {
  @scala.inline
  def apply[CTX](callback: js.ThisFunction0[/* this */ CTX, Unit] = null, ctx: CTX = null): NotBounceOptions[CTX] = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (ctx != null) __obj.updateDynamic("ctx")(ctx.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotBounceOptions[CTX]]
  }
}

