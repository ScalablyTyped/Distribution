package typings.xstate

import typings.xstate.esTypesMod.Event
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.RaiseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Event extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): RaiseEvent[TContext, TEvent] = js.native
}

