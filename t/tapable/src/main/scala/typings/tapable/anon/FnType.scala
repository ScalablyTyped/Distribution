package typings.tapable.anon

import typings.tapable.mod.TapFunction
import typings.tapable.tapableStrings.promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FnType[TArg1, TArg2, TArg3, THookResult] extends js.Object {
  var fn: js.UndefOr[TapFunction[promise, TArg1, TArg2, TArg3, THookResult]] = js.undefined
  var `type`: js.UndefOr[promise] = js.undefined
}

object FnType {
  @scala.inline
  def apply[TArg1, TArg2, TArg3, THookResult](
    fn: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit = null,
    `type`: promise = null
  ): FnType[TArg1, TArg2, TArg3, THookResult] = {
    val __obj = js.Dynamic.literal()
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction4(fn))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FnType[TArg1, TArg2, TArg3, THookResult]]
  }
}

