package typings.titanium.global.Titanium.UI.iOS

import typings.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of constants for the status bar style.
  */
@JSGlobal("Titanium.UI.iOS.StatusBar")
@js.native
object StatusBar extends js.Object {
  /**
    * Fade animation style, when the status bar is hidden or shown.
    */
  val ANIMATION_STYLE_FADE: Double = js.native
  /**
    * No animation style, when the status bar is hidden or shown.
    */
  val ANIMATION_STYLE_NONE: Double = js.native
  /**
    * Slide animation style, when the status bar is hidden or shown.
    */
  val ANIMATION_STYLE_SLIDE: Double = js.native
  /**
    * Default status bar style.
    */
  val DEFAULT: Double = js.native
  /**
    * Gray-colored status bar style.
    */
  val GRAY: Double = js.native
  /**
    * Gray-colored status bar style.
    */
  val GREY: Double = js.native
  /**
    * Status bar style to use with dark backgrounds.
    */
  val LIGHT_CONTENT: Double = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
}

