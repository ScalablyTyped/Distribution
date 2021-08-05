package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Drawer")
@js.native
/* private */ class Drawer_ () extends ContentView_[Widget] {
  
  /**
    * Closes the drawer.
    */
  def close(): this.type = js.native
  
  /**
    * Fired when the drawer is closed and has reached its resting position.
    */
  var onClose: Listeners[EventObject[this.type]] = js.native
  
  /**
    * Fired when the drawer is opened and has reached its resting position.
    */
  var onOpen: Listeners[EventObject[this.type]] = js.native
  
  /**
    * Opens the drawer. It may be useful to call this method on first startup, so that users notice the
    * drawer and its contents.
    */
  def open(): this.type = js.native
}
