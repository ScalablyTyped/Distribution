package typings.ts3NodejsLibrary

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.ts3NodejsLibrary.commandMod.Command
import typings.ts3NodejsLibrary.commandMod.Command.ParserCallback
import typings.ts3NodejsLibrary.commandMod.Command.flags
import typings.ts3NodejsLibrary.commandMod.Command.multiOpts
import typings.ts3NodejsLibrary.commandMod.Command.options
import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.ConnectionParams
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.Response
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.executeArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teamSpeakQueryMod {
  
  @JSImport("ts3-nodejs-library/lib/transport/TeamSpeakQuery", "TeamSpeakQuery")
  @js.native
  class TeamSpeakQuery protected () extends EventEmitter {
    def this(config: ConnectionParams) = this()
    
    var active: js.Any = js.native
    
    var config: js.Any = js.native
    
    /**
      * start connecting to the teamspeak server
      */
    def connect(): Unit = js.native
    
    var connected: js.Any = js.native
    
    val doubleEvents: js.Array[String] = js.native
    
    /** sends a command to the TeamSpeak Server */
    def execute(command: String, args: executeArgs*): js.Promise[js.Array[Response]] = js.native
    
    /** sends a priorized command to the TeamSpeak Server */
    def executePrio(command: String, args: executeArgs*): js.Promise[js.Array[Response]] = js.native
    
    var floodTimeout: js.Any = js.native
    
    /** forcefully closes the socket connection */
    def forceQuit(): Unit = js.native
    
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
    
    /** handles a flooding response from the teamspeak query */
    var handleFloodingError: js.Any = js.native
    
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
    
    def isConnected(): Boolean = js.native
    
    /** handles the timer for the keepalive request */
    var keepAlive: js.Any = js.native
    
    var keepAliveTimeout: js.Any = js.native
    
    var lastEvent: js.Any = js.native
    
    var lastcmd: js.Any = js.native
    
    def pause(pause: Boolean): this.type = js.native
    
    var pauseQueue: js.Any = js.native
    
    var queue: js.Any = js.native
    
    /** executes the next command */
    var queueWorker: js.Any = js.native
    
    /** sends data to the socket */
    var send: js.Any = js.native
    
    /** dispatches the keepalive */
    var sendKeepAlive: js.Any = js.native
    
    var socket: js.Any = js.native
  }
  /* static members */
  object TeamSpeakQuery {
    
    @JSImport("ts3-nodejs-library/lib/transport/TeamSpeakQuery", "TeamSpeakQuery")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ts3-nodejs-library/lib/transport/TeamSpeakQuery", "TeamSpeakQuery.IGNORE_LINES_INITIAL")
    @js.native
    def IGNORE_LINES_INITIAL: Double = js.native
    @scala.inline
    def IGNORE_LINES_INITIAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IGNORE_LINES_INITIAL")(x.asInstanceOf[js.Any])
    
    /** returns a constructed Socket */
    @JSImport("ts3-nodejs-library/lib/transport/TeamSpeakQuery", "TeamSpeakQuery.getSocket")
    @js.native
    def getSocket(config: ConnectionParams): QueryProtocolInterface = js.native
    
    @js.native
    trait QueryProtocolInterface extends EventEmitter {
      
      val chunk: String = js.native
      
      /** forcefully closes the socket */
      def close(): Unit = js.native
      
      /**
        * sends the data in the first argument, appends a newline
        * @param {string} str the data which should be sent
        */
      def send(data: String): Unit = js.native
      
      /** sends a keepalive to the TeamSpeak Server */
      def sendKeepAlive(): Unit = js.native
    }
    
    @js.native
    trait QueueItem extends StObject {
      
      var cmd: Command = js.native
      
      def fulfill(data: js.Any): Unit = js.native
      
      var priority: Boolean = js.native
      
      def reject(data: js.Any): Unit = js.native
    }
    object QueueItem {
      
      @scala.inline
      def apply(cmd: Command, fulfill: js.Any => Unit, priority: Boolean, reject: js.Any => Unit): QueueItem = {
        val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], fulfill = js.Any.fromFunction1(fulfill), priority = priority.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject))
        __obj.asInstanceOf[QueueItem]
      }
      
      @scala.inline
      implicit class QueueItemMutableBuilder[Self <: QueueItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCmd(value: Command): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFulfill(value: js.Any => Unit): Self = StObject.set(x, "fulfill", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPriority(value: Boolean): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReject(value: js.Any => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      }
    }
    
    type Response = js.Array[ResponseEntry]
    
    @js.native
    trait ResponseEntry extends /* x */ StringDictionary[ValueTypes]
    object ResponseEntry {
      
      @scala.inline
      def apply(): ResponseEntry = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResponseEntry]
      }
    }
    
    type ValueTypes = js.UndefOr[Boolean | String | (js.Array[Double | String]) | Double | Response]
    
    type executeArgs = ParserCallback | multiOpts | options | flags
  }
}
