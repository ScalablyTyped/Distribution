package typings
package titaniumLib.TitaniumNs

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
  val bubbles: scala.Boolean
  /**
  		 * Set to true to stop the event from bubbling.
  		 */
  var cancelBubble: scala.Boolean
  /**
  		 * Source object that fired the event.
  		 */
  val source: js.Any
  /**
  		 * Name of the event fired.
  		 */
  val `type`: java.lang.String
}

