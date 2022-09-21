package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Drawer")
@js.native
/**
  * A drawer that can be swiped in from the left edge of the screen. There's only a single instance that
  * can be accessed via `tabris.drawer`. The drawer is locked by default. To use it in an application,
  * set the property `enabled` to `true`. The drawer can contain any kind of widgets.
  * 
  * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
  * object which may include (in addition to the properties) children, event listeners and layout
  * shorthands.
  */
/* private */ open class Drawer_ () extends ContentView_[Widget[Any]] {
  
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
