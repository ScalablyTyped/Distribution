package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuardMeta[TContext, TEvent /* <: EventObject */] extends StateMeta[TContext, TEvent] {
  var cond: Guard[TContext, TEvent]
}

object GuardMeta {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](cond: Guard[TContext, TEvent], state: xstateLib.libStateMod.State[TContext, TEvent]): GuardMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(cond = cond.asInstanceOf[js.Any], state = state)
  
    __obj.asInstanceOf[GuardMeta[TContext, TEvent]]
  }
}

