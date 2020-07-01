package typings.tapable.anon

import typings.tapable.mod.TapFunction
import typings.tapable.tapableStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fn[TArg1, TArg2, TArg3, THookResult] extends js.Object {
  var fn: js.UndefOr[TapFunction[sync, TArg1, TArg2, TArg3, THookResult]] = js.undefined
  var `type`: js.UndefOr[sync] = js.undefined
}

object Fn {
  @scala.inline
  def apply[TArg1, TArg2, TArg3, THookResult](
    fn: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit = null,
    `type`: sync = null
  ): Fn[TArg1, TArg2, TArg3, THookResult] = {
    val __obj = js.Dynamic.literal()
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction4(fn))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fn[TArg1, TArg2, TArg3, THookResult]]
  }
}

