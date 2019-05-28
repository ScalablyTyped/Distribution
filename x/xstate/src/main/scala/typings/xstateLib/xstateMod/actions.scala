package typings
package xstateLib.xstateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate", "actions")
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
    xstateLib.libTypesMod.DoneEventObject
  ] = js.native
  @JSName("log")
  var log_Original: xstateLib.Fn_CtxEvent = js.native
  @JSName("raise")
  var raise_Original: xstateLib.Fn_EventEventObject = js.native
  @JSName("sendParent")
  var sendParent_Original: xstateLib.Fn_EventOptionsEventObject = js.native
  @JSName("send")
  var send_Original: xstateLib.Fn_EventOptionsEventObject = js.native
  @JSName("start")
  var start_Original: xstateLib.Fn_ActivityActivityActionObject = js.native
  @JSName("stop")
  var stop_Original: xstateLib.Fn_ActivityActivityActionObject = js.native
  def after(delayRef: java.lang.String): java.lang.String = js.native
  def after(delayRef: java.lang.String, id: java.lang.String): java.lang.String = js.native
  def after(delayRef: scala.Double): java.lang.String = js.native
  def after(delayRef: scala.Double, id: java.lang.String): java.lang.String = js.native
  def assign[TContext, TEvent /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_xstate/lib/types.EventObject */ js.Any */](
    assignment: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_xstate/lib/types.Assigner<TContext, TEvent> */ js.Any
  ): js.Any = js.native
  def assign[TContext, TEvent /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_xstate/lib/types.EventObject */ js.Any */](
    assignment: stdLib.Partial[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TContext ]: (context : TContext, event : TEvent): TContext[K] | TContext[K]}
    */ xstateLib.xstateLibStrings.actions with js.Any
    ]
  ): js.Any = js.native
  def cancel(sendId: java.lang.String): js.Any = js.native
  def cancel(sendId: scala.Double): js.Any = js.native
  def done(id: java.lang.String): xstateLib.libTypesMod.DoneEventObject = js.native
  def done(id: java.lang.String, data: js.Any): xstateLib.libTypesMod.DoneEventObject = js.native
  def log[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](): xstateLib.Anon_CtxEvent[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _]): xstateLib.Anon_CtxEvent[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _], label: java.lang.String): xstateLib.Anon_CtxEvent[TContext, TEvent] = js.native
  def raise[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.Event[TEvent]): xstateLib.libTypesMod.RaiseEvent[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.Event[TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.Event[TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.SendExpr[TContext, TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.Event[TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.Event[TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.SendExpr[TContext, TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](activity: java.lang.String): xstateLib.libTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](activity: xstateLib.libTypesMod.ActivityDefinition[TContext, TEvent]): xstateLib.libTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](activity: java.lang.String): xstateLib.libTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](activity: xstateLib.libTypesMod.ActivityDefinition[TContext, TEvent]): xstateLib.libTypesMod.ActivityActionObject[TContext, TEvent] = js.native
}

