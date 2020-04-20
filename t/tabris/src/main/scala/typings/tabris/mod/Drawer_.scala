package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Drawer")
@js.native
class Drawer_ protected () extends ContentView_[Widget] {
  /**
    * Fired when the drawer is closed and has reached its resting position.
    */
  var onClose: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the drawer is opened and has reached its resting position.
    */
  var onOpen: Listeners[EventObject[this.type]] = js.native
  /**
    * Closes the drawer.
    */
  def close(): this.type = js.native
  /**
    * Opens the drawer. It may be useful to call this method on first startup, so that users notice the
    * drawer and its contents.
    */
  def open(): this.type = js.native
}

