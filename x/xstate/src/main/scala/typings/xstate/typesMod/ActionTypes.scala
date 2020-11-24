package typings.xstate.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionTypes extends js.Object
@JSImport("xstate/lib/types", "ActionTypes")
@js.native
object ActionTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
  
  @js.native
  sealed trait After extends ActionTypes
  /* "xstate.after" */ @js.native
  object After extends TopLevel[After with String]
  
  @js.native
  sealed trait Assign extends ActionTypes
  /* "xstate.assign" */ @js.native
  object Assign extends TopLevel[Assign with String]
  
  @js.native
  sealed trait Cancel extends ActionTypes
  /* "xstate.cancel" */ @js.native
  object Cancel extends TopLevel[Cancel with String]
  
  @js.native
  sealed trait Choose extends ActionTypes
  /* "xstate.choose" */ @js.native
  object Choose extends TopLevel[Choose with String]
  
  @js.native
  sealed trait DoneInvoke extends ActionTypes
  /* "done.invoke" */ @js.native
  object DoneInvoke extends TopLevel[DoneInvoke with String]
  
  @js.native
  sealed trait DoneState extends ActionTypes
  /* "done.state" */ @js.native
  object DoneState extends TopLevel[DoneState with String]
  
  @js.native
  sealed trait ErrorCommunication extends ActionTypes
  /* "error.communication" */ @js.native
  object ErrorCommunication extends TopLevel[ErrorCommunication with String]
  
  @js.native
  sealed trait ErrorCustom extends ActionTypes
  /* "xstate.error" */ @js.native
  object ErrorCustom extends TopLevel[ErrorCustom with String]
  
  @js.native
  sealed trait ErrorExecution extends ActionTypes
  /* "error.execution" */ @js.native
  object ErrorExecution extends TopLevel[ErrorExecution with String]
  
  @js.native
  sealed trait ErrorPlatform extends ActionTypes
  /* "error.platform" */ @js.native
  object ErrorPlatform extends TopLevel[ErrorPlatform with String]
  
  @js.native
  sealed trait Init extends ActionTypes
  /* "xstate.init" */ @js.native
  object Init extends TopLevel[Init with String]
  
  @js.native
  sealed trait Invoke extends ActionTypes
  /* "xstate.invoke" */ @js.native
  object Invoke extends TopLevel[Invoke with String]
  
  @js.native
  sealed trait Log extends ActionTypes
  /* "xstate.log" */ @js.native
  object Log extends TopLevel[Log with String]
  
  @js.native
  sealed trait NullEvent extends ActionTypes
  /* "" */ @js.native
  object NullEvent
    extends TopLevel[typings.xstate.typesMod.ActionTypes.NullEvent with String]
  
  @js.native
  sealed trait Pure extends ActionTypes
  /* "xstate.pure" */ @js.native
  object Pure extends TopLevel[Pure with String]
  
  @js.native
  sealed trait Raise extends ActionTypes
  /* "xstate.raise" */ @js.native
  object Raise extends TopLevel[Raise with String]
  
  @js.native
  sealed trait Send extends ActionTypes
  /* "xstate.send" */ @js.native
  object Send extends TopLevel[Send with String]
  
  @js.native
  sealed trait Start extends ActionTypes
  /* "xstate.start" */ @js.native
  object Start extends TopLevel[Start with String]
  
  @js.native
  sealed trait Stop extends ActionTypes
  /* "xstate.stop" */ @js.native
  object Stop extends TopLevel[Stop with String]
  
  @js.native
  sealed trait Update extends ActionTypes
  /* "xstate.update" */ @js.native
  object Update extends TopLevel[Update with String]
}
