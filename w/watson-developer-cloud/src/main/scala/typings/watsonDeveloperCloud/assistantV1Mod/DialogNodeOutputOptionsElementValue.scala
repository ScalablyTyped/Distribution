package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object defining the message input to be sent to the Watson Assistant service if the user selects the corresponding option. */
trait DialogNodeOutputOptionsElementValue extends StObject {
  
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.undefined
}
object DialogNodeOutputOptionsElementValue {
  
  inline def apply(): DialogNodeOutputOptionsElementValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodeOutputOptionsElementValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogNodeOutputOptionsElementValue] (val x: Self) extends AnyVal {
    
    inline def setInput(value: MessageInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
  }
}
