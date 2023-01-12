package typings.watsonDeveloperCloud.assistantV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object defining the message input to be sent to the assistant if the user selects the corresponding disambiguation option. */
trait DialogSuggestionValue extends StObject {
  
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.undefined
}
object DialogSuggestionValue {
  
  inline def apply(): DialogSuggestionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogSuggestionValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogSuggestionValue] (val x: Self) extends AnyVal {
    
    inline def setInput(value: MessageInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
  }
}
