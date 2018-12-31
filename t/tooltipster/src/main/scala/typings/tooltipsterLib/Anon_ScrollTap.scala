package typings
package tooltipsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScrollTap extends js.Object {
  /**
  			 * When a mouse click happens anywhere in the page. However, if the interactive option is set to true, 
  			 * a click happening inside the tooltip will not close it.
  			 */
  var click: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * When the mouse goes away from the origin. The delay option is taken into account as the delay before 
  			 * closing.
  			 */
  var mouseleave: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * When the origin is clicked by a mouse. This mimics a behavior that browsers usually have and is meant 
  			 * to be used with the mouseenter open trigger.
  			 */
  var originClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * When scrolling happens in the window or in a scrollable area which is a parent of the origin.
  			 */
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * When the finger taps (ie presses and releases) anywhere in the touch screen.
  			 */
  var tap: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * When the finger is removed from the touch screen or if the interaction was stopped by the device. The 
  			 * delayTouch option is taken into account as the delay before closing.
  			 */
  var touchleave: js.UndefOr[scala.Boolean] = js.undefined
}

