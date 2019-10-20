package typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventName extends js.Object

/** How an `event_handler` node is processed. */
@JSImport("watson-developer-cloud/assistant/v1", "UpdateDialogNodeConstants.EventName")
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
  
  /* "digression_return_prompt" */ val DIGRESSION_RETURN_PROMPT: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.DIGRESSION_RETURN_PROMPT with String = js.native
  /* "filled" */ val FILLED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.FILLED with String = js.native
  /* "filled_multiple" */ val FILLED_MULTIPLE: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.FILLED_MULTIPLE with String = js.native
  /* "focus" */ val FOCUS: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.FOCUS with String = js.native
  /* "generic" */ val GENERIC: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.GENERIC with String = js.native
  /* "input" */ val INPUT: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.INPUT with String = js.native
  /* "nomatch" */ val NOMATCH: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.NOMATCH with String = js.native
  /* "nomatch_responses_depleted" */ val NOMATCH_RESPONSES_DEPLETED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.NOMATCH_RESPONSES_DEPLETED with String = js.native
  /* "validate" */ val VALIDATE: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.VALIDATE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventName with String] = js.native
}

