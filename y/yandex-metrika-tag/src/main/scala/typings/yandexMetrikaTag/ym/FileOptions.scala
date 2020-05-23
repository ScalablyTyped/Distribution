package typings.yandexMetrikaTag.ym

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions[CTX] extends js.Object {
  var callback: js.UndefOr[js.ThisFunction0[/* this */ CTX, Unit]] = js.undefined
  var ctx: js.UndefOr[CTX] = js.undefined
  var params: js.UndefOr[VisitParameters] = js.undefined
  var referer: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply[CTX](
    callback: js.ThisFunction0[/* this */ CTX, Unit] = null,
    ctx: CTX = null,
    params: VisitParameters = null,
    referer: String = null,
    title: String = null
  ): FileOptions[CTX] = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (ctx != null) __obj.updateDynamic("ctx")(ctx.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (referer != null) __obj.updateDynamic("referer")(referer.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions[CTX]]
  }
}

