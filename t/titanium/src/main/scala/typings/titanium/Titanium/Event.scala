package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The base type for all Titanium events.
	 */
trait Event extends js.Object {
  /**
  		 * True if the event will try to bubble up if possible.
  		 */
  val bubbles: Boolean
  /**
  		 * Set to true to stop the event from bubbling.
  		 */
  var cancelBubble: Boolean
  /**
  		 * Source object that fired the event.
  		 */
  val source: js.Any
  /**
  		 * Name of the event fired.
  		 */
  val `type`: String
}

object Event {
  @scala.inline
  def apply(bubbles: Boolean, cancelBubble: Boolean, source: js.Any, `type`: String): Event = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelBubble = cancelBubble, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Event]
  }
}

