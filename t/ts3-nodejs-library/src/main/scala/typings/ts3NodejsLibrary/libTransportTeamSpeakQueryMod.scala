package typings.ts3NodejsLibrary

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak.ConnectionParams
import typings.ts3NodejsLibrary.libTransportCommandMod.Command
import typings.ts3NodejsLibrary.libTransportCommandMod.Command.ParserCallback
import typings.ts3NodejsLibrary.libTransportCommandMod.Command.flags
import typings.ts3NodejsLibrary.libTransportCommandMod.Command.multiOpts
import typings.ts3NodejsLibrary.libTransportCommandMod.Command.options
import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.Response
import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.executeArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransportTeamSpeakQueryMod {
  
  @JSImport("ts3-nodejs-library/lib/transport/TeamSpeakQuery", "TeamSpeakQuery")
  @js.native
  open class TeamSpeakQuery protected () extends EventEmitter {
    def this(config: ConnectionParams) = this()
    
    /* private */ var active: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /**
      * start connecting to the teamspeak server
      */
    def connect(): Unit = js.native
    
    /* private */ var connected: Any = js.native
    
    val doubleEvents: js.Array[String] = js.native
    
    /** sends a command to the TeamSpeak Server */
    def execute(command: String, args: executeArgs*): js.Promise[js.Array[Response]] = js.native
    
    /** sends a priorized command to the TeamSpeak Server */
    def executePrio(command: String, args: executeArgs*): js.Promise[js.Array[Response]] = js.native
    
    /* private */ var floodTimeout: Any = js.native
    
    /** forcefully closes the socket connection */
    def forceQuit(): Unit = js.native
    
    /**
      * retrieves the next available queue item
      * respects priorized queue
      */
    /* private */ var getNextQueueItem: Any = js.native
    
    /** handles socket closing */
    /* private */ var handleClose: Any = js.native
    
    /**
      * @param command command to send
      * @param args arguments which gets parsed
      * @param prio wether this command should be handled as priority and be queued before others
      */
    /* private */ var handleCommand: Any = js.native
    
    /** gets called when the underlying transport layer connects to a server */
    /* private */ var handleConnect: Any = js.native
    
    /**
      * Emits an Error which the given arguments
      * @param {...any} args arguments which gets passed to the error event
      */
    /* private */ var handleError: Any = js.native
    
    /** handles a flooding response from the teamspeak query */
    /* private */ var handleFloodingError: Any = js.native
    
    /** handles a single line response from the teamspeak server */
    /* private */ var handleLine: Any = js.native
    
    /** handles the error line which finnishes a command */
    /* private */ var handleQueryError: Any = js.native
    
    /**
      * Handles an event which has been received from the TeamSpeak Server
      * @param line event response line from the teamspeak server
      */
    /* private */ var handleQueryEvent: Any = js.native
    
    /* private */ var ignoreLines: Any = js.native
    
    def isConnected(): Boolean = js.native
    
    /** handles the timer for the keepalive request */
    /* private */ var keepAlive: Any = js.native
    
    /* private */ var keepAliveTimeout: Any = js.native
    
    /* private */ var lastEvent: Any = js.native
    
    /* private */ var lastcmd: Any = js.native
    
    def pause(pause: Boolean): this.type = js.native
    
    /* private */ var pauseQueue: Any = js.native
    
    /* private */ var queue: Any = js.native
    
    /** executes the next command */
    /* private */ var queueWorker: Any = js.native
    
    /** sends data to the socket */
    /* private */ var send: Any = js.native
    
    /** dispatches the keepalive */
    /* private */ var sendKeepAlive: Any = js.native
    
    /* private */ var socket: Any = js.native
  }
  /* static members */
  object TeamSpeakQuery {
    
    @JSImport("ts3-nodejs-library/lib/transport/TeamSpeakQuery", "TeamSpeakQuery")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ts3-nodejs-library/lib/transport/TeamSpeakQuery", "TeamSpeakQuery.IGNORE_LINES_INITIAL")
    @js.native
    def IGNORE_LINES_INITIAL: Double = js.native
    inline def IGNORE_LINES_INITIAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IGNORE_LINES_INITIAL")(x.asInstanceOf[js.Any])
    
    /** returns a constructed Socket */
    inline def getSocket(config: ConnectionParams): QueryProtocolInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("getSocket")(config.asInstanceOf[js.Any]).asInstanceOf[QueryProtocolInterface]
    
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
    
    trait QueueItem extends StObject {
      
      var cmd: Command
      
      def fulfill(data: Any): Unit
      
      var priority: Boolean
      
      def reject(data: Any): Unit
    }
    object QueueItem {
      
      inline def apply(cmd: Command, fulfill: Any => Unit, priority: Boolean, reject: Any => Unit): QueueItem = {
        val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], fulfill = js.Any.fromFunction1(fulfill), priority = priority.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject))
        __obj.asInstanceOf[QueueItem]
      }
      
      extension [Self <: QueueItem](x: Self) {
        
        inline def setCmd(value: Command): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
        
        inline def setFulfill(value: Any => Unit): Self = StObject.set(x, "fulfill", js.Any.fromFunction1(value))
        
        inline def setPriority(value: Boolean): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
        
        inline def setReject(value: Any => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      }
    }
    
    type Response = js.Array[ResponseEntry]
    
    trait ResponseEntry
      extends StObject
         with /* x */ StringDictionary[ValueTypes]
    object ResponseEntry {
      
      inline def apply(): ResponseEntry = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResponseEntry]
      }
    }
    
    type ValueTypes = js.UndefOr[Boolean | String | (js.Array[Double | String]) | Double | Response]
    
    type executeArgs = ParserCallback | multiOpts | options | flags
  }
}
