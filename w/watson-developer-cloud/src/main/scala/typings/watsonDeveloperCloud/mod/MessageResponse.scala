package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The response sent by the workspace, including the output text, detected intents and entities, and context. */
trait MessageResponse extends StObject {
  
  /** An array of objects describing any actions requested by the dialog node. */
  var actions: js.UndefOr[js.Array[DialogNodeAction]] = js.undefined
  
  /** Whether to return more than one intent. A value of `true` indicates that all matching intents are returned. */
  var alternate_intents: js.UndefOr[Boolean] = js.undefined
  
  /** State information for the conversation. To maintain state, include the context from the previous response. */
  var context: Context
  
  /** An array of entities identified in the user input. */
  var entities: js.Array[RuntimeEntity]
  
  /** An input object that includes the input text. */
  var input: MessageInput
  
  /** An array of intents recognized in the user input, sorted in descending order of confidence. */
  var intents: js.Array[RuntimeIntent]
  
  /** An output object that includes the response to the user, the dialog nodes that were triggered, and messages from the log. */
  var output: OutputData
}
object MessageResponse {
  
  @scala.inline
  def apply(
    context: Context,
    entities: js.Array[RuntimeEntity],
    input: MessageInput,
    intents: js.Array[RuntimeIntent],
    output: OutputData
  ): MessageResponse = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], intents = intents.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResponse]
  }
  
  @scala.inline
  implicit class MessageResponseMutableBuilder[Self <: MessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[DialogNodeAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: DialogNodeAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setAlternate_intents(value: Boolean): Self = StObject.set(x, "alternate_intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternate_intentsUndefined: Self = StObject.set(x, "alternate_intents", js.undefined)
    
    @scala.inline
    def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntities(value: js.Array[RuntimeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: RuntimeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: MessageInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntents(value: js.Array[RuntimeIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsVarargs(value: RuntimeIntent*): Self = StObject.set(x, "intents", js.Array(value :_*))
    
    @scala.inline
    def setOutput(value: OutputData): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
