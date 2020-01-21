package typings.xstate

import typings.xstate.typesMod.Event
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.RaiseAction
import typings.xstate.typesMod.SendAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnEvent extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, TEvent]) = js.native
}

