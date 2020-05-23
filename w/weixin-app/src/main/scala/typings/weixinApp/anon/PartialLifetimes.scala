package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<weixin-app.wx.Lifetimes> */
trait PartialLifetimes extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialLifetimes {
  @scala.inline
  def apply(
    attached: () => Unit = null,
    created: () => Unit = null,
    detached: () => Unit = null,
    moved: () => Unit = null,
    ready: () => Unit = null
  ): PartialLifetimes = {
    val __obj = js.Dynamic.literal()
    if (attached != null) __obj.updateDynamic("attached")(js.Any.fromFunction0(attached))
    if (created != null) __obj.updateDynamic("created")(js.Any.fromFunction0(created))
    if (detached != null) __obj.updateDynamic("detached")(js.Any.fromFunction0(detached))
    if (moved != null) __obj.updateDynamic("moved")(js.Any.fromFunction0(moved))
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction0(ready))
    __obj.asInstanceOf[PartialLifetimes]
  }
}

