package typings.tapable.anon

import typings.tapable.mod.TapFunction
import typings.tapable.mod.TapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FnTapFunction[TTapType /* <: TapType */, TArg1, TArg2, TArg3, THookResult] extends js.Object {
  var fn: js.UndefOr[TapFunction[TTapType, TArg1, TArg2, TArg3, THookResult]] = js.undefined
  var `type`: js.UndefOr[TTapType] = js.undefined
}

object FnTapFunction {
  @scala.inline
  def apply[/* <: typings.tapable.mod.TapType */ TTapType, TArg1, TArg2, TArg3, THookResult](
    fn: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit = null,
    `type`: TTapType = null
  ): FnTapFunction[TTapType, TArg1, TArg2, TArg3, THookResult] = {
    val __obj = js.Dynamic.literal()
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction4(fn))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FnTapFunction[TTapType, TArg1, TArg2, TArg3, THookResult]]
  }
}

