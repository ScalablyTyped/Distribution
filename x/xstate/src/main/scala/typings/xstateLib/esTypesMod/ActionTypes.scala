package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionTypes extends js.Object

@JSImport("xstate/es/types", "ActionTypes")
@js.native
object ActionTypes extends js.Object {
  @js.native
  sealed trait After
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait Assign
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait Cancel
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait DoneInvoke
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait DoneState
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait ErrorCommunication
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait ErrorExecution
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait Init
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait Invoke
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait Log
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait NullEvent
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait Raise
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait Send
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait Start
    extends xstateLib.esTypesMod.ActionTypes
  
  @js.native
  sealed trait Stop
    extends xstateLib.esTypesMod.ActionTypes
  
  /* "xstate.after" */ val After: After with java.lang.String = js.native
  /* "xstate.assign" */ val Assign: Assign with java.lang.String = js.native
  /* "xstate.cancel" */ val Cancel: Cancel with java.lang.String = js.native
  /* "done.invoke" */ val DoneInvoke: DoneInvoke with java.lang.String = js.native
  /* "done.state" */ val DoneState: DoneState with java.lang.String = js.native
  /* "error.communication" */ val ErrorCommunication: ErrorCommunication with java.lang.String = js.native
  /* "error.execution" */ val ErrorExecution: ErrorExecution with java.lang.String = js.native
  /* "xstate.init" */ val Init: Init with java.lang.String = js.native
  /* "xstate.invoke" */ val Invoke: Invoke with java.lang.String = js.native
  /* "xstate.log" */ val Log: Log with java.lang.String = js.native
  /* "" */ val NullEvent: NullEvent with java.lang.String = js.native
  /* "xstate.raise" */ val Raise: Raise with java.lang.String = js.native
  /* "xstate.send" */ val Send: Send with java.lang.String = js.native
  /* "xstate.start" */ val Start: Start with java.lang.String = js.native
  /* "xstate.stop" */ val Stop: Stop with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xstateLib.esTypesMod.ActionTypes with java.lang.String] = js.native
}

