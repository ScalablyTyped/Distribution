package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object defining the message input to be sent to the Watson Assistant service if the user selects the corresponding option. */
trait DialogNodeOutputOptionsElementValue extends StObject {
  
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.undefined
}
object DialogNodeOutputOptionsElementValue {
  
  @scala.inline
  def apply(): DialogNodeOutputOptionsElementValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodeOutputOptionsElementValue]
  }
  
  @scala.inline
  implicit class DialogNodeOutputOptionsElementValueMutableBuilder[Self <: DialogNodeOutputOptionsElementValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: MessageInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
  }
}
