package typings.xstate.esTypesMod

import typings.xstate.esStateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateMeta[TContext, TEvent /* <: EventObject */] extends js.Object {
  var state: State[TContext, TEvent]
}

object StateMeta {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](state: State[TContext, TEvent]): StateMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(state = state)
  
    __obj.asInstanceOf[StateMeta[TContext, TEvent]]
  }
}

