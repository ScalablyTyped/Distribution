package typings
package xstateLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es", "actions")
@js.native
object actions extends js.Object {
  @JSName("after")
  var after_Original: js.Function2[
    /* delayRef */ scala.Double | java.lang.String, 
    /* id */ js.UndefOr[java.lang.String], 
    java.lang.String
  ] = js.native
  @JSName("done")
  var done_Original: js.Function2[
    /* id */ java.lang.String, 
    /* data */ js.UndefOr[js.Any], 
    xstateLib.esTypesMod.DoneEventObject
  ] = js.native
  @JSName("log")
  var log_Original: xstateLib.Anon_CtxEvent = js.native
  @JSName("raise")
  var raise_Original: xstateLib.Anon_Event = js.native
  @JSName("sendParent")
  var sendParent_Original: xstateLib.Anon_EventOptions = js.native
  @JSName("send")
  var send_Original: xstateLib.Anon_EventOptions = js.native
  @JSName("start")
  var start_Original: xstateLib.Anon_Activity = js.native
  @JSName("stop")
  var stop_Original: xstateLib.Anon_Activity = js.native
  def after(delayRef: java.lang.String): java.lang.String = js.native
  def after(delayRef: java.lang.String, id: java.lang.String): java.lang.String = js.native
  def after(delayRef: scala.Double): java.lang.String = js.native
  def after(delayRef: scala.Double, id: java.lang.String): java.lang.String = js.native
  def assign[TContext, TEvent /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_xstate/es/types.EventObject */ js.Any */](
    assignment: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_xstate/es/types.Assigner<TContext, TEvent> */ js.Any
  ): js.Any = js.native
  def assign[TContext, TEvent /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_xstate/es/types.EventObject */ js.Any */](
    assignment: stdLib.Partial[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TContext ]: (context : TContext, event : TEvent): TContext[K] | TContext[K]}
    */ xstateLib.xstateLibStrings.actions with js.Any
    ]
  ): js.Any = js.native
  def cancel(sendId: java.lang.String): js.Any = js.native
  def cancel(sendId: scala.Double): js.Any = js.native
  def done(id: java.lang.String): xstateLib.esTypesMod.DoneEventObject = js.native
  def done(id: java.lang.String, data: js.Any): xstateLib.esTypesMod.DoneEventObject = js.native
  def log[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](): xstateLib.Anon_Ctx[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _]): xstateLib.Anon_Ctx[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _], label: java.lang.String): xstateLib.Anon_Ctx[TContext, TEvent] = js.native
  def raise[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.Event[TEvent]): xstateLib.esTypesMod.RaiseEvent[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.Event[TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.Event[TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.SendExpr[TContext, TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.Event[TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.Event[TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.SendExpr[TContext, TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](activity: java.lang.String): xstateLib.esTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](activity: xstateLib.esTypesMod.ActivityDefinition[TContext, TEvent]): xstateLib.esTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](activity: java.lang.String): xstateLib.esTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](activity: xstateLib.esTypesMod.ActivityDefinition[TContext, TEvent]): xstateLib.esTypesMod.ActivityActionObject[TContext, TEvent] = js.native
}

