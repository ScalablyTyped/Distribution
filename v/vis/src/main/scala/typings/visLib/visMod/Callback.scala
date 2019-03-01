package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var callback: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object Callback {
  @scala.inline
  def apply(callback: js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit] = null): Callback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    __obj.asInstanceOf[Callback]
  }
}

