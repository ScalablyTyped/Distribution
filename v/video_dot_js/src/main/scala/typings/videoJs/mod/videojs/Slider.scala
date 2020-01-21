package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.EventTarget.Event
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
  def calculateDistance(event: Event): Double = js.native
  /**
    * Disable controls for this slider if they are enabled
    */
  def disable(): Unit = js.native
  /**
    * Enable controls for this slider if they are disabled
    */
  def enable(): Unit = js.native
  /**
    * Are controls are currently enabled for this slider or not.
    *
    * @return true if controls are enabled, false otherwise
    */
  def enabled(): Boolean = js.native
  /**
    * Handle a `blur` event on this `Slider`.
    *
    * @listens blur
    */
  def handleBlur(): Unit = js.native
  /**
    * Listener for click events on slider, used to prevent clicks
    *   from bubbling up to parent elements like button menus.
    *
    * @param event
    *        Event that caused this object to run
    */
  def handleClick(event: Event): Unit = js.native
  /**
    * Handle a `focus` event on this `Slider`.
    *
    * @listens focus
    */
  def handleFocus(): Unit = js.native
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
  def handleMouseDown(event: Event): Unit = js.native
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
  def handleMouseMove(event: Event): Unit = js.native
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
  def handleMouseUp(event: Event): Unit = js.native
  /**
    * Update the progress bar of the `Slider`.
    *
    * @return The percentage of progress the progress bar represents as a
    *          number from 0 to 1.
    */
  def update(): Double = js.native
  def vertical(): Boolean = js.native
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
  def vertical(bool: Boolean): Unit = js.native
}

