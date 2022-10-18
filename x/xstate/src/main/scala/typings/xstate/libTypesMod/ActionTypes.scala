package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionTypes extends StObject
@JSImport("xstate/lib/types", "ActionTypes")
@js.native
object ActionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes & String] = js.native
  
  @js.native
  sealed trait After
    extends StObject
       with ActionTypes
  /* "xstate.after" */ val After: typings.xstate.libTypesMod.ActionTypes.After & String = js.native
  
  @js.native
  sealed trait Assign
    extends StObject
       with ActionTypes
  /* "xstate.assign" */ val Assign: typings.xstate.libTypesMod.ActionTypes.Assign & String = js.native
  
  @js.native
  sealed trait Cancel
    extends StObject
       with ActionTypes
  /* "xstate.cancel" */ val Cancel: typings.xstate.libTypesMod.ActionTypes.Cancel & String = js.native
  
  @js.native
  sealed trait Choose
    extends StObject
       with ActionTypes
  /* "xstate.choose" */ val Choose: typings.xstate.libTypesMod.ActionTypes.Choose & String = js.native
  
  @js.native
  sealed trait DoneInvoke
    extends StObject
       with ActionTypes
  /* "done.invoke" */ val DoneInvoke: typings.xstate.libTypesMod.ActionTypes.DoneInvoke & String = js.native
  
  @js.native
  sealed trait DoneState
    extends StObject
       with ActionTypes
  /* "done.state" */ val DoneState: typings.xstate.libTypesMod.ActionTypes.DoneState & String = js.native
  
  @js.native
  sealed trait ErrorCommunication
    extends StObject
       with ActionTypes
  /* "error.communication" */ val ErrorCommunication: typings.xstate.libTypesMod.ActionTypes.ErrorCommunication & String = js.native
  
  @js.native
  sealed trait ErrorCustom
    extends StObject
       with ActionTypes
  /* "xstate.error" */ val ErrorCustom: typings.xstate.libTypesMod.ActionTypes.ErrorCustom & String = js.native
  
  @js.native
  sealed trait ErrorExecution
    extends StObject
       with ActionTypes
  /* "error.execution" */ val ErrorExecution: typings.xstate.libTypesMod.ActionTypes.ErrorExecution & String = js.native
  
  @js.native
  sealed trait ErrorPlatform
    extends StObject
       with ActionTypes
  /* "error.platform" */ val ErrorPlatform: typings.xstate.libTypesMod.ActionTypes.ErrorPlatform & String = js.native
  
  @js.native
  sealed trait Init
    extends StObject
       with ActionTypes
  /* "xstate.init" */ val Init: typings.xstate.libTypesMod.ActionTypes.Init & String = js.native
  
  @js.native
  sealed trait Invoke
    extends StObject
       with ActionTypes
  /* "xstate.invoke" */ val Invoke: typings.xstate.libTypesMod.ActionTypes.Invoke & String = js.native
  
  @js.native
  sealed trait Log
    extends StObject
       with ActionTypes
  /* "xstate.log" */ val Log: typings.xstate.libTypesMod.ActionTypes.Log & String = js.native
  
  @js.native
  sealed trait NullEvent
    extends StObject
       with ActionTypes
  /* "" */ val NullEvent: typings.xstate.libTypesMod.ActionTypes.NullEvent & String = js.native
  
  @js.native
  sealed trait Pure
    extends StObject
       with ActionTypes
  /* "xstate.pure" */ val Pure: typings.xstate.libTypesMod.ActionTypes.Pure & String = js.native
  
  @js.native
  sealed trait Raise
    extends StObject
       with ActionTypes
  /* "xstate.raise" */ val Raise: typings.xstate.libTypesMod.ActionTypes.Raise & String = js.native
  
  @js.native
  sealed trait Send
    extends StObject
       with ActionTypes
  /* "xstate.send" */ val Send: typings.xstate.libTypesMod.ActionTypes.Send & String = js.native
  
  @js.native
  sealed trait Start
    extends StObject
       with ActionTypes
  /* "xstate.start" */ val Start: typings.xstate.libTypesMod.ActionTypes.Start & String = js.native
  
  @js.native
  sealed trait Stop
    extends StObject
       with ActionTypes
  /* "xstate.stop" */ val Stop: typings.xstate.libTypesMod.ActionTypes.Stop & String = js.native
  
  @js.native
  sealed trait Update
    extends StObject
       with ActionTypes
  /* "xstate.update" */ val Update: typings.xstate.libTypesMod.ActionTypes.Update & String = js.native
}
