package typings.xstate.typesMod

import typings.xstate.anon.Context
import typings.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathItem[TContext, TEvent /* <: EventObject */] extends js.Object {
  var path: js.Array[Segment[TContext, TEvent]]
  var state: State[TContext, TEvent, _, Context[TContext]]
  var weight: js.UndefOr[Double] = js.undefined
}

object PathItem {
  @scala.inline
  def apply[TContext, TEvent](
    path: js.Array[Segment[TContext, TEvent]],
    state: State[TContext, TEvent, _, Context[TContext]],
    weight: js.UndefOr[Double] = js.undefined
  ): PathItem[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathItem[TContext, TEvent]]
  }
}

