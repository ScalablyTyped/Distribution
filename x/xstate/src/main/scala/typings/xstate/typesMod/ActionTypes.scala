package typings.xstate.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionTypes extends js.Object

@JSImport("xstate/lib/types", "ActionTypes")
@js.native
object ActionTypes extends js.Object {
  @js.native
  sealed trait After extends ActionTypes
  
  @js.native
  sealed trait Assign extends ActionTypes
  
  @js.native
  sealed trait Cancel extends ActionTypes
  
  @js.native
  sealed trait Choose extends ActionTypes
  
  @js.native
  sealed trait DoneInvoke extends ActionTypes
  
  @js.native
  sealed trait DoneState extends ActionTypes
  
  @js.native
  sealed trait ErrorCommunication extends ActionTypes
  
  @js.native
  sealed trait ErrorCustom extends ActionTypes
  
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
  /* "xstate.after" */ @js.native
  object After extends TopLevel[After with String]
  
  /* "xstate.assign" */ @js.native
  object Assign extends TopLevel[Assign with String]
  
  /* "xstate.cancel" */ @js.native
  object Cancel extends TopLevel[Cancel with String]
  
  /* "xstate.choose" */ @js.native
  object Choose extends TopLevel[Choose with String]
  
  /* "done.invoke" */ @js.native
  object DoneInvoke extends TopLevel[DoneInvoke with String]
  
  /* "done.state" */ @js.native
  object DoneState extends TopLevel[DoneState with String]
  
  /* "error.communication" */ @js.native
  object ErrorCommunication extends TopLevel[ErrorCommunication with String]
  
  /* "xstate.error" */ @js.native
  object ErrorCustom extends TopLevel[ErrorCustom with String]
  
  /* "error.execution" */ @js.native
  object ErrorExecution extends TopLevel[ErrorExecution with String]
  
  /* "error.platform" */ @js.native
  object ErrorPlatform extends TopLevel[ErrorPlatform with String]
  
  /* "xstate.init" */ @js.native
  object Init extends TopLevel[Init with String]
  
  /* "xstate.invoke" */ @js.native
  object Invoke extends TopLevel[Invoke with String]
  
  /* "xstate.log" */ @js.native
  object Log extends TopLevel[Log with String]
  
  /* "" */ @js.native
  object NullEvent
    extends TopLevel[typings.xstate.typesMod.ActionTypes.NullEvent with String]
  
  /* "xstate.pure" */ @js.native
  object Pure extends TopLevel[Pure with String]
  
  /* "xstate.raise" */ @js.native
  object Raise extends TopLevel[Raise with String]
  
  /* "xstate.send" */ @js.native
  object Send extends TopLevel[Send with String]
  
  /* "xstate.start" */ @js.native
  object Start extends TopLevel[Start with String]
  
  /* "xstate.stop" */ @js.native
  object Stop extends TopLevel[Stop with String]
  
  /* "xstate.update" */ @js.native
  object Update extends TopLevel[Update with String]
  
}

