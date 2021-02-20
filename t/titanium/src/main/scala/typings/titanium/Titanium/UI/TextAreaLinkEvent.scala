package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when user interacts with a URL in the text area. See [handleLinks](Titanium.UI.TextArea.handleLinks).
  */
@js.native
trait TextAreaLinkEvent extends TextAreaBaseEvent {
  
  /**
    * This is false. This event does not bubble.
    */
  var bubbles: Boolean = js.native
  
  /**
    * An array of two numbers [location, length] describing the character range of the text associated with this URL.
    */
  var range: js.Array[_] = js.native
  
  /**
    * The URL that is associated with this event.
    */
  var url: String = js.native
}
object TextAreaLinkEvent {
  
  @scala.inline
  def apply(bubbles: Boolean, range: js.Array[_], source: TextArea, url: String): TextAreaLinkEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaLinkEvent]
  }
  
  @scala.inline
  implicit class TextAreaLinkEventMutableBuilder[Self <: TextAreaLinkEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: js.Array[_]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeVarargs(value: js.Any*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
