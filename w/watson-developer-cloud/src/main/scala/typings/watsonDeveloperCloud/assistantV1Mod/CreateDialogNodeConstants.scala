package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def apply(value: String): js.UndefOr[DigressIn & String] = js.native
    
    @js.native
    sealed trait DOES_NOT_RETURN
      extends StObject
         with DigressIn
    /* "does_not_return" */ val DOES_NOT_RETURN: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressIn.DOES_NOT_RETURN & String = js.native
    
    @js.native
    sealed trait NOT_AVAILABLE
      extends StObject
         with DigressIn
    /* "not_available" */ val NOT_AVAILABLE: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressIn.NOT_AVAILABLE & String = js.native
    
    @js.native
    sealed trait RETURNS
      extends StObject
         with DigressIn
    /* "returns" */ val RETURNS: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressIn.RETURNS & String = js.native
  }
  
  @js.native
  sealed trait DigressOut extends StObject
  /** Whether this dialog node can be returned to after a digression. */
  @JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.DigressOut")
  @js.native
  object DigressOut extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DigressOut & String] = js.native
    
    @js.native
    sealed trait ALLOW_ALL
      extends StObject
         with DigressOut
    /* "allow_all" */ val ALLOW_ALL: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL & String = js.native
    
    @js.native
    sealed trait ALLOW_ALL_NEVER_RETURN
      extends StObject
         with DigressOut
    /* "allow_all_never_return" */ val ALLOW_ALL_NEVER_RETURN: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL_NEVER_RETURN & String = js.native
    
    @js.native
    sealed trait ALLOW_RETURNING
      extends StObject
         with DigressOut
    /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOut.ALLOW_RETURNING & String = js.native
  }
  
  @js.native
  sealed trait DigressOutSlots extends StObject
  /** Whether the user can digress to top-level nodes while filling out slots. */
  @JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.DigressOutSlots")
  @js.native
  object DigressOutSlots extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DigressOutSlots & String] = js.native
    
    @js.native
    sealed trait ALLOW_ALL
      extends StObject
         with DigressOutSlots
    /* "allow_all" */ val ALLOW_ALL: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOutSlots.ALLOW_ALL & String = js.native
    
    @js.native
    sealed trait ALLOW_RETURNING
      extends StObject
         with DigressOutSlots
    /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOutSlots.ALLOW_RETURNING & String = js.native
    
    @js.native
    sealed trait NOT_ALLOWED
      extends StObject
         with DigressOutSlots
    /* "not_allowed" */ val NOT_ALLOWED: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOutSlots.NOT_ALLOWED & String = js.native
  }
  
  @js.native
  sealed trait EventName extends StObject
  /** How an `event_handler` node is processed. */
  @JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.EventName")
  @js.native
  object EventName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventName & String] = js.native
    
    @js.native
    sealed trait DIGRESSION_RETURN_PROMPT
      extends StObject
         with EventName
    /* "digression_return_prompt" */ val DIGRESSION_RETURN_PROMPT: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.DIGRESSION_RETURN_PROMPT & String = js.native
    
    @js.native
    sealed trait FILLED
      extends StObject
         with EventName
    /* "filled" */ val FILLED: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.FILLED & String = js.native
    
    @js.native
    sealed trait FILLED_MULTIPLE
      extends StObject
         with EventName
    /* "filled_multiple" */ val FILLED_MULTIPLE: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.FILLED_MULTIPLE & String = js.native
    
    @js.native
    sealed trait FOCUS
      extends StObject
         with EventName
    /* "focus" */ val FOCUS: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.FOCUS & String = js.native
    
    @js.native
    sealed trait GENERIC
      extends StObject
         with EventName
    /* "generic" */ val GENERIC: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.GENERIC & String = js.native
    
    @js.native
    sealed trait INPUT
      extends StObject
         with EventName
    /* "input" */ val INPUT: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.INPUT & String = js.native
    
    @js.native
    sealed trait NOMATCH
      extends StObject
         with EventName
    /* "nomatch" */ val NOMATCH: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.NOMATCH & String = js.native
    
    @js.native
    sealed trait NOMATCH_RESPONSES_DEPLETED
      extends StObject
         with EventName
    /* "nomatch_responses_depleted" */ val NOMATCH_RESPONSES_DEPLETED: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.NOMATCH_RESPONSES_DEPLETED & String = js.native
    
    @js.native
    sealed trait VALIDATE
      extends StObject
         with EventName
    /* "validate" */ val VALIDATE: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.VALIDATE & String = js.native
  }
  
  @js.native
  sealed trait NodeType extends StObject
  /** How the dialog node is processed. */
  @JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NodeType & String] = js.native
    
    @js.native
    sealed trait EVENT_HANDLER
      extends StObject
         with NodeType
    /* "event_handler" */ val EVENT_HANDLER: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType.EVENT_HANDLER & String = js.native
    
    @js.native
    sealed trait FOLDER
      extends StObject
         with NodeType
    /* "folder" */ val FOLDER: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType.FOLDER & String = js.native
    
    @js.native
    sealed trait FRAME
      extends StObject
         with NodeType
    /* "frame" */ val FRAME: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType.FRAME & String = js.native
    
    @js.native
    sealed trait RESPONSE_CONDITION
      extends StObject
         with NodeType
    /* "response_condition" */ val RESPONSE_CONDITION: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType.RESPONSE_CONDITION & String = js.native
    
    @js.native
    sealed trait SLOT
      extends StObject
         with NodeType
    /* "slot" */ val SLOT: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType.SLOT & String = js.native
    
    @js.native
    sealed trait STANDARD
      extends StObject
         with NodeType
    /* "standard" */ val STANDARD: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType.STANDARD & String = js.native
  }
}
