package typings.titanium.global.Titanium.UI.iOS

import typings.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of constants for the animation styles used for view transitions.
  * One of the group of animation style constants
  *   * [CURL_DOWN](Titanium.UI.iOS.AnimationStyle.CURL_DOWN)
  *   * [CURL_UP](Titanium.UI.iOS.AnimationStyle.CURL_UP)
  *   * [FLIP_FROM_LEFT](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_LEFT)
  *   * [FLIP_FROM_RIGHT](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_RIGHT)
  *   * [FLIP_FROM_TOP](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_TOP)
  *   * [FLIP_FROM_BOTTOM](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_BOTTOM)
  *   * [CROSS_DISSOLVE](Titanium.UI.iOS.AnimationStyle.CROSS_DISSOLVE)
  *   * [NONE](Titanium.UI.iOS.AnimationStyle.NONE)
  */
@JSGlobal("Titanium.UI.iOS.AnimationStyle")
@js.native
object AnimationStyle extends js.Object {
  /**
    * A transition that dissolves from one view to the next.
    */
  val CROSS_DISSOLVE: Double = js.native
  /**
    * Curl downwards during a transition animation.
    */
  val CURL_DOWN: Double = js.native
  /**
    * Curl upwards during a transition animation.
    */
  val CURL_UP: Double = js.native
  /**
    * Flip from bottom to top during a transition animation.
    */
  val FLIP_FROM_BOTTOM: Double = js.native
  /**
    * Flip from left to right during a transition animation.
    */
  val FLIP_FROM_LEFT: Double = js.native
  /**
    * Flip from right to left during a transition animation.
    */
  val FLIP_FROM_RIGHT: Double = js.native
  /**
    * Flip from top to bottom during a transition animation.
    */
  val FLIP_FROM_TOP: Double = js.native
  /**
    * No animation.
    */
  val NONE: Double = js.native
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

