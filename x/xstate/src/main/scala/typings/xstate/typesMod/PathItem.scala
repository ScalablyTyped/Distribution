package typings.xstate.typesMod

import typings.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathItem[TContext, TEvent /* <: EventObject */] extends js.Object {
  var path: js.Array[Segment[TContext, TEvent]]
  var state: State[TContext, TEvent, _, _]
  var weight: js.UndefOr[Double] = js.undefined
}

object PathItem {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    path: js.Array[Segment[TContext, TEvent]],
    state: State[TContext, TEvent, _, _],
    weight: Int | Double = null
  ): PathItem[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathItem[TContext, TEvent]]
  }
}

