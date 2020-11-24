package typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventName extends js.Object
/** How an `event_handler` node is processed. */
@JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.EventName")
@js.native
object EventName extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventName with String] = js.native
  
  @js.native
  sealed trait DIGRESSION_RETURN_PROMPT extends EventName
  /* "digression_return_prompt" */ @js.native
  object DIGRESSION_RETURN_PROMPT extends TopLevel[DIGRESSION_RETURN_PROMPT with String]
  
  @js.native
  sealed trait FILLED extends EventName
  /* "filled" */ @js.native
  object FILLED extends TopLevel[FILLED with String]
  
  @js.native
  sealed trait FILLED_MULTIPLE extends EventName
  /* "filled_multiple" */ @js.native
  object FILLED_MULTIPLE extends TopLevel[FILLED_MULTIPLE with String]
  
  @js.native
  sealed trait FOCUS extends EventName
  /* "focus" */ @js.native
  object FOCUS extends TopLevel[FOCUS with String]
  
  @js.native
  sealed trait GENERIC extends EventName
  /* "generic" */ @js.native
  object GENERIC extends TopLevel[GENERIC with String]
  
  @js.native
  sealed trait INPUT extends EventName
  /* "input" */ @js.native
  object INPUT extends TopLevel[INPUT with String]
  
  @js.native
  sealed trait NOMATCH extends EventName
  /* "nomatch" */ @js.native
  object NOMATCH extends TopLevel[NOMATCH with String]
  
  @js.native
  sealed trait NOMATCH_RESPONSES_DEPLETED extends EventName
  /* "nomatch_responses_depleted" */ @js.native
  object NOMATCH_RESPONSES_DEPLETED extends TopLevel[NOMATCH_RESPONSES_DEPLETED with String]
  
  @js.native
  sealed trait VALIDATE extends EventName
  /* "validate" */ @js.native
  object VALIDATE extends TopLevel[VALIDATE with String]
}
