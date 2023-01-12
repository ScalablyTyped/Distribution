package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a line of text that is displayed with a TimedTextCue . */
trait TimedTextLine extends StObject {
  
  /** Gets a list of TimedTextSubformat objects that provide formatting for substrings within the TimedTextLine . */
  var subformats: IVector[TimedTextSubformat]
  
  /** Gets or sets the text content of the TimedTextLine . */
  var text: String
}
object TimedTextLine {
  
  inline def apply(subformats: IVector[TimedTextSubformat], text: String): TimedTextLine = {
    val __obj = js.Dynamic.literal(subformats = subformats.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimedTextLine] (val x: Self) extends AnyVal {
    
    inline def setSubformats(value: IVector[TimedTextSubformat]): Self = StObject.set(x, "subformats", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
