package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object defining the message input, intents, and entities to be sent to the Watson Assistant service if the user selects the corresponding disambiguation option. */
trait DialogSuggestionValue extends StObject {
  
  /** An array of entities to be sent along with the user input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.undefined
  
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.undefined
  
  /** An array of intents to be sent along with the user input. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.undefined
}
object DialogSuggestionValue {
  
  @scala.inline
  def apply(): DialogSuggestionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogSuggestionValue]
  }
  
  @scala.inline
  implicit class DialogSuggestionValueMutableBuilder[Self <: DialogSuggestionValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[RuntimeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: RuntimeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: MessageInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setIntents(value: js.Array[RuntimeIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: RuntimeIntent*): Self = StObject.set(x, "intents", js.Array(value :_*))
  }
}
