package typings.watsonDeveloperCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createDialogNode` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateDialogNodeConstants")
@js.native
object CreateDialogNodeConstants extends js.Object {
  
  /** Whether this top-level dialog node can be digressed into. */
  @js.native
  object DigressIn extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn with String] = js.native
    
    /* "does_not_return" */ val DOES_NOT_RETURN: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn.DOES_NOT_RETURN with String = js.native
    
    /* "not_available" */ val NOT_AVAILABLE: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn.NOT_AVAILABLE with String = js.native
    
    /* "returns" */ val RETURNS: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn.RETURNS with String = js.native
  }
  
  /** Whether this dialog node can be returned to after a digression. */
  @js.native
  object DigressOut extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut with String
      ] = js.native
    
    /* "allow_all" */ val ALLOW_ALL: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL with String = js.native
    
    /* "allow_all_never_return" */ val ALLOW_ALL_NEVER_RETURN: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL_NEVER_RETURN with String = js.native
    
    /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut.ALLOW_RETURNING with String = js.native
  }
  
  /** Whether the user can digress to top-level nodes while filling out slots. */
  @js.native
  object DigressOutSlots extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots with String
      ] = js.native
    
    /* "allow_all" */ val ALLOW_ALL: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots.ALLOW_ALL with String = js.native
    
    /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots.ALLOW_RETURNING with String = js.native
    
    /* "not_allowed" */ val NOT_ALLOWED: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots.NOT_ALLOWED with String = js.native
  }
  
  /** How an `event_handler` node is processed. */
  @js.native
  object EventName extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName with String] = js.native
    
    /* "digression_return_prompt" */ val DIGRESSION_RETURN_PROMPT: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.DIGRESSION_RETURN_PROMPT with String = js.native
    
    /* "filled" */ val FILLED: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.FILLED with String = js.native
    
    /* "filled_multiple" */ val FILLED_MULTIPLE: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.FILLED_MULTIPLE with String = js.native
    
    /* "focus" */ val FOCUS: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.FOCUS with String = js.native
    
    /* "generic" */ val GENERIC: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.GENERIC with String = js.native
    
    /* "input" */ val INPUT: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.INPUT with String = js.native
    
    /* "nomatch" */ val NOMATCH: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.NOMATCH with String = js.native
    
    /* "nomatch_responses_depleted" */ val NOMATCH_RESPONSES_DEPLETED: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.NOMATCH_RESPONSES_DEPLETED with String = js.native
    
    /* "validate" */ val VALIDATE: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.VALIDATE with String = js.native
  }
  
  /** How the dialog node is processed. */
  @js.native
  object NodeType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType with String] = js.native
    
    /* "event_handler" */ val EVENT_HANDLER: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.EVENT_HANDLER with String = js.native
    
    /* "folder" */ val FOLDER: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.FOLDER with String = js.native
    
    /* "frame" */ val FRAME: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.FRAME with String = js.native
    
    /* "response_condition" */ val RESPONSE_CONDITION: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.RESPONSE_CONDITION with String = js.native
    
    /* "slot" */ val SLOT: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.SLOT with String = js.native
    
    /* "standard" */ val STANDARD: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.STANDARD with String = js.native
  }
}
