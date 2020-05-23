package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.RaiseAction
import typings.xstate.typesMod.SendAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, TEvent, TEvent]) = js.native
}

