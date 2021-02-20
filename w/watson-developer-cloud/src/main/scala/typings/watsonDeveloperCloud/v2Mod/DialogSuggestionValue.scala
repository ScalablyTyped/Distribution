package typings.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object defining the message input to be sent to the assistant if the user selects the corresponding disambiguation option. */
@js.native
trait DialogSuggestionValue extends StObject {
  
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.native
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
    def setInput(value: MessageInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
  }
}
