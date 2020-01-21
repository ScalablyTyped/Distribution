package typings.xstate.typesMod

import typings.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathsItem[TContext, TEvent /* <: EventObject */] extends js.Object {
  var paths: js.Array[js.Array[Segment[TContext, TEvent]]]
  var state: State[TContext, TEvent, _, _]
}

object PathsItem {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](paths: js.Array[js.Array[Segment[TContext, TEvent]]], state: State[TContext, TEvent, _, _]): PathsItem[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathsItem[TContext, TEvent]]
  }
}

