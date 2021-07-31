package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `updateDialogNode` operation. */
object UpdateDialogNodeConstants {
  
  @js.native
  sealed trait DigressIn extends StObject
  /** Whether this top-level dialog node can be digressed into. */
  @JSImport("watson-developer-cloud/assistant/v1", "UpdateDialogNodeConstants.DigressIn")
  @js.native
  object DigressIn extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DigressIn & String] = js.native
    
    @js.native
    sealed trait DOES_NOT_RETURN
      extends StObject
         with DigressIn
    /* "does_not_return" */ val DOES_NOT_RETURN: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressIn.DOES_NOT_RETURN & String = js.native
    
    @js.native
    sealed trait NOT_AVAILABLE
      extends StObject
         with DigressIn
    /* "not_available" */ val NOT_AVAILABLE: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressIn.NOT_AVAILABLE & String = js.native
    
    @js.native
    sealed trait RETURNS
      extends StObject
         with DigressIn
    /* "returns" */ val RETURNS: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressIn.RETURNS & String = js.native
  }
  
  @js.native
  sealed trait DigressOut extends StObject
  /** Whether this dialog node can be returned to after a digression. */
  @JSImport("watson-developer-cloud/assistant/v1", "UpdateDialogNodeConstants.DigressOut")
  @js.native
  object DigressOut extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DigressOut & String] = js.native
    
    @js.native
    sealed trait ALLOW_ALL
      extends StObject
         with DigressOut
    /* "allow_all" */ val ALLOW_ALL: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOut.ALLOW_ALL & String = js.native
    
    @js.native
    sealed trait ALLOW_ALL_NEVER_RETURN
      extends StObject
         with DigressOut
    /* "allow_all_never_return" */ val ALLOW_ALL_NEVER_RETURN: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOut.ALLOW_ALL_NEVER_RETURN & String = js.native
    
    @js.native
    sealed trait ALLOW_RETURNING
      extends StObject
         with DigressOut
    /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOut.ALLOW_RETURNING & String = js.native
  }
  
  @js.native
  sealed trait DigressOutSlots extends StObject
  /** Whether the user can digress to top-level nodes while filling out slots. */
  @JSImport("watson-developer-cloud/assistant/v1", "UpdateDialogNodeConstants.DigressOutSlots")
  @js.native
  object DigressOutSlots extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DigressOutSlots & String] = js.native
    
    @js.native
    sealed trait ALLOW_ALL
      extends StObject
         with DigressOutSlots
    /* "allow_all" */ val ALLOW_ALL: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOutSlots.ALLOW_ALL & String = js.native
    
    @js.native
    sealed trait ALLOW_RETURNING
      extends StObject
         with DigressOutSlots
    /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOutSlots.ALLOW_RETURNING & String = js.native
    
    @js.native
    sealed trait NOT_ALLOWED
      extends StObject
         with DigressOutSlots
    /* "not_allowed" */ val NOT_ALLOWED: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOutSlots.NOT_ALLOWED & String = js.native
  }
  
  @js.native
  sealed trait EventName extends StObject
  /** How an `event_handler` node is processed. */
  @JSImport("watson-developer-cloud/assistant/v1", "UpdateDialogNodeConstants.EventName")
  @js.native
  object EventName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventName & String] = js.native
    
    @js.native
    sealed trait DIGRESSION_RETURN_PROMPT
      extends StObject
         with EventName
    /* "digression_return_prompt" */ val DIGRESSION_RETURN_PROMPT: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.DIGRESSION_RETURN_PROMPT & String = js.native
    
    @js.native
    sealed trait FILLED
      extends StObject
         with EventName
    /* "filled" */ val FILLED: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.FILLED & String = js.native
    
    @js.native
    sealed trait FILLED_MULTIPLE
      extends StObject
         with EventName
    /* "filled_multiple" */ val FILLED_MULTIPLE: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.FILLED_MULTIPLE & String = js.native
    
    @js.native
    sealed trait FOCUS
      extends StObject
         with EventName
    /* "focus" */ val FOCUS: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.FOCUS & String = js.native
    
    @js.native
    sealed trait GENERIC
      extends StObject
         with EventName
    /* "generic" */ val GENERIC: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.GENERIC & String = js.native
    
    @js.native
    sealed trait INPUT
      extends StObject
         with EventName
    /* "input" */ val INPUT: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.INPUT & String = js.native
    
    @js.native
    sealed trait NOMATCH
      extends StObject
         with EventName
    /* "nomatch" */ val NOMATCH: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.NOMATCH & String = js.native
    
    @js.native
    sealed trait NOMATCH_RESPONSES_DEPLETED
      extends StObject
         with EventName
    /* "nomatch_responses_depleted" */ val NOMATCH_RESPONSES_DEPLETED: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.NOMATCH_RESPONSES_DEPLETED & String = js.native
    
    @js.native
    sealed trait VALIDATE
      extends StObject
         with EventName
    /* "validate" */ val VALIDATE: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.VALIDATE & String = js.native
  }
  
  @js.native
  sealed trait NodeType extends StObject
  /** How the dialog node is processed. */
  @JSImport("watson-developer-cloud/assistant/v1", "UpdateDialogNodeConstants.NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NodeType & String] = js.native
    
    @js.native
    sealed trait EVENT_HANDLER
      extends StObject
         with NodeType
    /* "event_handler" */ val EVENT_HANDLER: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType.EVENT_HANDLER & String = js.native
    
    @js.native
    sealed trait FOLDER
      extends StObject
         with NodeType
    /* "folder" */ val FOLDER: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType.FOLDER & String = js.native
    
    @js.native
    sealed trait FRAME
      extends StObject
         with NodeType
    /* "frame" */ val FRAME: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType.FRAME & String = js.native
    
    @js.native
    sealed trait RESPONSE_CONDITION
      extends StObject
         with NodeType
    /* "response_condition" */ val RESPONSE_CONDITION: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType.RESPONSE_CONDITION & String = js.native
    
    @js.native
    sealed trait SLOT
      extends StObject
         with NodeType
    /* "slot" */ val SLOT: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType.SLOT & String = js.native
    
    @js.native
    sealed trait STANDARD
      extends StObject
         with NodeType
    /* "standard" */ val STANDARD: typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType.STANDARD & String = js.native
  }
}
