package typings.xstate.xstateMod

import typings.std.Partial
import typings.xstate.Anon_CtxEvent
import typings.xstate.Fn_ActivityActivityActionObject
import typings.xstate.Fn_CtxEvent
import typings.xstate.Fn_EventEventObject
import typings.xstate.Fn_EventOptionsEventObject
import typings.xstate.libTypesMod.ActivityActionObject
import typings.xstate.libTypesMod.ActivityDefinition
import typings.xstate.libTypesMod.AssignAction
import typings.xstate.libTypesMod.Assigner
import typings.xstate.libTypesMod.CancelAction
import typings.xstate.libTypesMod.DoneEventObject
import typings.xstate.libTypesMod.Event
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.RaiseEvent
import typings.xstate.libTypesMod.SendAction
import typings.xstate.libTypesMod.SendActionOptions
import typings.xstate.libTypesMod.SendExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate", "actions")
@js.native
object actions extends js.Object {
  @JSName("after")
  var after_Original: js.Function2[/* delayRef */ Double | String, /* id */ js.UndefOr[String], String] = js.native
  @JSName("done")
  var done_Original: js.Function2[/* id */ String, /* data */ js.UndefOr[js.Any], DoneEventObject] = js.native
  @JSName("log")
  var log_Original: Fn_CtxEvent = js.native
  @JSName("raise")
  var raise_Original: Fn_EventEventObject = js.native
  @JSName("sendParent")
  var sendParent_Original: Fn_EventOptionsEventObject = js.native
  @JSName("send")
  var send_Original: Fn_EventOptionsEventObject = js.native
  @JSName("start")
  var start_Original: Fn_ActivityActivityActionObject = js.native
  @JSName("stop")
  var stop_Original: Fn_ActivityActivityActionObject = js.native
  def after(delayRef: String): String = js.native
  def after(delayRef: String, id: String): String = js.native
  def after(delayRef: Double): String = js.native
  def after(delayRef: Double, id: String): String = js.native
  def assign[TContext, TEvent /* <: EventObject */](
    assignment: Partial[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TContext ]: (context : TContext, event : TEvent): TContext[K] | TContext[K]}
    */ typings.xstate.xstateStrings.actions with js.Any
    ]
  ): AssignAction[TContext, TEvent] = js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  def cancel(sendId: String): CancelAction = js.native
  def cancel(sendId: Double): CancelAction = js.native
  def done(id: String): DoneEventObject = js.native
  def done(id: String, data: js.Any): DoneEventObject = js.native
  def log[TContext, TEvent /* <: EventObject */](): Anon_CtxEvent[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _]): Anon_CtxEvent[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _], label: String): Anon_CtxEvent[TContext, TEvent] = js.native
  def raise[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): RaiseEvent[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
}

