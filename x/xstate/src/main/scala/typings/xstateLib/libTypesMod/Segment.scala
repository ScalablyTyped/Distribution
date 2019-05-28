package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment[TContext, TEvent /* <: EventObject */] extends js.Object {
  /**
    * Event from state.
    */
  var event: TEvent
  /**
    * From state.
    */
  var state: xstateLib.libStateMod.State[TContext, TEvent]
}

object Segment {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](event: TEvent, state: xstateLib.libStateMod.State[TContext, TEvent]): Segment[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], state = state)
  
    __obj.asInstanceOf[Segment[TContext, TEvent]]
  }
}

