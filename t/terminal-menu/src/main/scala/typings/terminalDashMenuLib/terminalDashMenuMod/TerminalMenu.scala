package typings
package terminalDashMenuLib.terminalDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminalMenu
  extends nodeLib.NodeJSNs.EventEmitter {
  /**
    * Create a new selectable menu item with label as the anchor.
    * @param label Label to use as the menu item anchor.
    */
  def add(label: java.lang.String): scala.Unit = js.native
  /**
    * Create a new selectable menu item with label as the anchor.
    * @param label Label to use as the menu item anchor.
    * @param callback Callback to invoke when the menu item is selected.
    */
  def add(
    label: java.lang.String,
    callback: js.Function2[/* label */ java.lang.String, /* index */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Unregister all listeners and puts the terminal back to its original state.
    */
  def close(): scala.Unit = js.native
  /**
    * Return a duplex stream to wire up input and output.
    */
  def createStream(): nodeLib.streamMod.Duplex = js.native
  /**
    * When a menu item is selected, this event is fired.
    * @param eventName Name of the event. Only value available for eventName is "select"
    * @param callback Handler for the event specified by eventName
    */
  def on(
    eventName: java.lang.String,
    callback: js.Function2[/* label */ java.lang.String, /* index */ scala.Double, scala.Unit]
  ): this.type = js.native
  def on(
    eventName: js.Symbol,
    callback: js.Function2[/* label */ java.lang.String, /* index */ scala.Double, scala.Unit]
  ): this.type = js.native
  /**
    * Reset the terminal, clearing all content.
    */
  def reset(): scala.Unit = js.native
  /**
    * Writes a message to the terminal.
    * @param msg Message to be written.
    */
  def write(msg: java.lang.String): scala.Unit = js.native
}

