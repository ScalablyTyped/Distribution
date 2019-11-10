package typings.ts3DashNodejsDashLibrary.libTransportTeamSpeakQueryMod

import typings.node.eventsMod.EventEmitter
import typings.ts3DashNodejsDashLibrary.libTeamSpeakMod.ConnectionParams
import typings.ts3DashNodejsDashLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.executeArgs
import typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.QueryResponseTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/transport/TeamSpeakQuery", "TeamSpeakQuery")
@js.native
class TeamSpeakQuery_ protected () extends EventEmitter {
  def this(config: ConnectionParams) = this()
  var active: js.Any = js.native
  var config: js.Any = js.native
  var connected: js.Any = js.native
  val doubleEvents: js.Array[String] = js.native
  var floodTimeout: js.Any = js.native
  /** handles socket closing */
  var handleClose: js.Any = js.native
  /** gets called when the underlying transport layer connects to a server */
  var handleConnect: js.Any = js.native
  /**
    * Emits an Error which the given arguments
    * @param {...any} args arguments which gets passed to the error event
    */
  var handleError: js.Any = js.native
  /** handles a single line response from the teamspeak server */
  var handleLine: js.Any = js.native
  /** handles the error line which finnishes a command */
  var handleQueryError: js.Any = js.native
  /**
    * Handles an event which has been received from the TeamSpeak Server
    * @param line event response line from the teamspeak server
    */
  var handleQueryEvent: js.Any = js.native
  var ignoreLines: js.Any = js.native
  /** handles the timer for the keepalive request */
  var keepAlive: js.Any = js.native
  var keepAliveTimeout: js.Any = js.native
  var lastEvent: js.Any = js.native
  var lastcmd: js.Any = js.native
  var queue: js.Any = js.native
  /** executes the next command */
  var queueWorker: js.Any = js.native
  /** sends data to the socket */
  var send: js.Any = js.native
  /** dispatches the keepalive */
  var sendKeepAlive: js.Any = js.native
  var socket: js.Any = js.native
  /** sends a command to the TeamSpeak Server */
  def execute(command: String, args: executeArgs*): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /** forcefully closes the socket connection */
  def forceQuit(): Unit = js.native
}

