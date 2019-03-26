package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_After extends js.Object {
  @JSName("after")
  var after_Original: js.Function2[/* delay */ scala.Double, /* id */ js.UndefOr[java.lang.String], java.lang.String] = js.native
  @JSName("done")
  var done_Original: js.Function2[
    /* id */ java.lang.String, 
    /* data */ js.UndefOr[js.Any], 
    xstateLib.libTypesMod.DoneEventObject
  ] = js.native
  @JSName("log")
  var log_Original: Anon_CtxEvent = js.native
  @JSName("raise")
  var raise_Original: Anon_Event = js.native
  @JSName("sendParent")
  var sendParent_Original: Anon_EventOptions = js.native
  @JSName("send")
  var send_Original: Anon_EventOptions = js.native
  @JSName("start")
  var start_Original: Anon_Activity = js.native
  @JSName("stop")
  var stop_Original: Anon_Activity = js.native
  def after(delay: scala.Double): java.lang.String = js.native
  def after(delay: scala.Double, id: java.lang.String): java.lang.String = js.native
  def assign[TContext, TEvent /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_xstate/lib/types.EventObject */ js.Any */](
    assignment: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_xstate/lib/types.Assigner<TContext, TEvent> */ js.Any
  ): js.Any = js.native
  def assign[TContext, TEvent /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_xstate/lib/types.EventObject */ js.Any */](
    assignment: stdLib.Partial[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TContext ]: (extState : TContext, event : TEvent): TContext[K] | TContext[K]}
    */ xstateLib.xstateLibStrings.Anon_After with js.Any
    ]
  ): js.Any = js.native
  def cancel(sendId: java.lang.String): js.Any = js.native
  def cancel(sendId: scala.Double): js.Any = js.native
  def done(id: java.lang.String): xstateLib.libTypesMod.DoneEventObject = js.native
  def done(id: java.lang.String, data: js.Any): xstateLib.libTypesMod.DoneEventObject = js.native
  def log[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](): Anon_Ctx[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _]): Anon_Ctx[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _], label: java.lang.String): Anon_Ctx[TContext, TEvent] = js.native
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

