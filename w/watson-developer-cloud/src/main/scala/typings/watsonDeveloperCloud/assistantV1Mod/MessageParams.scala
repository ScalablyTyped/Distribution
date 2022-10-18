package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * request interfaces
  ************************/
/** Parameters for the `message` operation. */
trait MessageParams extends StObject {
  
  /** Whether to return more than one intent. A value of `true` indicates that all matching intents are returned. */
  var alternate_intents: js.UndefOr[Boolean] = js.undefined
  
  /** State information for the conversation. To maintain state, include the context from the previous response. */
  var context: js.UndefOr[Context] = js.undefined
  
  /** Entities to use when evaluating the message. Include entities from the previous response to continue using those entities rather than detecting entities in the new input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.undefined
  
  /** Intents to use when evaluating the user input. Include intents from the previous response to continue using those intents rather than trying to recognize intents in the new input. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.undefined
  
  /** Whether to include additional diagnostic information about the dialog nodes that were visited during processing of the message. */
  var nodes_visited_details: js.UndefOr[Boolean] = js.undefined
  
  /** An output object that includes the response to the user, the dialog nodes that were triggered, and messages from the log. */
  var output: js.UndefOr[OutputData] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** Unique identifier of the workspace. */
  var workspace_id: String
}
object MessageParams {
  
  inline def apply(workspace_id: String): MessageParams = {
    val __obj = js.Dynamic.literal(workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageParams]
  }
  
  extension [Self <: MessageParams](x: Self) {
    
    inline def setAlternate_intents(value: Boolean): Self = StObject.set(x, "alternate_intents", value.asInstanceOf[js.Any])
    
    inline def setAlternate_intentsUndefined: Self = StObject.set(x, "alternate_intents", js.undefined)
    
    inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEntities(value: js.Array[RuntimeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: RuntimeEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setInput(value: MessageInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setIntents(value: js.Array[RuntimeIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: RuntimeIntent*): Self = StObject.set(x, "intents", js.Array(value*))
    
    inline def setNodes_visited_details(value: Boolean): Self = StObject.set(x, "nodes_visited_details", value.asInstanceOf[js.Any])
    
    inline def setNodes_visited_detailsUndefined: Self = StObject.set(x, "nodes_visited_details", js.undefined)
    
    inline def setOutput(value: OutputData): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
