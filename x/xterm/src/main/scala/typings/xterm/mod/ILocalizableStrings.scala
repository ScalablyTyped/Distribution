package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalizableStrings extends StObject {
  
  /**
    * The aria label for the underlying input textarea for the terminal.
    */
  var promptLabel: String
  
  /**
    * Announcement for when line reading is suppressed due to too many lines
    * being printed to the terminal when `screenReaderMode` is enabled.
    */
  var tooMuchOutput: String
}
object ILocalizableStrings {
  
  inline def apply(promptLabel: String, tooMuchOutput: String): ILocalizableStrings = {
    val __obj = js.Dynamic.literal(promptLabel = promptLabel.asInstanceOf[js.Any], tooMuchOutput = tooMuchOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalizableStrings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILocalizableStrings] (val x: Self) extends AnyVal {
    
    inline def setPromptLabel(value: String): Self = StObject.set(x, "promptLabel", value.asInstanceOf[js.Any])
    
    inline def setTooMuchOutput(value: String): Self = StObject.set(x, "tooMuchOutput", value.asInstanceOf[js.Any])
  }
}
