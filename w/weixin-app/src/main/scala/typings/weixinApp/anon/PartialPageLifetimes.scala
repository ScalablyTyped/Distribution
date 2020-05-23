package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<weixin-app.wx.PageLifetimes> */
trait PartialPageLifetimes extends js.Object {
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialPageLifetimes {
  @scala.inline
  def apply(hide: () => Unit = null, show: () => Unit = null): PartialPageLifetimes = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    __obj.asInstanceOf[PartialPageLifetimes]
  }
}

