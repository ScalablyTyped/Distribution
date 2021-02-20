package typings.titanium.Titanium.UI

import typings.titanium.textAreaSelectedParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when text in this text area is selected.
  */
@js.native
trait TextAreaSelectedEvent extends TextAreaBaseEvent {
  
  /**
    * Dictionary that describes the position and length of the selected text.
    */
  var range: textAreaSelectedParams = js.native
}
object TextAreaSelectedEvent {
  
  @scala.inline
  def apply(range: textAreaSelectedParams, source: TextArea): TextAreaSelectedEvent = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaSelectedEvent]
  }
  
  @scala.inline
  implicit class TextAreaSelectedEventMutableBuilder[Self <: TextAreaSelectedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: textAreaSelectedParams): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
