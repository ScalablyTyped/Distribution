package typings.watsonDashDeveloperDashCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `updateDialogNode` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.UpdateDialogNodeConstants")
@js.native
object UpdateDialogNodeConstants extends js.Object {
  /** Whether this top-level dialog node can be digressed into. */
  @js.native
  object DigressIn extends js.Object {
    /* "does_not_return" */ val DOES_NOT_RETURN: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressIn.DOES_NOT_RETURN with String = js.native
    /* "not_available" */ val NOT_AVAILABLE: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressIn.NOT_AVAILABLE with String = js.native
    /* "returns" */ val RETURNS: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressIn.RETURNS with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressIn with String
      ] = js.native
  }
  
  /** Whether this dialog node can be returned to after a digression. */
  @js.native
  object DigressOut extends js.Object {
    /* "allow_all" */ val ALLOW_ALL: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOut.ALLOW_ALL with String = js.native
    /* "allow_all_never_return" */ val ALLOW_ALL_NEVER_RETURN: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOut.ALLOW_ALL_NEVER_RETURN with String = js.native
    /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOut.ALLOW_RETURNING with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOut with String
      ] = js.native
  }
  
  /** Whether the user can digress to top-level nodes while filling out slots. */
  @js.native
  object DigressOutSlots extends js.Object {
    /* "allow_all" */ val ALLOW_ALL: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOutSlots.ALLOW_ALL with String = js.native
    /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOutSlots.ALLOW_RETURNING with String = js.native
    /* "not_allowed" */ val NOT_ALLOWED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOutSlots.NOT_ALLOWED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOutSlots with String
      ] = js.native
  }
  
  /** How an `event_handler` node is processed. */
  @js.native
  object EventName extends js.Object {
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
    def apply(value: String): js.UndefOr[
        typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName with String
      ] = js.native
  }
  
  /** How the dialog node is processed. */
  @js.native
  object NodeType extends js.Object {
    /* "event_handler" */ val EVENT_HANDLER: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.EVENT_HANDLER with String = js.native
    /* "folder" */ val FOLDER: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.FOLDER with String = js.native
    /* "frame" */ val FRAME: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.FRAME with String = js.native
    /* "response_condition" */ val RESPONSE_CONDITION: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.RESPONSE_CONDITION with String = js.native
    /* "slot" */ val SLOT: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.SLOT with String = js.native
    /* "standard" */ val STANDARD: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.STANDARD with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType with String
      ] = js.native
  }
  
}

