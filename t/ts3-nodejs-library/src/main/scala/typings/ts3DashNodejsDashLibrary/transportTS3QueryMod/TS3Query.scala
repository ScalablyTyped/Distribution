package typings.ts3DashNodejsDashLibrary.transportTS3QueryMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TS3Query extends EventEmitter {
  /**
    * Sends a command to the TeamSpeak Server.
    * @param - parameters which should get executed
    * @returns - a Promise object which returns the Information about the Query executed
    */
  def execute(args: js.Any*): js.Promise[_] = js.native
  /**
    * Whether Double Events should be handled or not
    * @param - Parameter enables or disables the Double Event Handling. Defaults to true.
    */
  def handleDoubleEvents(): Unit = js.native
  def handleDoubleEvents(b: Boolean): Unit = js.native
  /**
    * Emits an Error which the given arguments
    * @param - arguments which gets passed to the error event
    */
  def handleError(args: js.Any*): Unit = js.native
  /**
    * Handles any TeamSpeak Query Response Line
    * @param - error line from teamspeak
    */
  def handleLine(line: String): Unit = js.native
  /**
    * Handles the error line which finnishes a command
    * @param - error line from teamspeak
    */
  def handleQueryError(line: String): Unit = js.native
  /**
    * Handles an event which has been received from the TeamSpeak Server
    * @param - event line from TeamSpeak
    */
  def handleQueryEvent(line: String): Unit = js.native
  /**
    * Sends keepalive to the TeamSpeak Server so the connection will not be closed
    */
  def keepAlive(): Unit = js.native
}

