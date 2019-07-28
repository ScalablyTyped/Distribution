package typings.xstate.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionTypes extends js.Object

@JSImport("xstate/es/types", "ActionTypes")
@js.native
object ActionTypes extends js.Object {
  @js.native
  sealed trait After extends ActionTypes
  
  @js.native
  sealed trait Assign extends ActionTypes
  
  @js.native
  sealed trait Cancel extends ActionTypes
  
  @js.native
  sealed trait DoneInvoke extends ActionTypes
  
  @js.native
  sealed trait DoneState extends ActionTypes
  
  @js.native
  sealed trait ErrorCommunication extends ActionTypes
  
  @js.native
  sealed trait ErrorExecution extends ActionTypes
  
  @js.native
  sealed trait ErrorPlatform extends ActionTypes
  
  @js.native
  sealed trait Init extends ActionTypes
  
  @js.native
  sealed trait Invoke extends ActionTypes
  
  @js.native
  sealed trait Log extends ActionTypes
  
  @js.native
  sealed trait NullEvent extends ActionTypes
  
  @js.native
  sealed trait Pure extends ActionTypes
  
  @js.native
  sealed trait Raise extends ActionTypes
  
  @js.native
  sealed trait Send extends ActionTypes
  
  @js.native
  sealed trait Start extends ActionTypes
  
  @js.native
  sealed trait Stop extends ActionTypes
  
  @js.native
  sealed trait Update extends ActionTypes
  
  /* "xstate.after" */ val After: typings.xstate.esTypesMod.ActionTypes.After with String = js.native
  /* "xstate.assign" */ val Assign: typings.xstate.esTypesMod.ActionTypes.Assign with String = js.native
  /* "xstate.cancel" */ val Cancel: typings.xstate.esTypesMod.ActionTypes.Cancel with String = js.native
  /* "done.invoke" */ val DoneInvoke: typings.xstate.esTypesMod.ActionTypes.DoneInvoke with String = js.native
  /* "done.state" */ val DoneState: typings.xstate.esTypesMod.ActionTypes.DoneState with String = js.native
  /* "error.communication" */ val ErrorCommunication: typings.xstate.esTypesMod.ActionTypes.ErrorCommunication with String = js.native
  /* "error.execution" */ val ErrorExecution: typings.xstate.esTypesMod.ActionTypes.ErrorExecution with String = js.native
  /* "error.platform" */ val ErrorPlatform: typings.xstate.esTypesMod.ActionTypes.ErrorPlatform with String = js.native
  /* "xstate.init" */ val Init: typings.xstate.esTypesMod.ActionTypes.Init with String = js.native
  /* "xstate.invoke" */ val Invoke: typings.xstate.esTypesMod.ActionTypes.Invoke with String = js.native
  /* "xstate.log" */ val Log: typings.xstate.esTypesMod.ActionTypes.Log with String = js.native
  /* "" */ val NullEvent: typings.xstate.esTypesMod.ActionTypes.NullEvent with String = js.native
  /* "xstate.pure" */ val Pure: typings.xstate.esTypesMod.ActionTypes.Pure with String = js.native
  /* "xstate.raise" */ val Raise: typings.xstate.esTypesMod.ActionTypes.Raise with String = js.native
  /* "xstate.send" */ val Send: typings.xstate.esTypesMod.ActionTypes.Send with String = js.native
  /* "xstate.start" */ val Start: typings.xstate.esTypesMod.ActionTypes.Start with String = js.native
  /* "xstate.stop" */ val Stop: typings.xstate.esTypesMod.ActionTypes.Stop with String = js.native
  /* "xstate.update" */ val Update: typings.xstate.esTypesMod.ActionTypes.Update with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
}

