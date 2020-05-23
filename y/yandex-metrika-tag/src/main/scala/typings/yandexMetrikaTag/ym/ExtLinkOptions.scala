package typings.yandexMetrikaTag.ym

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtLinkOptions[CTX] extends js.Object {
  var callback: js.UndefOr[js.ThisFunction0[/* this */ CTX, Unit]] = js.undefined
  var ctx: js.UndefOr[CTX] = js.undefined
  var params: js.UndefOr[VisitParameters] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object ExtLinkOptions {
  @scala.inline
  def apply[CTX](
    callback: js.ThisFunction0[/* this */ CTX, Unit] = null,
    ctx: CTX = null,
    params: VisitParameters = null,
    title: String = null
  ): ExtLinkOptions[CTX] = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (ctx != null) __obj.updateDynamic("ctx")(ctx.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtLinkOptions[CTX]]
  }
}

