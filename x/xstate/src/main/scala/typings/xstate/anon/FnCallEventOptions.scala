package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.SendAction
import typings.xstate.typesMod.SendActionOptions
import typings.xstate.typesMod.SendExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallEventOptions extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
}

