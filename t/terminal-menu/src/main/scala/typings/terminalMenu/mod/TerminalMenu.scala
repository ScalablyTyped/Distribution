package typings.terminalMenu.mod

import typings.node.NodeJS.EventEmitter
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminalMenu extends EventEmitter {
  /**
    * Create a new selectable menu item with label as the anchor.
    * @param label Label to use as the menu item anchor.
    */
  def add(label: String): Unit = js.native
  /**
    * Create a new selectable menu item with label as the anchor.
    * @param label Label to use as the menu item anchor.
    * @param callback Callback to invoke when the menu item is selected.
    */
  def add(label: String, callback: js.Function2[/* label */ String, /* index */ Double, Unit]): Unit = js.native
  /**
    * Unregister all listeners and puts the terminal back to its original state.
    */
  def close(): Unit = js.native
  /**
    * Return a duplex stream to wire up input and output.
    */
  def createStream(): Duplex = js.native
  /**
    * When a menu item is selected, this event is fired.
    * @param eventName Name of the event. Only value available for eventName is "select"
    * @param callback Handler for the event specified by eventName
    */
  def on(eventName: String, callback: js.Function2[/* label */ String, /* index */ Double, Unit]): this.type = js.native
  def on(eventName: js.Symbol, callback: js.Function2[/* label */ String, /* index */ Double, Unit]): this.type = js.native
  /**
    * Reset the terminal, clearing all content.
    */
  def reset(): Unit = js.native
  /**
    * Writes a message to the terminal.
    * @param msg Message to be written.
    */
  def write(msg: String): Unit = js.native
}

