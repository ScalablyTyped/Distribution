package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The base functionality for a slider. Can be vertical or horizontal.
	 * For instance the volume bar or the seek bar on a video is a slider.
	 */
@js.native
trait Slider extends Component {
  @JSName("options_")
  var options__Slider: SliderOptions = js.native
  /**
  		 * Calculate distance for slider
  		 *
  		 * @param event
  		 *        The event that caused this function to run.
  		 *
  		 * @return The current position of the Slider.
  		 *         - position.x for vertical `Slider`s
  		 *         - position.y for horizontal `Slider`s
  		 */
  def calculateDistance(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Double = js.native
  /**
  		 * Disable controls for this slider if they are enabled
  		 */
  def disable(): scala.Unit = js.native
  /**
  		 * Enable controls for this slider if they are disabled
  		 */
  def enable(): scala.Unit = js.native
  /**
  		 * Are controls are currently enabled for this slider or not.
  		 *
  		 * @return true if controls are enabled, false otherwise
  		 */
  def enabled(): scala.Boolean = js.native
  /**
  		 * Handle a `blur` event on this `Slider`.
  		 *
  		 * @listens blur
  		 */
  def handleBlur(): scala.Unit = js.native
  /**
  		 * Listener for click events on slider, used to prevent clicks
  		 *   from bubbling up to parent elements like button menus.
  		 *
  		 * @param event
  		 *        Event that caused this object to run
  		 */
  def handleClick(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
  /**
  		 * Handle a `focus` event on this `Slider`.
  		 *
  		 * @listens focus
  		 */
  def handleFocus(): scala.Unit = js.native
  /**
  		 * Handle `mousedown` or `touchstart` events on the `Slider`.
  		 *
  		 * @param event
  		 *        `mousedown` or `touchstart` event that triggered this function
  		 *
  		 * @listens mousedown
  		 * @listens touchstart
  		 * @fires Slider#slideractive
  		 */
  def handleMouseDown(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
  /**
  		 * Handle the `mousemove`, `touchmove`, and `mousedown` events on this `Slider`.
  		 * The `mousemove` and `touchmove` events will only only trigger this function during
  		 * `mousedown` and `touchstart`. This is due to {@link Slider#handleMouseDown} and
  		 * {@link Slider#handleMouseUp}.
  		 *
  		 * @param event
  		 *        `mousedown`, `mousemove`, `touchstart`, or `touchmove` event that triggered
  		 *        this function
  		 *
  		 * @listens mousemove
  		 * @listens touchmove
  		 */
  def handleMouseMove(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
  /**
  		 * Handle `mouseup` or `touchend` events on the `Slider`.
  		 *
  		 * @param event
  		 *        The `mouseup` event that caused this to run.
  		 *
  		 * @listens touchend
  		 * @listens mouseup
  		 * @fires Slider#sliderinactive
  		 */
  def handleMouseUp(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
  /**
  		 * Update the progress bar of the `Slider`.
  		 *
  		 * @return The percentage of progress the progress bar represents as a
  		 *          number from 0 to 1.
  		 */
  def update(): scala.Double = js.native
  def vertical(): scala.Boolean = js.native
  /**
  		 * Get/set if slider is horizontal for vertical
  		 *
  		 * @param [bool]
  		 *        - true if slider is vertical,
  		 *        - false is horizontal
  		 *
  		 * @return - true if slider is vertical, and getting
  		 *         - false if the slider is horizontal, and getting
  		 */
  def vertical(bool: scala.Boolean): scala.Unit = js.native
}

