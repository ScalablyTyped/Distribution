package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionTypes extends StObject
@JSImport("xstate/lib/types", "ActionTypes")
@js.native
object ActionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
  
  @js.native
  sealed trait After extends ActionTypes
  /* "xstate.after" */ val After: typings.xstate.typesMod.ActionTypes.After with String = js.native
  
  @js.native
  sealed trait Assign extends ActionTypes
  /* "xstate.assign" */ val Assign: typings.xstate.typesMod.ActionTypes.Assign with String = js.native
  
  @js.native
  sealed trait Cancel extends ActionTypes
  /* "xstate.cancel" */ val Cancel: typings.xstate.typesMod.ActionTypes.Cancel with String = js.native
  
  @js.native
  sealed trait Choose extends ActionTypes
  /* "xstate.choose" */ val Choose: typings.xstate.typesMod.ActionTypes.Choose with String = js.native
  
  @js.native
  sealed trait DoneInvoke extends ActionTypes
  /* "done.invoke" */ val DoneInvoke: typings.xstate.typesMod.ActionTypes.DoneInvoke with String = js.native
  
  @js.native
  sealed trait DoneState extends ActionTypes
  /* "done.state" */ val DoneState: typings.xstate.typesMod.ActionTypes.DoneState with String = js.native
  
  @js.native
  sealed trait ErrorCommunication extends ActionTypes
  /* "error.communication" */ val ErrorCommunication: typings.xstate.typesMod.ActionTypes.ErrorCommunication with String = js.native
  
  @js.native
  sealed trait ErrorCustom extends ActionTypes
  /* "xstate.error" */ val ErrorCustom: typings.xstate.typesMod.ActionTypes.ErrorCustom with String = js.native
  
  @js.native
  sealed trait ErrorExecution extends ActionTypes
  /* "error.execution" */ val ErrorExecution: typings.xstate.typesMod.ActionTypes.ErrorExecution with String = js.native
  
  @js.native
  sealed trait ErrorPlatform extends ActionTypes
  /* "error.platform" */ val ErrorPlatform: typings.xstate.typesMod.ActionTypes.ErrorPlatform with String = js.native
  
  @js.native
  sealed trait Init extends ActionTypes
  /* "xstate.init" */ val Init: typings.xstate.typesMod.ActionTypes.Init with String = js.native
  
  @js.native
  sealed trait Invoke extends ActionTypes
  /* "xstate.invoke" */ val Invoke: typings.xstate.typesMod.ActionTypes.Invoke with String = js.native
  
  @js.native
  sealed trait Log extends ActionTypes
  /* "xstate.log" */ val Log: typings.xstate.typesMod.ActionTypes.Log with String = js.native
  
  @js.native
  sealed trait NullEvent extends ActionTypes
  /* "" */ val NullEvent: typings.xstate.typesMod.ActionTypes.NullEvent with String = js.native
  
  @js.native
  sealed trait Pure extends ActionTypes
  /* "xstate.pure" */ val Pure: typings.xstate.typesMod.ActionTypes.Pure with String = js.native
  
  @js.native
  sealed trait Raise extends ActionTypes
  /* "xstate.raise" */ val Raise: typings.xstate.typesMod.ActionTypes.Raise with String = js.native
  
  @js.native
  sealed trait Send extends ActionTypes
  /* "xstate.send" */ val Send: typings.xstate.typesMod.ActionTypes.Send with String = js.native
  
  @js.native
  sealed trait Start extends ActionTypes
  /* "xstate.start" */ val Start: typings.xstate.typesMod.ActionTypes.Start with String = js.native
  
  @js.native
  sealed trait Stop extends ActionTypes
  /* "xstate.stop" */ val Stop: typings.xstate.typesMod.ActionTypes.Stop with String = js.native
  
  @js.native
  sealed trait Update extends ActionTypes
  /* "xstate.update" */ val Update: typings.xstate.typesMod.ActionTypes.Update with String = js.native
}
