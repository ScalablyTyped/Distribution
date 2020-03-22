package typings.xstate

import typings.xstate.typesMod.Event
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.SendAction
import typings.xstate.typesMod.SendActionOptions
import typings.xstate.typesMod.SendExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallEventOptions extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
}

