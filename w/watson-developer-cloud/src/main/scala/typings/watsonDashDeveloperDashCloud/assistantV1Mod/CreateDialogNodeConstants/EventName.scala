package typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventName extends js.Object

/** How an `event_handler` node is processed. */
@JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.EventName")
@js.native
object EventName extends js.Object {
  @js.native
  sealed trait DIGRESSION_RETURN_PROMPT extends EventName
  
  @js.native
  sealed trait FILLED extends EventName
  
  @js.native
  sealed trait FILLED_MULTIPLE extends EventName
  
  @js.native
  sealed trait FOCUS extends EventName
  
  @js.native
  sealed trait GENERIC extends EventName
  
  @js.native
  sealed trait INPUT extends EventName
  
  @js.native
  sealed trait NOMATCH extends EventName
  
  @js.native
  sealed trait NOMATCH_RESPONSES_DEPLETED extends EventName
  
  @js.native
  sealed trait VALIDATE extends EventName
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventName with String] = js.native
  /* "digression_return_prompt" */ @js.native
  object DIGRESSION_RETURN_PROMPT extends TopLevel[DIGRESSION_RETURN_PROMPT with String]
  
  /* "filled" */ @js.native
  object FILLED extends TopLevel[FILLED with String]
  
  /* "filled_multiple" */ @js.native
  object FILLED_MULTIPLE extends TopLevel[FILLED_MULTIPLE with String]
  
  /* "focus" */ @js.native
  object FOCUS extends TopLevel[FOCUS with String]
  
  /* "generic" */ @js.native
  object GENERIC extends TopLevel[GENERIC with String]
  
  /* "input" */ @js.native
  object INPUT extends TopLevel[INPUT with String]
  
  /* "nomatch" */ @js.native
  object NOMATCH extends TopLevel[NOMATCH with String]
  
  /* "nomatch_responses_depleted" */ @js.native
  object NOMATCH_RESPONSES_DEPLETED extends TopLevel[NOMATCH_RESPONSES_DEPLETED with String]
  
  /* "validate" */ @js.native
  object VALIDATE extends TopLevel[VALIDATE with String]
  
}

