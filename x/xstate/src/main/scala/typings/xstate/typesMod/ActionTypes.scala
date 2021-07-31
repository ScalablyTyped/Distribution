package typings.xstate.typesMod

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
  /* "xstate.after" */ val After: typings.xstate.typesMod.ActionTypes.After & String = js.native
  
  @js.native
  sealed trait Assign
    extends StObject
       with ActionTypes
  /* "xstate.assign" */ val Assign: typings.xstate.typesMod.ActionTypes.Assign & String = js.native
  
  @js.native
  sealed trait Cancel
    extends StObject
       with ActionTypes
  /* "xstate.cancel" */ val Cancel: typings.xstate.typesMod.ActionTypes.Cancel & String = js.native
  
  @js.native
  sealed trait Choose
    extends StObject
       with ActionTypes
  /* "xstate.choose" */ val Choose: typings.xstate.typesMod.ActionTypes.Choose & String = js.native
  
  @js.native
  sealed trait DoneInvoke
    extends StObject
       with ActionTypes
  /* "done.invoke" */ val DoneInvoke: typings.xstate.typesMod.ActionTypes.DoneInvoke & String = js.native
  
  @js.native
  sealed trait DoneState
    extends StObject
       with ActionTypes
  /* "done.state" */ val DoneState: typings.xstate.typesMod.ActionTypes.DoneState & String = js.native
  
  @js.native
  sealed trait ErrorCommunication
    extends StObject
       with ActionTypes
  /* "error.communication" */ val ErrorCommunication: typings.xstate.typesMod.ActionTypes.ErrorCommunication & String = js.native
  
  @js.native
  sealed trait ErrorCustom
    extends StObject
       with ActionTypes
  /* "xstate.error" */ val ErrorCustom: typings.xstate.typesMod.ActionTypes.ErrorCustom & String = js.native
  
  @js.native
  sealed trait ErrorExecution
    extends StObject
       with ActionTypes
  /* "error.execution" */ val ErrorExecution: typings.xstate.typesMod.ActionTypes.ErrorExecution & String = js.native
  
  @js.native
  sealed trait ErrorPlatform
    extends StObject
       with ActionTypes
  /* "error.platform" */ val ErrorPlatform: typings.xstate.typesMod.ActionTypes.ErrorPlatform & String = js.native
  
  @js.native
  sealed trait Init
    extends StObject
       with ActionTypes
  /* "xstate.init" */ val Init: typings.xstate.typesMod.ActionTypes.Init & String = js.native
  
  @js.native
  sealed trait Invoke
    extends StObject
       with ActionTypes
  /* "xstate.invoke" */ val Invoke: typings.xstate.typesMod.ActionTypes.Invoke & String = js.native
  
  @js.native
  sealed trait Log
    extends StObject
       with ActionTypes
  /* "xstate.log" */ val Log: typings.xstate.typesMod.ActionTypes.Log & String = js.native
  
  @js.native
  sealed trait NullEvent
    extends StObject
       with ActionTypes
  /* "" */ val NullEvent: typings.xstate.typesMod.ActionTypes.NullEvent & String = js.native
  
  @js.native
  sealed trait Pure
    extends StObject
       with ActionTypes
  /* "xstate.pure" */ val Pure: typings.xstate.typesMod.ActionTypes.Pure & String = js.native
  
  @js.native
  sealed trait Raise
    extends StObject
       with ActionTypes
  /* "xstate.raise" */ val Raise: typings.xstate.typesMod.ActionTypes.Raise & String = js.native
  
  @js.native
  sealed trait Send
    extends StObject
       with ActionTypes
  /* "xstate.send" */ val Send: typings.xstate.typesMod.ActionTypes.Send & String = js.native
  
  @js.native
  sealed trait Start
    extends StObject
       with ActionTypes
  /* "xstate.start" */ val Start: typings.xstate.typesMod.ActionTypes.Start & String = js.native
  
  @js.native
  sealed trait Stop
    extends StObject
       with ActionTypes
  /* "xstate.stop" */ val Stop: typings.xstate.typesMod.ActionTypes.Stop & String = js.native
  
  @js.native
  sealed trait Update
    extends StObject
       with ActionTypes
  /* "xstate.update" */ val Update: typings.xstate.typesMod.ActionTypes.Update & String = js.native
}
