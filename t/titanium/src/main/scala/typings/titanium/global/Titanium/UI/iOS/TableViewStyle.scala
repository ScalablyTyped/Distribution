package typings.titanium.global.Titanium.UI.iOS

import typings.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of constants for the style that can be used for the `style` property of
  * <Titanium.UI.TableView> and <Titanium.UI.ListView>.
  */
@JSGlobal("Titanium.UI.iOS.TableViewStyle")
@js.native
object TableViewStyle extends js.Object {
  
  /**
    * A table view whose sections present distinct groups of rows. The section headers and footers
    * do not float.
    */
  val GROUPED: Double = js.native
  
  /**
    * A table view whose sections present distinct groups of rows  and grouped sections are inset with rounded corners.
    * The section headers and footers do not float.
    */
  val INSET_GROUPED: Double = js.native
  
  /**
    * A plain table view. Any section headers or footers are displayed as inline separators and
    * float when the table view is scrolled.
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
