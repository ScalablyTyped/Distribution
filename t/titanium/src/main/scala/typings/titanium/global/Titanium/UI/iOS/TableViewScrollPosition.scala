package typings.titanium.global.Titanium.UI.iOS

import typings.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of constants for the position value that can be used for the `position` property of
  * <Titanium.UI.TableView> when invoking `scrollToIndex`.
  */
@JSGlobal("Titanium.UI.iOS.TableViewScrollPosition")
@js.native
object TableViewScrollPosition extends js.Object {
  /**
    * The table view scrolls the row of interest to the bottom of the visible table view.
    */
  val BOTTOM: Double = js.native
  /**
    * The table view scrolls the row of interest to the middle of the visible table view.
    */
  val MIDDLE: Double = js.native
  /**
    * The table view scrolls the row of interest to be fully visible with a minimum of movement. If the row is already fully visible, no scrolling occurs. For example, if the row is above the visible area, the behavior is identical to that specified by `TOP`. This is the default.
    */
  val NONE: Double = js.native
  /**
    * The table view scrolls the row of interest to the top of the visible table view.
    */
  val TOP: Double = js.native
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

