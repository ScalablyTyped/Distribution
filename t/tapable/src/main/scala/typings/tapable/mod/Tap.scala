package typings.tapable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tap[TTapType /* <: TapType */, TArg1, TArg2, TArg3, THookResult] extends js.Object {
  var before: js.UndefOr[String | js.Array[String]] = js.undefined
  var context: js.UndefOr[Boolean] = js.undefined
  var fn: TapFunction[TTapType, TArg1, TArg2, TArg3, THookResult]
  var name: String
  var stage: js.UndefOr[Double] = js.undefined
  var `type`: TTapType
}

object Tap {
  @scala.inline
  def apply[/* <: typings.tapable.mod.TapType */ TTapType, TArg1, TArg2, TArg3, THookResult](
    fn: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit,
    name: String,
    `type`: TTapType,
    before: String | js.Array[String] = null,
    context: js.UndefOr[Boolean] = js.undefined,
    stage: js.UndefOr[Double] = js.undefined
  ): Tap[TTapType, TArg1, TArg2, TArg3, THookResult] = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction4(fn), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stage)) __obj.updateDynamic("stage")(stage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tap[TTapType, TArg1, TArg2, TArg3, THookResult]]
  }
}

