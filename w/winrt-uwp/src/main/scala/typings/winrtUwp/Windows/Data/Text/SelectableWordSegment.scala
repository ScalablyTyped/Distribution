package typings.winrtUwp.Windows.Data.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a segment from your provided text that includes a word and any trailing whitespace and/or punctuation after this word. */
trait SelectableWordSegment extends StObject {
  
  /** Gets the TextSegment that identifies the source text's sub-string that is the selected word. */
  var sourceTextSegment: TextSegment
  
  /** Gets the text of the selected word identified by this SelectableWordSegment object. */
  var text: String
}
object SelectableWordSegment {
  
  @scala.inline
  def apply(sourceTextSegment: TextSegment, text: String): SelectableWordSegment = {
    val __obj = js.Dynamic.literal(sourceTextSegment = sourceTextSegment.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectableWordSegment]
  }
  
  @scala.inline
  implicit class SelectableWordSegmentMutableBuilder[Self <: SelectableWordSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceTextSegment(value: TextSegment): Self = StObject.set(x, "sourceTextSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
