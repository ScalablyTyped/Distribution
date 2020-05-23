package typings.titanium.global.Titanium.UI.iOS

import typings.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of constants for the system button styles that can be used for the button `style` property.
  */
@JSGlobal("Titanium.UI.iOS.SystemButtonStyle")
@js.native
object SystemButtonStyle extends js.Object {
  /**
    * A simple button style with a border.
    */
  val BORDERED: Double = js.native
  /**
    * The style for a **Done** button--for example, a button that completes some task and returns
    * to the previous view.
    */
  val DONE: Double = js.native
  /**
    * Specifies a borderless button, the default style for toolbars, button bars, and tabbed bars.
    */
  val PLAIN: Double = js.native
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

