package typings.xstate.esMod

import typings.std.Partial
import typings.xstate.Anon_Ctx
import typings.xstate.Fn_Activity
import typings.xstate.Fn_Ctx
import typings.xstate.Fn_Event
import typings.xstate.Fn_EventOptions
import typings.xstate.esTypesMod.ActivityActionObject
import typings.xstate.esTypesMod.ActivityDefinition
import typings.xstate.esTypesMod.AssignAction
import typings.xstate.esTypesMod.Assigner
import typings.xstate.esTypesMod.CancelAction
import typings.xstate.esTypesMod.DoneEventObject
import typings.xstate.esTypesMod.Event
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.RaiseEvent
import typings.xstate.esTypesMod.SendAction
import typings.xstate.esTypesMod.SendActionOptions
import typings.xstate.esTypesMod.SendExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es", "actions")
@js.native
object actions extends js.Object {
  @JSName("after")
  var after_Original: js.Function2[/* delayRef */ Double | String, /* id */ js.UndefOr[String], String] = js.native
  @JSName("done")
  var done_Original: js.Function2[/* id */ String, /* data */ js.UndefOr[js.Any], DoneEventObject] = js.native
  @JSName("log")
  var log_Original: Fn_Ctx = js.native
  @JSName("raise")
  var raise_Original: Fn_Event = js.native
  @JSName("sendParent")
  var sendParent_Original: Fn_EventOptions = js.native
  @JSName("send")
  var send_Original: Fn_EventOptions = js.native
  @JSName("start")
  var start_Original: Fn_Activity = js.native
  @JSName("stop")
  var stop_Original: Fn_Activity = js.native
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
  def log[TContext, TEvent /* <: EventObject */](): Anon_Ctx[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _]): Anon_Ctx[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _], label: String): Anon_Ctx[TContext, TEvent] = js.native
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

