package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when user interacts with a URL in the Label.
  */
@js.native
trait LabelLinkEvent extends LabelBaseEvent {
  
  /**
    * This is false. This event does not bubble
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
object LabelLinkEvent {
  
  @scala.inline
  def apply(bubbles: Boolean, range: js.Array[_], source: Label, url: String): LabelLinkEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelLinkEvent]
  }
  
  @scala.inline
  implicit class LabelLinkEventOps[Self <: LabelLinkEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeVarargs(value: js.Any*): Self = this.set("range", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: js.Array[_]): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
