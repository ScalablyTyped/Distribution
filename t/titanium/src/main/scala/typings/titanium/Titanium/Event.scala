package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base type for all Titanium events.
  */
@js.native
trait Event extends StObject {
  
  /**
    * True if the event will try to bubble up if possible.
    */
  val bubbles: Boolean = js.native
  
  /**
    * Set to true to stop the event from bubbling.
    */
  var cancelBubble: Boolean = js.native
  
  /**
    * Source object that fired the event.
    */
  val source: js.Any = js.native
  
  /**
    * Name of the event fired.
    */
  val `type`: String = js.native
}
object Event {
  
  @scala.inline
  def apply(bubbles: Boolean, cancelBubble: Boolean, source: js.Any, `type`: String): Event = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
