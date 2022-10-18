package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An input object that includes the input text. */
trait MessageInput
  extends StObject
     with /** QueryNoticesResult accepts additional properties. */
/* propName */ StringDictionary[Any] {
  
  /** The text of the user input. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var text: js.UndefOr[String] = js.undefined
}
object MessageInput {
  
  inline def apply(): MessageInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageInput]
  }
  
  extension [Self <: MessageInput](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
