package typings.xstate.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMap[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.Array[Action[TContext, TEvent]]
  var onEntry: js.Array[Action[TContext, TEvent]]
  var onExit: js.Array[Action[TContext, TEvent]]
}

object ActionMap {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[Action[TContext, TEvent]],
    onEntry: js.Array[Action[TContext, TEvent]],
    onExit: js.Array[Action[TContext, TEvent]]
  ): ActionMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions, onEntry = onEntry, onExit = onExit)
  
    __obj.asInstanceOf[ActionMap[TContext, TEvent]]
  }
}

