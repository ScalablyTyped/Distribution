package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecMeta[TContext, TEvent /* <: EventObject */] extends StateMeta[TContext, TEvent] {
  var action: ActionObject[TContext, TEvent]
}

object ExecMeta {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](action: ActionObject[TContext, TEvent], state: xstateLib.libStateMod.State[TContext, TEvent]): ExecMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(action = action, state = state)
  
    __obj.asInstanceOf[ExecMeta[TContext, TEvent]]
  }
}

