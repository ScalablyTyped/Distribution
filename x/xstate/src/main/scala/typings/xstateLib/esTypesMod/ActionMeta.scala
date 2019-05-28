package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMeta[TContext, TEvent /* <: EventObject */] extends StateMeta[TContext, TEvent] {
  var action: ActionObject[TContext, TEvent]
}

object ActionMeta {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](action: ActionObject[TContext, TEvent], state: xstateLib.esStateMod.State[TContext, TEvent]): ActionMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(action = action, state = state)
  
    __obj.asInstanceOf[ActionMeta[TContext, TEvent]]
  }
}

