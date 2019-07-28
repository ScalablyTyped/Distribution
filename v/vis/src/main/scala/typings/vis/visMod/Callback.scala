package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var callback: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object Callback {
  @scala.inline
  def apply(callback: /* params */ js.UndefOr[js.Any] => Unit = null): Callback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    __obj.asInstanceOf[Callback]
  }
}

