package typings.xstate.anon

import typings.xstate.typesMod.AnyEventObject
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.SendAction
import typings.xstate.typesMod.SendActionOptions
import typings.xstate.typesMod.SendExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn1 extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
}

