package typings.watsonDeveloperCloud.assistantV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An input object that includes the input text. */
trait MessageInput extends StObject {
  
  /** Entities to use when evaluating the message. Include entities from the previous response to continue using those entities rather than detecting entities in the new input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.undefined
  
  /** Intents to use when evaluating the user input. Include intents from the previous response to continue using those intents rather than trying to recognize intents in the new input. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.undefined
  
  /** The type of user input. Currently, only text input is supported. */
  var message_type: js.UndefOr[String] = js.undefined
  
  /** Optional properties that control how the assistant responds. */
  var options: js.UndefOr[MessageInputOptions] = js.undefined
  
  /** For internal use only. */
  var suggestion_id: js.UndefOr[String] = js.undefined
  
  /** The text of the user input. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var text: js.UndefOr[String] = js.undefined
}
object MessageInput {
  
  inline def apply(): MessageInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageInput]
  }
  
  extension [Self <: MessageInput](x: Self) {
    
    inline def setEntities(value: js.Array[RuntimeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: RuntimeEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setIntents(value: js.Array[RuntimeIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: RuntimeIntent*): Self = StObject.set(x, "intents", js.Array(value*))
    
    inline def setMessage_type(value: String): Self = StObject.set(x, "message_type", value.asInstanceOf[js.Any])
    
    inline def setMessage_typeUndefined: Self = StObject.set(x, "message_type", js.undefined)
    
    inline def setOptions(value: MessageInputOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSuggestion_id(value: String): Self = StObject.set(x, "suggestion_id", value.asInstanceOf[js.Any])
    
    inline def setSuggestion_idUndefined: Self = StObject.set(x, "suggestion_id", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
