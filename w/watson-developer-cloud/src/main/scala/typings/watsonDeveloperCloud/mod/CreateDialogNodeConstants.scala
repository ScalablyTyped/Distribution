package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createDialogNode` operation. */
object CreateDialogNodeConstants {
  
  @js.native
  sealed trait DigressIn extends StObject
  /** Whether this top-level dialog node can be digressed into. */
  @JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.DigressIn")
  @js.native
  object DigressIn extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DigressIn with String] = js.native
    
    @js.native
    sealed trait DOES_NOT_RETURN extends DigressIn
    /* "does_not_return" */ val DOES_NOT_RETURN: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn.DOES_NOT_RETURN with String = js.native
    
    @js.native
    sealed trait NOT_AVAILABLE extends DigressIn
    /* "not_available" */ val NOT_AVAILABLE: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn.NOT_AVAILABLE with String = js.native
    
    @js.native
    sealed trait RETURNS extends DigressIn
    /* "returns" */ val RETURNS: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn.RETURNS with String = js.native
  }
  
  @js.native
  sealed trait DigressOut extends StObject
  /** Whether this dialog node can be returned to after a digression. */
  @JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.DigressOut")
  @js.native
  object DigressOut extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DigressOut with String] = js.native
    
    @js.native
    sealed trait ALLOW_ALL extends DigressOut
    /* "allow_all" */ val ALLOW_ALL: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL with String = js.native
    
    @js.native
    sealed trait ALLOW_ALL_NEVER_RETURN extends DigressOut
    /* "allow_all_never_return" */ val ALLOW_ALL_NEVER_RETURN: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL_NEVER_RETURN with String = js.native
    
    @js.native
    sealed trait ALLOW_RETURNING extends DigressOut
    /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut.ALLOW_RETURNING with String = js.native
  }
  
  @js.native
  sealed trait DigressOutSlots extends StObject
  /** Whether the user can digress to top-level nodes while filling out slots. */
  @JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.DigressOutSlots")
  @js.native
  object DigressOutSlots extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DigressOutSlots with String] = js.native
    
    @js.native
    sealed trait ALLOW_ALL extends DigressOutSlots
    /* "allow_all" */ val ALLOW_ALL: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots.ALLOW_ALL with String = js.native
    
    @js.native
    sealed trait ALLOW_RETURNING extends DigressOutSlots
    /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots.ALLOW_RETURNING with String = js.native
    
    @js.native
    sealed trait NOT_ALLOWED extends DigressOutSlots
    /* "not_allowed" */ val NOT_ALLOWED: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots.NOT_ALLOWED with String = js.native
  }
  
  @js.native
  sealed trait EventName extends StObject
  /** How an `event_handler` node is processed. */
  @JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.EventName")
  @js.native
  object EventName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventName with String] = js.native
    
    @js.native
    sealed trait DIGRESSION_RETURN_PROMPT extends EventName
    /* "digression_return_prompt" */ val DIGRESSION_RETURN_PROMPT: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.DIGRESSION_RETURN_PROMPT with String = js.native
    
    @js.native
    sealed trait FILLED extends EventName
    /* "filled" */ val FILLED: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.FILLED with String = js.native
    
    @js.native
    sealed trait FILLED_MULTIPLE extends EventName
    /* "filled_multiple" */ val FILLED_MULTIPLE: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.FILLED_MULTIPLE with String = js.native
    
    @js.native
    sealed trait FOCUS extends EventName
    /* "focus" */ val FOCUS: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.FOCUS with String = js.native
    
    @js.native
    sealed trait GENERIC extends EventName
    /* "generic" */ val GENERIC: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.GENERIC with String = js.native
    
    @js.native
    sealed trait INPUT extends EventName
    /* "input" */ val INPUT: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.INPUT with String = js.native
    
    @js.native
    sealed trait NOMATCH extends EventName
    /* "nomatch" */ val NOMATCH: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.NOMATCH with String = js.native
    
    @js.native
    sealed trait NOMATCH_RESPONSES_DEPLETED extends EventName
    /* "nomatch_responses_depleted" */ val NOMATCH_RESPONSES_DEPLETED: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.NOMATCH_RESPONSES_DEPLETED with String = js.native
    
    @js.native
    sealed trait VALIDATE extends EventName
    /* "validate" */ val VALIDATE: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.VALIDATE with String = js.native
  }
  
  @js.native
  sealed trait NodeType extends StObject
  /** How the dialog node is processed. */
  @JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NodeType with String] = js.native
    
    @js.native
    sealed trait EVENT_HANDLER extends NodeType
    /* "event_handler" */ val EVENT_HANDLER: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.EVENT_HANDLER with String = js.native
    
    @js.native
    sealed trait FOLDER extends NodeType
    /* "folder" */ val FOLDER: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.FOLDER with String = js.native
    
    @js.native
    sealed trait FRAME extends NodeType
    /* "frame" */ val FRAME: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.FRAME with String = js.native
    
    @js.native
    sealed trait RESPONSE_CONDITION extends NodeType
    /* "response_condition" */ val RESPONSE_CONDITION: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.RESPONSE_CONDITION with String = js.native
    
    @js.native
    sealed trait SLOT extends NodeType
    /* "slot" */ val SLOT: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.SLOT with String = js.native
    
    @js.native
    sealed trait STANDARD extends NodeType
    /* "standard" */ val STANDARD: typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.STANDARD with String = js.native
  }
}
