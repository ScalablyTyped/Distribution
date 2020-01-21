package typings.ts3NodejsLibrary.teamSpeakQueryMod

import typings.node.eventsMod.EventEmitter
import typings.ts3NodejsLibrary.queryResponseMod.QueryResponseTypes
import typings.ts3NodejsLibrary.teamSpeakMod.ConnectionParams
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.executeArgs
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
  /**
    * retrieves the next available queue item
    * respects priorized queue
    */
  var getNextQueueItem: js.Any = js.native
  /** handles socket closing */
  var handleClose: js.Any = js.native
  /**
    * @param command command to send
    * @param args arguments which gets parsed
    * @param prio wether this command should be handled as priority and be queued before others
    */
  var handleCommand: js.Any = js.native
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
  var pauseQueue: js.Any = js.native
  var queue: js.Any = js.native
  /** executes the next command */
  var queueWorker: js.Any = js.native
  /** sends data to the socket */
  var send: js.Any = js.native
  /** dispatches the keepalive */
  var sendKeepAlive: js.Any = js.native
  var socket: js.Any = js.native
  /**
    * start connecting to the teamspeak server
    */
  def connect(): Unit = js.native
  /** sends a command to the TeamSpeak Server */
  def execute(command: String, args: executeArgs*): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /** sends a priorized command to the TeamSpeak Server */
  def executePrio(command: String, args: executeArgs*): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /** forcefully closes the socket connection */
  def forceQuit(): Unit = js.native
  def isConnected(): Boolean = js.native
  def pause(pause: Boolean): this.type = js.native
}

